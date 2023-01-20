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
package com.spotadev.algo.blind75.tries.medium.design_add_and_search_words_data_structure;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * https://neetcode.io/
 * https://www.youtube.com/watch?v=BTf05gs_8iU
 * 
 * https://leetcode.com/problems/design-add-and-search-words-data-structure/
 * 
 *     Runtime: 830 ms, faster than 69.33% of Java online submissions for Design Add and Search 
 *     Words Data Structure.
 * 
 *     Memory Usage: 79.8 MB, less than 98.80% of Java online submissions for Design Add and Search 
 *     Words Data Structure.
 * 
 * Design a data structure that supports adding new words and finding if a string matches any 
 * previously added string.
 * 
 * Implement the WordDictionary class:
 * 
 *     WordDictionary() Initializes the object.
 * 
 *     void addWord(word) Adds word to the data structure, it can be matched later.
 * 
 *     bool search(word) Returns true if there is any string in the data structure that matches 
 *     word or false otherwise. word may contain dots '.' where dots can be matched with any letter.
 *  
 * Example:
 * 
 *     Input
 *         ["WordDictionary","addWord","addWord","addWord","search","search","search","search"]
 *         [[],["bad"],["dad"],["mad"],["pad"],["bad"],[".ad"],["b.."]]
 * 
 *     Output
 *         [null,null,null,null,false,true,true,true]
 * 
 * Explanation
 * 
 *     WordDictionary wordDictionary = new WordDictionary();
 *     wordDictionary.addWord("bad");
 *     wordDictionary.addWord("dad");
 *     wordDictionary.addWord("mad");
 *     wordDictionary.search("pad"); // return False
 *     wordDictionary.search("bad"); // return True
 *     wordDictionary.search(".ad"); // return True
 *     wordDictionary.search("b.."); // return True
 * 
 * Constraints:
 * 
 *     1 <= word.length <= 25
 *     word in addWord consists of lowercase English letters.
 *     word in search consist of '.' or lowercase English letters.
 *     There will be at most 3 dots in word for search queries.
 *     At most 104 calls will be made to addWord and search.
 * 
 * Instructions
 * 
 *      Your WordDictionary object will be instantiated and called as such:
 * 
 *          WordDictionary obj = new WordDictionary();
 *          obj.addWord(word);
 *          boolean param_2 = obj.search(word);
 * 
 * @author John Dickerson - 14 Jun 2022
 */
public class DesignAddAndSearchWordsDataStructure_JDTest extends
        AbstractDesignAddAndSearchWordsDataStructureTest {

    @BeforeClass
    public void setUp() {

        wordDictionary = new DesignAddAndSearchWordsDataStructure_JD();
    }


    @Test
    public void testingTest_1() {

        super.testingTest_1();
    }


    @Test
    public void testingTest_2() {

        super.testingTest_2();
    }


    @Test
    public void testingTest_3() {

        super.testingTest_3();
    }


    @Test
    public void testingTest_4() {

        super.testingTest_4();
    }
}
