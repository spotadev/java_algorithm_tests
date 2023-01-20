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
package com.spotadev.algo.blind75.linkedlist.medium.remove_nth_node_from_end_of_list;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * https://neetcode.io/
 * https://www.youtube.com/watch?v=XVuQxVej6y8
 * 
 * https://leetcode.com/problems/remove-nth-node-from-end-of-list
 * 
 *     Runtime: 0 ms, faster than 100.00% of Java online submissions for Remove Nth Node 
 *     From End of List.
 *     
 *     Memory Usage: 40.4 MB, less than 88.58% of Java online submissions for Remove Nth 
 *     Node From End of List.
 * 
 * Given the head of a linked list, remove the nth node from the end of the list and return 
 * its head.
 * 
 * Example 1:
 * 
 *     Input: head = [1,2,3,4,5], n = 2
 *     Output: [1,2,3,5]
 * 
 * Example 2:
 * 
 *     Input: head = [1], n = 1
 *     Output: []
 * 
 * Example 3:
 * 
 *     Input: head = [1,2], n = 1
 *     Output: [1]
 *  
 * Constraints:
 * 
 *     The number of nodes in the list is sz.
 *     1 <= sz <= 30
 *     0 <= Node.val <= 100
 *     1 <= n <= sz
 * 
 * Follow up: Could you do this in one pass?
 * 
 * @author John Dickerson - 13 Jun 2022
 */
public class RemoveNthNodeFromEndOfList_JDTest extends AbstractRemoveNthNodeFromEndOfListTest {

    protected RemoveNthNodeFromEndOfListAPI removeNthNodeFromEndOfList;

    @BeforeClass
    public void setUp() {

        removeNthNodeFromEndOfList = new RemoveNthNodeFromEndOfList_JD();
    }


    @Test
    public void removeNthFromEndTest_1() {

        super.removeNthFromEndTest_1();
    }


    @Test
    public void removeNthFromEndTest_2() {

        super.removeNthFromEndTest_2();
    }


    @Test
    public void removeNthFromEndTest_3() {

        super.removeNthFromEndTest_3();
    }
}
