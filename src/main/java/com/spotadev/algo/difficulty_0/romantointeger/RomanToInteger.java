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
package com.spotadev.algo.difficulty_0.romantointeger;

/**
 * https://leetcode.com/problems/roman-to-integer/
 * 
 *     Runtime: 2 ms, faster than 100.00% of Java online submissions for Roman to Integer.
 *     Memory Usage: 42.3 MB, less than 95.56% of Java online submissions for Roman to Integer.
 * 
 * Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.
 *
 * Symbol       Value
 * I             1
 * V             5
 * X             10
 * L             50
 * C             100
 * D             500
 * M             1000
 * 
 * For example, 2 is written as II in Roman numeral, just two one's added together. 
 * 12 is written as XII, which is simply X + II. 
 * The number 27 is written as XXVII, which is XX + V + II.
 *
 * Roman numerals are usually written largest to smallest from left to right. 
 * However, the numeral for four is not IIII. Instead, the number four is written as IV. 
 * Because the one is before the five we subtract it making four. The same principle applies to 
 * the number nine, which is written as IX. There are six instances where subtraction is used:
 *
 * I can be placed before V (5) and X (10) to make 4 and 9. 
 * X can be placed before L (50) and C (100) to make 40 and 90. 
 * C can be placed before D (500) and M (1000) to make 400 and 900.
 * 
 * Given a roman numeral, convert it to an integer.
 *
 * Example 1:
 * 
 *     Input: s = "III"
 *     Output: 3
 *     Explanation: III = 3.
 * 
 * Example 2:
 * 
 *     Input: s = "LVIII"
 *     Output: 58
 *     Explanation: L = 50, V= 5, III = 3.
 * 
 * Example 3:
 * 
 *     Input: s = "MCMXCIV"
 *     Output: 1994
 *     Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.
 *  
 * Constraints:
 * 
 *     1 <= s.length <= 15
 *     s contains only the characters ('I', 'V', 'X', 'L', 'C', 'D', 'M').
 *     It is guaranteed that s is a valid roman numeral in the range [1, 3999].
 * 
 * @author John Dickerson - 16 Apr 2022
 */
public class RomanToInteger {

    public int romanToInt( String s ) {

        char[] chars = s.toCharArray();
        char previous = 'z';

        int total = 0;

        for ( int i = 0; i < chars.length; i++ ) {

            char letter = chars[i];

            switch ( letter ) {

                case 'V':

                    total = previous == 'I' ? total + 4 - 1 : total + 5;
                    break;

                case 'X':

                    total = previous == 'I' ? total + 9 - 1 : total + 10;
                    break;

                case 'L':

                    total = previous == 'X' ? total + 40 - 10 : total + 50;
                    break;

                case 'C':
                    total = previous == 'X' ? total + 90 - 10 : total + 100;
                    break;

                case 'D':
                    total = previous == 'C' ? total + 400 - 100 : total + 500;
                    break;

                case 'M':
                    total = previous == 'C' ? total + 900 - 100 : total + 1000;
                    break;

                case 'I':
                    total = total + 1;
                    break;
            }

            previous = letter;
        }

        return total;
    }
}
