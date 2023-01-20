/*
    ================================================================================================
    This code is part of java_algorith_tests which is an effort of SpotADev

    java_algorith_tests is used for getting SpotADev devs up to speed so they can pass tests on
    java algorithms.
    
    Copyright (C) 2021 java_algorith_tests

    ================================================================================================
    Author : John Dickerson
    ================================================================================================
*/
package com.spotadev.interview.karat;

import org.testng.Assert;

/**
*
* You are running a classroom and suspect that some of your students are passing around the
* answers to multiple choice questions disguised as random strings. 4
* Your task is to write a function that, given a list of words and a string, finds and returns 
* the word in the list that is scrambled up inside the string, if any exists. There will be at 
* most one matching word. The letters don't need to be in order or next to each other. The 
* letters cannot be reused.
* 
* Example:
* 
* words = ['cat', 'baby', 'dog', 'bird', 'car', 'ax']
* 
* string1 = 'tcabnihjs'
* find_embedded_word(words, string1) -> cat (the letters do not have to be in order)
* 
* string2 = 'tbcanihjs'
* find_embedded_word(words, string2) -> cat (the letters do not have to be together)
* 
* string3 = 'baykkjl'
* find_embedded_word(words, string3) -> None
* 
* string4 = 'bbabylkkj'
* find_embedded_word(words, string4) -> baby
* 
* string5 = 'ccc'
* find_embedded_word(words, string5) -> None
* 
* string6 = 'breadmaking'
* find_embedded_word(words, string6) -> bird
*  
* All Test Cases:
* find_embedded_word(words, string1) -> cat
* find_embedded_word(words, string2) -> cat
* find_embedded_word(words, string3) -> None
* find_embedded_word(words, string4) -> baby
* find_embedded_word(words, string5) -> None
* find_embedded_word(words, string6) -> bird
* 
* Complexity analysis variables: 36
* 
*     W = number of words in `words`
*     S = maximal length of each word or string
* 
* @author John Dickerson - 23 Jun 2022
*/
public abstract class AbstractKaratInterviewTest {

    private String[] words = { "cat", "baby", "dog", "bird", "car", "ax" };

    protected KaratInterviewAPI karatInterview = new KaratInterview_JD();

    void findWordtest_1() {

        String string = "tcabnihjs";
        String result = karatInterview.findWord( string, words );
        Assert.assertEquals( result, "cat" );
    }


    void findWordtest_2() {

        String string = "tbcanihjs";
        String result = karatInterview.findWord( string, words );
        Assert.assertEquals( result, "cat" );
    }


    void findWordtest_3() {

        String string = "baykkjl";
        String result = karatInterview.findWord( string, words );
        Assert.assertNull( result );
    }


    void findWordtest_4() {

        String string = "bbabylkkj";
        String result = karatInterview.findWord( string, words );
        Assert.assertEquals( result, "baby" );
    }


    void findWordtest_5() {

        String string = "ccc";
        String result = karatInterview.findWord( string, words );
        Assert.assertNull( result );
    }


    void findWordtest_6() {

        String string = "breadmaking";
        String result = karatInterview.findWord( string, words );
        Assert.assertEquals( result, "bird" );
    }
}
