package com.tnz.xbox;

import java.text.MessageFormat;

public class XboxException extends RuntimeException {

	public static String MISSING_PAR = "Missing directory parameter";
	public static String MISSING_DIR = "Directory {0} does not exsist";

	private XboxException(String errMessage, Object... pars) {
		super(MessageFormat.format(errMessage, pars));
	}

	public static XboxException MissingParException() {
		return new XboxException(MISSING_PAR);
	}

	public static XboxException MissingDirException(String dir) {
		return new XboxException(MISSING_DIR, dir);
	}

}
