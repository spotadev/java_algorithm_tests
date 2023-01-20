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
package com.spotadev.algo_daily.dollar_sign_deletion;

import org.testng.Assert;

/**
 * https://algodaily.com/challenges/dollar-sign-deletion
 * 
 * Given an array of strings containing alphabetical characters and certain $ characters.
 * 
 * A $ represents a DELETE action whereby the character before it is deleted
 * 
 * Each of the strings is run through a method to operate on the $ DELETE action. 
 * 
 * We want to find out if the final string is the same for all of them. For example:
 *
 * Example
 * =======
 * 
 *     input --> ["f$st", "st"]
 *     output --> true (both strings have become "st")
 *
 * Constraints
 * ===========
 * 
 *     Array input can be of any size.
 * 
 *     Every string has at least a single character
 * 
 *     The string will consist of dollar signs and lowercase alphabets.
 * 
 *     Time Complexity: O(n)
 * 
 *     Space Complexity: O(n) for a good solution, O(1) for asymptotically optimal solution
 * 
 * @author John Dickerson - 2 Jan 2023
 */
public abstract class AbstractDollarSignDeletionTest {

    protected DollarSignDeletionAPI dollarSignDeletionAPI;

    void isDollarDeleteEqual_1Test() {

        String[] array = { "f$st", "st" };
        boolean dollarDeleteEqual = dollarSignDeletionAPI.isDollarDeleteEqual( array );
        Assert.assertTrue( dollarDeleteEqual );
    }


    void getFinalStr_1Test() {

        String string = "f$st";
        String finalString = dollarSignDeletionAPI.getFinalStr( string );
        Assert.assertEquals( finalString, "st" );
    }
}
