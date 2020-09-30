package com.bridgelabz.test.MoodAnalyser;

public class MoodAnalyser {
	private String message;
	
	public MoodAnalyser(String message) {
		this.message = message;
	}
	
	public String analyseMood() throws MoodAnalysisException {
		try {
			if(message.length() == 0)
				throw new MoodAnalysisException(MoodAnalysisException.ExceptionType.ENTERED_EMPTY , "Exception for empty String");
			if(message.contains("Sad"))
				return "SAD";
			return "HAPPY";
		}
		catch (NullPointerException e) {
			throw new MoodAnalysisException(MoodAnalysisException.ExceptionType.ENTERED_NULL, "Exception for Null");
		}
		

	}
	

}
