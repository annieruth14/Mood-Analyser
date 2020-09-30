package com.bridgelabz.test.MoodAnalyser;

import org.junit.Assert;

import org.junit.Before;
import org.junit.Test;

public class MoodAnalyserTest 
{

    @Test
    public void givenMessage_whenSad_shouldReturnSad() throws MoodAnalysisException {
    	MoodAnalyser moodAnalyser = new MoodAnalyser("I am in Sad mood");
    	String mood = moodAnalyser.analyseMood();
    	Assert.assertEquals("SAD", mood);
    }
    @Test
    public void givenMessage_whenAnyMood_shouldReturnHappy() throws MoodAnalysisException {
    	MoodAnalyser moodAnalyser = new MoodAnalyser("I am in Happy mood");
    	String mood = moodAnalyser.analyseMood();
    	Assert.assertEquals("HAPPY", mood);
    }
    @Test
    public void givenMessage_whenNull_shouldReturnException()  {
    	MoodAnalyser moodAnalyser = new MoodAnalyser(null);
    	String mood = null;
		try {
			mood = moodAnalyser.analyseMood();
		} catch (MoodAnalysisException e) {
			System.out.println(e.exceptionType);
			Assert.assertEquals(MoodAnalysisException.ExceptionType.ENTERED_NULL , e.exceptionType);
		}
    	
    }
    @Test
    public void givenMessage_whenEmpty_shouldReturnException() {
    	MoodAnalyser moodAnalyser = new MoodAnalyser("");
    	String mood = null;
		try {
			mood = moodAnalyser.analyseMood();
		} catch (MoodAnalysisException e) {
			System.out.println(e.exceptionType);
			Assert.assertEquals(MoodAnalysisException.ExceptionType.ENTERED_EMPTY , e.exceptionType);
		}
    	
    }
    
}
