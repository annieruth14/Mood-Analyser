package com.bridgelabz.test.MoodAnalyser;

import org.junit.Assert;

import org.junit.Before;
import org.junit.Test;

public class MoodAnalyserTest 
{

    @Test
    public void givenMessage_whenSad_shouldReturnSad() {
    	MoodAnalyser moodAnalyser = new MoodAnalyser("I am in Sad mood");
    	String mood = moodAnalyser.analyseMood();
    	Assert.assertEquals("SAD", mood);
    }
    @Test
    public void givenMessage_whenAnyMood_shouldReturnHappy() {
    	MoodAnalyser moodAnalyser = new MoodAnalyser("I am in Happy mood");
    	String mood = moodAnalyser.analyseMood();
    	Assert.assertEquals("HAPPY", mood);
    }
    @Test
    public void givenMessage_whenNull_shouldReturnHappy() {
    	MoodAnalyser moodAnalyser = new MoodAnalyser(null);
    	String mood = moodAnalyser.analyseMood();
    	Assert.assertEquals("HAPPY", mood);
    }
    
}
