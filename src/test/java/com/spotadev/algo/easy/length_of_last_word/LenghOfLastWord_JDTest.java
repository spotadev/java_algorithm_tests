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
package com.spotadev.algo.easy.length_of_last_word;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * https://leetcode.com/problems/length-of-last-word/
 * 
 *     Runtime: 0 ms, faster than 100.00% of Java online submissions for Length of Last Word.
 *     Memory Usage: 40.5 MB, less than 87.95% of Java online submissions for Length of Last Word.
 * 
 * Given a string s consisting of some words separated by some number of spaces, return the length 
 * of the last word in the string.
 * 
 * A word is a maximal substring consisting of non-space characters only.
 * 
 * Example 1:
 * 
 *     Input: s = "Hello World"
 *     Output: 5
 * 
 *     Explanation: The last word is "World" with length 5.
 * 
 * Example 2:
 * 
 *      Input: s = "   fly me   to   the moon  "
 *      Output: 4
 * 
 *      Explanation: The last word is "moon" with length 4.
 * 
 * Example 3:
 * 
 *     Input: s = "luffy is still joyboy"
 *     Output: 6
 * 
 *     Explanation: The last word is "joyboy" with length 6. 
 * 
 * Constraints:
 * 
 *     1 <= s.length <= 10^4
 *     s consists of only English letters and spaces ' '.
 *     There will be at least one word in s.
 * 
 * @author John Dickerson - 18 Apr 2022
 */
public class LenghOfLastWord_JDTest extends AbstractLenghOfLastWordTest {

    @BeforeClass
    public void setUp() {

        lengthOfLastWord = new LengthOfLastWord_JD();
    }


    @Test
    public void lengthOfLastWordTest_1() {

        super.lengthOfLastWordTest_1();
    }


    @Test
    public void lengthOfLastWordTest_2() {

        super.lengthOfLastWordTest_2();
    }


    @Test
    public void lengthOfLastWordTest_3() {

        super.lengthOfLastWordTest_3();
    }


    @Test
    public void lengthOfLastWordTest_4() {

        super.lengthOfLastWordTest_4();
    }
}
