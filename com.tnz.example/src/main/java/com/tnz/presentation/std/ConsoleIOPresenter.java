package com.tnz.presentation.std;

import java.util.Scanner;

import com.tnz.presentation.PresentationContext;
import com.tnz.util.StringUtil;

public abstract class ConsoleIOPresenter {

	private static Scanner scanner;
	
	/** IOC */
	private PresentationContext presentationContext;
	
	protected PresentationContext getPresentationContext() {
		return presentationContext;
	}
	
	public void setPresentationContext(PresentationContext presentationContext) {
		this.presentationContext = presentationContext;
	}
	
	/** Static Constructor */
	static {
		scanner = new Scanner(System.in);
	}

	protected String read(String inputMessage) {
		System.out.print(prepare(inputMessage));
		String x = scanner.nextLine();

		return x;
	}

	private String prepare(String message) {
		if (StringUtil.isNullOrEmpty(message)) {
			return "<NO MESSAGE>: ";
		}

		message = message.trim();
		if (message.endsWith(":")) {
			return message + " ";
		}

		return message + ": ";
	}
	
	protected void Begin() {
		System.out.println("********** " + this.getClass().getSimpleName() + " BEGIN **********");
	}
	
	protected void End() {
		System.out.println("********** " + this.getClass().getName() + " END **********");
	}
}
