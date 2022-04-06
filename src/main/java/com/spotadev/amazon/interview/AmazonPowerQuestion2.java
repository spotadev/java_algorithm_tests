/*
    =======================================================================================
    This code is part of enigma.

    enigma is software owned by John Spouse.

    The enigma software has a proprietary license. Please look at or request
    enigma_license.txt for further details.

    Copyright (C) 2019 JS

    Email:  johnspouse@gmail.com

    ========================================================================================
    Author : John Dickerson
    ========================================================================================
*/
package com.spotadev.amazon.interview;

import java.util.List;

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
public class AmazonPowerQuestion2 {

    private static Long sum( int i1, int i2, List<Integer> powers ) {

        Long sum = 0L;

        for ( int i = i1; i <= i2; i++ ) {

            sum += powers.get( i );
        }

        return sum;
    }


    private static Integer min( int i1, int i2, List<Integer> powers ) {

        Integer min = powers.get( i1 );

        for ( int i = i1 + 1; i <= i2; i++ ) {

            if ( powers.get( i ) < min ) {

                min = powers.get( i );
            }
        }

        return min;
    }


    private static Long calculatePower( int i1, int i2, List<Integer> powers ) {

        long power = min( i1, i2, powers ) * sum( i1, i2, powers );
        return power;
    }


    public static int findTotalPower( List<Integer> powers ) {

        int n = powers.size();
        Long totalPower = 0L;

        for ( int i = 0; i < n; i++ ) {

            for ( int j = i; j < n; j++ ) {

                totalPower += calculatePower( i, j, powers );
            }
        }

        Long result = totalPower % 10000000007L;
        return result.intValue();
    }
}
