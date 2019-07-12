package net.coderdojo;

public class Logger {
	
	String string1;
	
	public void logDebug(String input) {
		System.out.println("[Log]: " + input + ColorCodes.RESET);
	}

	public void logWarn(String input) {
		System.out.println("[Warn]: " + input + ColorCodes.RESET);
	}

	public void logErr(String input, boolean exitApp) {
		
		string1 = "";
		
		for(int i = 0; i != input.length() + 6; i++) {
			string1 = string1 + "=";
		}
		
		System.out.println(string1);
		System.out.println("[Err]: " + input + ColorCodes.RESET);
		System.out.println(string1);
		
		if(exitApp) {
			System.exit(1);
		}
	}
}
