package com.bridgelabz.test.MoodAnalyser;

public class MoodAnalysisException extends Exception {

	private static final long serialVerionUID = 1L;
	
	enum ExceptionType{
		ENTERED_NULL, ENTERED_EMPTY
	}
	
	ExceptionType exceptionType;
	
	public MoodAnalysisException(ExceptionType exceptionType, String message){
		super(message);
		this.exceptionType = exceptionType;
	}
}
