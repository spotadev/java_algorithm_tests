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
package com.spotadev.algo.blind75.arraysandhashing.easy.valid_anagram;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * https://neetcode.io/
 * https://www.youtube.com/watch?v=9UtInBqnCgA
 * 
 * https://leetcode.com/problems/valid-anagram/
 * 
 *     Your runtime beats 53.62 % of java submissions.
 *     Your memory usage beats 30.82 % of java submissions.
 * 
 * Given two strings s and t, return true if t is an anagram of s, and false otherwise.
 * 
 * An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, 
 * typically using all the original letters exactly once.
 * 
 *     Runtime: 6 ms, faster than 53.64% of Java online submissions for Valid Anagram.
 *     Memory Usage: 45.1 MB, less than 31.01% of Java online submissions for Valid Anagram.
 * 
 * Example 1:
 * 
 *     Input: s = "anagram", t = "nagaram"
 *     Output: true
 * 
 * Example 2:
 * 
 *     Input: s = "rat", t = "car"
 *     Output: false
 *  
 * Constraints:
 * 
 *     1 <= s.length, t.length <= 5 * 10^4
 *     s and t consist of lowercase English letters.
 * 
 * @author John Dickerson - 13 Jun 2022
 */
public class ValidAnagram_JDTest extends AbstractValidAnagramTest {

    @BeforeClass
    public void setUp() {

        validAnagram = new ValidAnagram_JD();
    }


    @Test
    public void isAnagramTest_1() {

        super.isAnagramTest_1();
    }


    @Test
    public void isAnagramTest_2() {

        super.isAnagramTest_2();
    }
}
