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
package com.spotadev.algo.blind75.arraysandhashing.medium.longest_consecutive_sequence;

import org.testng.Assert;

/**
 * @author John Dickerson - 13 Jun 2022
 */
public abstract class AbstractLongestConsecutiveSequenceTest {

    protected LongestConsecutiveSequenceAPI longestConsecutiveSequence;

    public void longestConsecutiveTest_1() {

        int longest =
                longestConsecutiveSequence.longestConsecutive( new int[] { 100, 4, 200, 1, 3, 2 } );

        Assert.assertEquals( longest, 4 );
    }


    public void longestConsecutiveTest_2() {

        int longest =
                longestConsecutiveSequence.longestConsecutive( new int[] { 0, 3, 7, 2, 5, 8, 4, 6,
                        0, 1 } );

        Assert.assertEquals( longest, 9 );
    }


    public void longestConsecutiveTest_3() {

        int longest =
                longestConsecutiveSequence.longestConsecutive( new int[] {} );

        Assert.assertEquals( longest, 0 );
    }
}
