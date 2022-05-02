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
package com.spotadev.algo.difficulty_1.groupanagram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
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
public class GroupAnagram {

    public List<List<String>> groupAnagrams( String[] strs ) {

        Map<String, List<String>> anagrams = new HashMap<>();

        for ( String str : strs ) {

            char[] letters = str.toCharArray();
            Arrays.sort( letters );
            String key = new String( letters );

            List<String> group = anagrams.get( key );

            if ( group == null ) {

                group = new ArrayList<>();
                anagrams.put( key, group );
            }

            group.add( str );
        }

        return new ArrayList<>( anagrams.values() );
    }
}