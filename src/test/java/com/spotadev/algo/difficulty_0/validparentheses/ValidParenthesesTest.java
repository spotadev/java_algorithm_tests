/*
    =======================================================================================
    This code is part of enigma.

    enigma is software owned by John Spouse.

    The enigma software has a proprietary license. Please look at or request
    enigma_license.txt for further details.

    Copyright (C) 2019 JS

    Email:  johnspouse@gmail.com

    ========================================================================================
    Author : John Dickerson
    ========================================================================================
*/
package com.spotadev.algo.difficulty_0.validparentheses;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * @author John Dickerson - 17 Apr 2022
 */
public class ValidParenthesesTest {

    private Logger logger = LoggerFactory.getLogger( ValidParenthesesTest.class );

    private ValidParentheses validParentheses;

    @BeforeClass
    public void setUp() {

        validParentheses = new ValidParentheses();
    }


    @Test
    public void isValidTest_1() {

        String s = "()";
        boolean valid = validParentheses.isValid( s );
        logger.info( valid + "" );
        Assert.assertTrue( valid );
    }


    @Test
    public void isValidTest_2() {

        String s = "()[]{}";
        boolean valid = validParentheses.isValid( s );
        logger.info( valid + "" );
        Assert.assertTrue( valid );
    }


    @Test
    public void isValidTest_3() {

        String s = "(]";
        boolean valid = validParentheses.isValid( s );
        logger.info( valid + "" );
        Assert.assertFalse( valid );
    }


    @Test
    public void isValidTest_4() {

        String s = "[";
        boolean valid = validParentheses.isValid( s );
        logger.info( valid + "" );
        Assert.assertFalse( valid );
    }


    @Test
    public void isValidTest_5() {

        String s = "([)]";
        boolean valid = validParentheses.isValid( s );
        logger.info( valid + "" );
        Assert.assertFalse( valid );
    }
}
