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

/**
 * https://algodaily.com/users/sign_in?locked=true&type=course&slug=data-structures-and-algorithms
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
 * @author Karema99 - 29 Aug 2022
 */
public interface DollarSignDeletionAPI {
}
