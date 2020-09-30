package com.bridgelabz.test.MoodAnalyser;

public class MoodAnalyser {
	private String message;
	
	public MoodAnalyser(String message) {
		this.message = message;
	}
	
	public String analyseMood() {
		try {
			if(message.contains("Sad"))
				return "SAD";
			else
				return "HAPPY";
		}
		catch (Exception e) {
			System.out.println("This is Exception case");
			return  "HAPPY";
		}
		

	}
	

}
