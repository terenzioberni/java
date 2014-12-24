package cmd.tnz.xbox;

import java.text.MessageFormat;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
		try {
			XboxSaveGameIdentifier xbox = new XboxSaveGameIdentifier();
			xbox.scan(args);
			printMap(xbox.getMap());
		} catch (XboxException e) {
			System.out.println(e.getMessage());
		}
	}

	public static void printMap(Map<String, String> map) {
		for (String key : map.keySet()) {
			System.out.println(MessageFormat.format("{0} - {1}", key, map.get(key)));
		}
	}
}
