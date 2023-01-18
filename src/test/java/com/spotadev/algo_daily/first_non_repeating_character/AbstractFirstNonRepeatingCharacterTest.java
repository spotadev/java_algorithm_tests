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
package com.spotadev.algo_daily.first_non_repeating_character;

import org.testng.Assert;

/**
 * @author John Dickerson - 2 Jan 2023
 */
public abstract class AbstractFirstNonRepeatingCharacterTest {

    protected FirstNonRepeatingCharacterAPI firstNonRepeatingCharacterAPI;

    void firstNonRepeat_1Test() {

        String string = "asdfsdafdasfjdfsafnnunl";
        char c = firstNonRepeatingCharacterAPI.firstNonRepeat( string );
        Assert.assertEquals( c, 'j' );
    }
}
