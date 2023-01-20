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
package com.spotadev.algo.blind75.twopointers.easy.valid_palidrome;

import org.testng.Assert;

/**
 * https://neetcode.io/
 * https://www.youtube.com/watch?v=jJXJ16kPFWg
 * 
 * https://leetcode.com/problems/valid-palindrome/
 * 
 * Optimised Solution
 * 
 *     Runtime: 5 ms, faster than 65.46% of Java online submissions for Valid Palindrome.
 *     Memory Usage: 43.7 MB, less than 54.31% of Java online submissions for Valid Palindrome.
 * 
 * A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and 
 * removing all non-alphanumeric characters, it reads the same forward and backward. 
 * Alphanumeric characters include letters and numbers.
 * 
 * Given a string s, return true if it is a palindrome, or false otherwise.
 * 
 * Example 1:
 * 
 *     Input: s = "A man, a plan, a canal: Panama"
 *     Output: true
 *     Explanation: "amanaplanacanalpanama" is a palindrome.
 * 
 * Example 2:
 * 
 *     Input: s = "race a car"
 *     Output: false
 *     Explanation: "raceacar" is not a palindrome.
 * 
 * Example 3:
 * 
 *     Input: s = " "
 *     Output: true
 *     Explanation: s is an empty string "" after removing non-alphanumeric characters.
 *     Since an empty string reads the same forward and backward, it is a palindrome.
 * 
 * Constraints:
 * 
 *     1 <= s.length <= 2 * 10^5
 *     s consists only of printable ASCII characters.
 * 
 * @author John Dickerson - 14 Jun 2022
 */
public abstract class AbstractValidPalindromeTest {

    protected ValidPalindromeAPI validPalindrome;

    public void isPalindromeTest_1() {

        boolean isPalindrome = validPalindrome.isPalindrome( "A man, a plan, a canal: Panama" );
        Assert.assertTrue( isPalindrome );
    }


    void isPalindromeTest_2() {

        boolean isPalindrome = validPalindrome.isPalindrome( "race a car" );
        Assert.assertFalse( isPalindrome );
    }


    void isPalindromeTest_3() {

        boolean isPalindrome = validPalindrome.isPalindrome( " " );
        Assert.assertTrue( isPalindrome );
    }


    void isPalindromeTest_4() {

        boolean isPalindrome = validPalindrome.isPalindrome( ".," );
        Assert.assertTrue( isPalindrome );
    }


    void isPalindromeTest_5() {

        boolean isPalindrome = validPalindrome.isPalindrome( "0P" );
        Assert.assertFalse( isPalindrome );
    }


    void isPalindromeTest_6() {

        boolean isPalindrome = validPalindrome.isPalindrome( "0z;z   ; 0" );
        Assert.assertTrue( isPalindrome );
    }


    void isPalindromeTest_7() {

        boolean isPalindrome = validPalindrome.isPalindrome( "!!!::vrTTr::v!!!" );
        Assert.assertTrue( isPalindrome );
    }
}
