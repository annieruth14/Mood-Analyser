package com.bridgelabz.test.MoodAnalyser;

import static org.junit.Assert.assertTrue;

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
}
