package com.bridgelabz.test.MoodAnalyser;

public class MoodAnalyser {

	public void WelcomeMessage() {
		System.out.println("Welcome to Mood Analyser");
	}

	public String analyseMood(String message) {
		if(message.contains("Sad"))
			return "SAD";
		else
			return "HAPPY";

	}
	

}
