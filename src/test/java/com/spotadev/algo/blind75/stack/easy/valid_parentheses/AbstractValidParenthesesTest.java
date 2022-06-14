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
package com.spotadev.algo.blind75.stack.easy.valid_parentheses;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;

/**
 * @author John Dickerson - 14 Jun 2022
 */
public abstract class AbstractValidParenthesesTest {

    private Logger logger = LoggerFactory.getLogger( ValidParentheses_JDTest.class );

    protected ValidParenthesesAPI validParentheses;

    public void isValidTest_1() {

        String s = "()";
        boolean valid = validParentheses.isValid( s );
        logger.info( valid + "" );
        Assert.assertTrue( valid );
    }


    public void isValidTest_2() {

        String s = "()[]{}";
        boolean valid = validParentheses.isValid( s );
        logger.info( valid + "" );
        Assert.assertTrue( valid );
    }


    public void isValidTest_3() {

        String s = "(]";
        boolean valid = validParentheses.isValid( s );
        logger.info( valid + "" );
        Assert.assertFalse( valid );
    }


    public void isValidTest_4() {

        String s = "[";
        boolean valid = validParentheses.isValid( s );
        logger.info( valid + "" );
        Assert.assertFalse( valid );
    }


    public void isValidTest_5() {

        String s = "([)]";
        boolean valid = validParentheses.isValid( s );
        logger.info( valid + "" );
        Assert.assertFalse( valid );
    }
}
