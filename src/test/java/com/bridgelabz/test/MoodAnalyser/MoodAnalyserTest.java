package com.bridgelabz.test.MoodAnalyser;

import org.junit.Assert;

import org.junit.Before;
import org.junit.Test;

public class MoodAnalyserTest 
{
	MoodAnalyser moodAnalyser = null;
	@Before
	public void initiate() {
		moodAnalyser = new MoodAnalyser();
	}
    @Test
    public void start()
    {
       moodAnalyser.WelcomeMessage();
    }
    @Test
    public void givenMessage_whenSad_shouldReturnSad() {
    	String mood = moodAnalyser.analyseMood("I am in Sad mood");
    	Assert.assertEquals("SAD", mood);
    }
    @Test
    public void givenMessage_whenAnyMood_shouldReturnHappy() {
    	String mood = moodAnalyser.analyseMood("I am in any mood");
    	Assert.assertEquals("HAPPY", mood);
    }
    
}
