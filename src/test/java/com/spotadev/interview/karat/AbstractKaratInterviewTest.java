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
