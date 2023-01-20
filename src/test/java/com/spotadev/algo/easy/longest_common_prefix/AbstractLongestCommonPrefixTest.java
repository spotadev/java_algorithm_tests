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
package com.spotadev.algo.easy.longest_common_prefix;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;

/**
 * https://leetcode.com/problems/longest-common-prefix
 * 
 *     Runtime: 7 ms, faster than 24.15% of Java online submissions for Longest Common Prefix.
 *     Memory Usage: 40.9 MB, less than 82.05% of Java online submissions for Longest Common Prefix.
 * 
 * Write a function to find the longest common prefix string amongst an array of strings.
 * 
 * If there is no common prefix, return an empty string "".
 * 
 * Example 1:
 * 
 *    Input: strs = [ "flower", "flow", "flight"]
 *    Output: "fl"
 * 
 * Example 2:
 * 
 *     Input: strs = [ "dog", "racecar", "car"]
 *     Output: ""
 *     Explanation: There is no common prefix among the input strings.
 * 
 * 
 * Constraints:
 * 
 *     1 <= strs.length <= 200
 *     0 <= strs[i].length <= 200
 *    strs[i] consists of only lower-case English letters.
 * 
 * @author John Dickerson - 17 Apr 2022
 */
public abstract class AbstractLongestCommonPrefixTest {

    private Logger logger = LoggerFactory.getLogger( AbstractLongestCommonPrefixTest.class );

    protected LongestCommonPrefixAPI longestCommonPrefix;

    void longestCommonPrefixTest_1() {

        String[] strs = { "flower", "flow", "flight" };
        String prefix = longestCommonPrefix.longestCommonPrefix( strs );
        logger.info( prefix );
        Assert.assertEquals( prefix, "fl" );
    }


    void longestCommonPrefixTest_2() {

        String[] strs = { "dog", "racecar", "car" };
        String prefix = longestCommonPrefix.longestCommonPrefix( strs );
        logger.info( prefix );
        Assert.assertEquals( prefix, "" );
    }

    //    public void longestCommonPrefixTest_3() {
    //
    //        String[] strs = null;
    //        String prefix = longestCommonPrefix.longestCommonPrefix( strs );
    //        Assert.assertEquals( prefix, "" );
    //    }

}
