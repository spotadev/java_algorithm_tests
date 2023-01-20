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
package com.spotadev.algo.blind75.linkedlist.easy.reverse_linked_list;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * https://neetcode.io/
 * https://www.youtube.com/watch?v=G0_I-ZF0S38
 * 
 * https://leetcode.com/problems/reverse-linked-list/
 * 
 *     Runtime: 0 ms, faster than 100.00% of Java online submissions for Reverse Linked List.
 *     Memory Usage: 41.9 MB, less than 86.96% of Java online submissions for Reverse Linked List.
 * 
 * Given the head of a singly linked list, reverse the list, and return the reversed list.
 * 
 * Example 1:
 * 
 *     Input: head = [1,2,3,4,5]
 *     Output: [5,4,3,2,1]
 * 
 * Example 2:
 * 
 *     Input: head = [1,2]
 *     Output: [2,1]
 * 
 * Example 3:
 * 
 *     Input: head = []
 *     Output: []
 * 
 * Constraints:
 * 
 *     The number of nodes in the list is the range [0, 5000].
 *     -5000 <= Node.val <= 5000
 * 
 * Follow up: A linked list can be reversed either iteratively or recursively. Could you 
 * implement both?
 * 
 * @author John Dickerson - 13 Jun 2022
 */
public class ReverseLinkedList_JDTest extends AbstractReverseLinkedListTest {

    @BeforeClass
    public void setUp() {

        reverseLinkedList = new ReverseLinkedList_JD();
    }


    @Test
    public void reverseListTest_1() {

        super.reverseListTest_1();
    }


    @Test
    public void reverseListTest_2() {

        super.reverseListTest_2();
    }


    @Test
    public void reverseListTest_3() {

        super.reverseListTest_3();
    }
}
