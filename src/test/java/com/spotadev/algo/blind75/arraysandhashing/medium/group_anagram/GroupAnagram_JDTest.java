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
package com.spotadev.algo.blind75.arraysandhashing.medium.group_anagram;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * https://neetcode.io/
 * https://www.youtube.com/watch?v=vzdNOK2oB2E
 * 
 * https://leetcode.com/problems/group-anagrams/
 * 
 *     Your runtime beats 93.50 % of java submissions.
 *     Your memory usage beats 96.57 % of java submissions.
 * 
 * Given an array of strings strs, group the anagrams together. You can return the answer in 
 * any order.
 * 
 * An Anagram is a word or phrase formed by rearranging the letters of a different word or 
 * phrase, typically using all the original letters exactly once.
 * 
 *     Runtime: 6 ms, faster than 93.40% of Java online submissions for Group Anagrams.
 *     Memory Usage: 45.1 MB, less than 96.62% of Java online submissions for Group Anagrams.
 *     
 * Example 1:
 *
 *     Input: strs = ["eat","tea","tan","ate","nat","bat"]
 *     Output: [["bat"],["nat","tan"],["ate","eat","tea"]]
 * 
 * Example 2:
 * 
 *     Input: strs = [""]
 *     Output: [[""]]
 * 
 * Example 3:
 * 
 *     Input: strs = ["a"]
 *     Output: [["a"]]
 * 
 * @author John Dickerson - 30 Apr 2022
 */
public class GroupAnagram_JDTest extends AbstractGroupAnagramTest {

    @BeforeClass
    public void setUp() {

        groupAnagram = new GroupAnagram_JD();
    }


    @Test
    public void groupAnagramsTest_1() {

        super.groupAnagramsTest_1();
    }


    @Test
    public void groupAnagramsTest_2() {

        super.groupAnagramsTest_2();
    }


    @Test
    public void groupAnagramsTest_3() {

        super.groupAnagramsTest_3();
    }
}
