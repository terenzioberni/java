package com.tnz.xbox;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class XboxSaveGameIdentifier {
	private Map<String, String> map;

	public Map<String, String> getMap() {
		return map;
	}

	public XboxSaveGameIdentifier() {
		map = new HashMap<>();
	}

	public void scan(String[] args) {
		map.clear();
		if (args.length <= 0) {
			throw XboxException.MissingParException();
		}

		File dir = new File(args[0]);

		if (!dir.exists()) {
			throw XboxException.MissingDirException(args[0]);
		}

		File[] subfiles = dir.listFiles();
		for (File file : subfiles) {
			process(file);
		}
	}

	private static String TMXBX = "TitleMeta.xbx";

	private void process(File dir) {
		if (!dir.isDirectory()) {
			return;
		}

		File[] files = dir.listFiles((f, n) -> {
			return TMXBX.compareToIgnoreCase(n) == 0;
		});

		for (File file : files) {
			BufferedReader br = null;
			try {
				br = new BufferedReader(new FileReader(file));
				String line = br.readLine();
				int idx = line.indexOf("=");
				if (idx >= 0) {
					map.put(dir.getName(), line.substring(idx + 1));
				}
			} catch (FileNotFoundException e) {
				throw new RuntimeException(e);
			} catch (IOException e) {
				throw new RuntimeException(e);
			} finally {
				if (br != null) {
					try {
						br.close();
					} catch (IOException e) {
					}
				}
			}
		}
	}
}
