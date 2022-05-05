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
package com.spotadev.algo.difficulty_3.substringwithconcatenationofallwords.inefficient;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 * https://leetcode.com/problems/substring-with-concatenation-of-all-words/
 * 
 * WHY THIS SOLUTION is SHIT:
 * 
 *     This solution works well for a few words but does not scale well.  The Constraints in the 
 *     question say there can be up to 30 words and those words can be added together in any 
 *     combination.  Then that combination is used to make matches in a longer string.  
 *     
 *     This solution did not pay attention to this constraint:
 *     
 *          1 <= words[i].length <= 30
 *          
 *     This constraint means that the number of possible combinations are:
 *     
 *          30! = massive number with 32 digits - i.e. trillions of trillions of combinations.
 *          
 *     This solution tries to calculate all possible combinations and then goes through each of 
 *     them and searches the string if that combination is in it.  With 30 words this would take 
 *     thousands of years to run.
 *     
 *     Therefore do not implement the solution like this.
 * 
 * 
 * QUESTION:
 * 
 * You are given a string s and an array of strings words of the same length. Return all starting 
 * indices of substring(s) in s that is a concatenation of each word in words exactly once, 
 * in any order, and without any intervening characters.
 *
 * You can return the answer in any order.
 *
 * Example 1:
 *
 * Input: s = "barfoothefoobarman", words = ["foo","bar"]
 * Output: [0,9]
 * Explanation: Substrings starting at index 0 and 9 are "barfoo" and "foobar" respectively.
 * The output order does not matter, returning [9,0] is fine too.
 * 
 * Example 2:
 *
 * Input: s = "wordgoodgoodgoodbestword", words = ["word","good","best","word"]
 * Output: []
 * Example 3:
 *
 * Input: s = "barfoofoobarthefoobarman", words = ["bar","foo","the"]
 * Output: [6,9,12]
 *
 *
 * Constraints:
 * 
 * 1 <= s.length <= 104
 * s consists of lower-case English letters.
 * 1 <= words.length <= 5000
 * 1 <= words[i].length <= 30
 * words[i] consists of lower-case English letters.
 *
 * @author John Dickerson - 7 Feb 2022
 */
public class SubstringWithConcatenationOfAllWordsInefficient {

    private List<Integer> getIndexes( String s, String uniqueCombination ) {

        List<Integer> indexes = new ArrayList<>();
        int startIndex = 0;
        int foundIndex;

        while ( ( foundIndex = s.indexOf( uniqueCombination, startIndex ) ) != -1 ) {

            indexes.add( foundIndex );
            startIndex = foundIndex + uniqueCombination.length();

            if ( startIndex >= ( s.length() - 1 ) ) {

                break;
            }
        }

        return indexes;
    }


    private void removeWord( List<String> wordListCopyCloned, String usedWord ) {

        wordListCopyCloned.remove( usedWord );
    }


    private List<String> removeWords( List<String> wordListCopy, List<String> usedWords ) {

        List<String> wordListCopyCloned = new LinkedList<>( wordListCopy );

        for ( String usedWord : usedWords ) {

            removeWord( wordListCopyCloned, usedWord );
        }

        return wordListCopyCloned;
    }


    private void addNodes(
            Node node, List<String> wordList, SortedSet<String> combinations ) {

        List<String> usedWords = node.getUsedWords();
        List<String> wordListCopy = new ArrayList<>( wordList );

        wordListCopy = removeWords( wordListCopy, usedWords );

        if ( wordListCopy.size() == 0 ) {

            // here we are on a leaf - so we have the combination
            combinations.add( node.getCombination() );
        }

        for ( String word : wordListCopy ) {

            Node newNode = new Node( node, word );
            node.add( newNode );
            addNodes( newNode, wordList, combinations );
        }
    }


    String[] getUniqueCombinations( String[] words ) {

        long nanoStart = System.nanoTime();

        try {
            // Create Tree Structure and then start at leaves and read upwards to create combinations

            //                       dummy
            //           a             
            //   b       c       d     
            // c   d    b  d    b  c   

            List<String> wordSet = new ArrayList<>();

            for ( String word : words ) {

                wordSet.add( word );
            }

            SortedSet<String> combinations = new TreeSet<>();
            Node parent = null;

            for ( String word : words ) {

                addNodes( new Node( parent, word ), wordSet, combinations );
            }

            System.out.println( "Number of unique combinations: " + combinations.size() );

            return combinations.toArray( new String[combinations.size()] );
        }
        finally {

            long nanoEnd = System.nanoTime();
            long elapsedSeconds = ( nanoEnd - nanoStart ) / 1000000000;

            System.out.println( "elapsed time Seconds to get unique combinations: "
                    + elapsedSeconds );
        }
    }


    public List<Integer> findSubstring( String s, String[] words ) {

        String[] uniqueCombinations = getUniqueCombinations( words );
        SortedSet<Integer> indexes = new TreeSet<>();

        for ( String uniqueCombination : uniqueCombinations ) {

            indexes.addAll( getIndexes( s, uniqueCombination ) );
        }

        List<Integer> integers = new ArrayList<>( indexes );
        return integers;
    }
}
