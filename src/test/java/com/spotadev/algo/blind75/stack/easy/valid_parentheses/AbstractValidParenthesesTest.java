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
 * https://neetcode.io/
 * https://www.youtube.com/watch?v=WTzjTskDFMg
 * 
 * https://leetcode.com/problems/valid-parentheses/
 * 
 *      Runtime: 1 ms, faster than 99.45% of Java online submissions for Valid Parentheses.
 *      Memory Usage: 40.3 MB, less than 85.26% of Java online submissions for Valid Parentheses.
 * 
 * Given a string s containing just the characters '(', ')', '{', '}', '[' and ']',
 * determine if the input string is valid.
 * 
 * An input string is valid if:
 * 
 *     Open brackets must be closed by the same type of brackets.
 *     Open brackets must be closed in the correct order.
 *  
 * 
 * Example 1:
 * 
 *     Input: s = "()"
 *     Output: true
 * 
 * Example 2:
 * 
 *    Input: s = "()[]{}"
 *    Output: true
 * 
 * Example 3:
 * 
 *     Input: s = "(]"
 *     Output: false
 * 
 * Constraints:
 * 
 *     1 <= s.length <= 104
 *     s consists of parentheses only '()[]{}'.
 *     
 *     author John Dickerson - 14 Jun 2022
 */
public abstract class AbstractValidParenthesesTest {

    private Logger logger = LoggerFactory.getLogger( ValidParentheses_JDTest.class );

    protected ValidParenthesesAPI validParentheses;

    void isValidTest_1() {

        String s = "()";
        boolean valid = validParentheses.isValid( s );
        logger.info( valid + "" );
        Assert.assertTrue( valid );
    }


    void isValidTest_2() {

        String s = "()[]{}";
        boolean valid = validParentheses.isValid( s );
        logger.info( valid + "" );
        Assert.assertTrue( valid );
    }


    void isValidTest_3() {

        String s = "(]";
        boolean valid = validParentheses.isValid( s );
        logger.info( valid + "" );
        Assert.assertFalse( valid );
    }


    void isValidTest_4() {

        String s = "[";
        boolean valid = validParentheses.isValid( s );
        logger.info( valid + "" );
        Assert.assertFalse( valid );
    }


    void isValidTest_5() {

        String s = "([)]";
        boolean valid = validParentheses.isValid( s );
        logger.info( valid + "" );
        Assert.assertFalse( valid );
    }
}
