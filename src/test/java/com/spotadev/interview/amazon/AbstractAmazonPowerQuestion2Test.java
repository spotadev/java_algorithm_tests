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
package com.spotadev.interview.amazon;

import java.util.ArrayList;
import java.util.List;

import org.testng.Assert;

/**
 * This question came from an Amazon hackerank interview on 5th April 2022:
 * 
 * class Result {
 * 
 *     public static int findTotalPower( List<Integer> power) {
 *          
 *          // write code here
 *     }
 * }
 * 
 * Amazon Web Service has n servers. The cache optomozationpower of the ith server is power[i].
 * 
 * The cache optimization power of a group of contiguous serves [l, r] is defined as:
 * 
 * Power[i,r] = (min power[i]) * sum of power[i]) for elements r
 * 
 * Find the sum of Power[i, r] for each possible contiguous group of servers. Since, the answer
 * can be very large, return the answer:
 * 
 *     modulo 10000000007
 *     
 * Example:
 *   
 *     power = [2,3,2,1]
 * 
 *     There are n = 4 servers.
 * 
 *     The powers of contiguous groups of servers are:
 * 
 *         Power[0, 0] = min([2]) * sum([2]) = 2 * 2 = 4
 *         Power[0, 1] = min([2,3]) * sum([2,3]) = 2 * 5 = 10;
 *         Power[0, 2] = min([2,3,2]) * sum([2,3,2]) = 2 * 7 = 14;
 *         Power[0, 3] = min([2,3,2,1]) * sum([2,3,2,1]) = 1 * 8 = 8;
 *         Power[1, 1] = min([3]) * sum([3]) = 3 * 3 = 9;
 *         Power[1, 2] = min([3,2]) * sum([3,2]) = 2 * 5 = 10;
 *         Power[1, 3] = min([3,2,1]) * sum([3,2,1]) = 1 * 6 = 6;
 *         Power[2, 2] = min([2]) * sum([2]) = 2 * 2 = 4;
 *         Power[2, 3] = min([2,1]) * sum([2,1]) = 1 * 3 = 3;
 *         Power[3, 3] = min([1]) * sum([1]) = 1 * 1 = 1;
 *      
 *    Overall sum: 69
 * 
 *    69 mod 10000000007 = 69
 * 
 * This answer passed 6 of 14 unit test cases, so it is not perfect.  The hackerank interview had
 * the failed test cases locked so we do not know why the other unit tests failed.
 * 
 * @author John Dickerson - 4 Apr 2022
 */
public class AbstractAmazonPowerQuestion2Test {

    public void findTotalPower() {

        List<Integer> powers = new ArrayList<>();
        powers.add( 2 );
        powers.add( 3 );
        powers.add( 2 );
        powers.add( 1 );
        int total = AmazonPowerQuestion2.findTotalPower( powers );
        Assert.assertEquals( total, 69 );
    }
}
