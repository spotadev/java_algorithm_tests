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
package com.spotadev.algo.blind75.linkedlist.hard.merge_k_sorted_lists;

import java.util.ArrayList;
import java.util.List;

import org.testng.Assert;

/**
 * @author John Dickerson - 13 Jun 2022
 */
public abstract class AbstractMergeKSortedListsTest {

    protected MergeKSortedListsAPI mergeKSortedLists;

    private ListNode getListNode( int[] intArray ) {

        if ( intArray.length == 0 ) {

            return null;
        }

        ListNode dummy = new ListNode( -1 );
        ListNode listNode = new ListNode( intArray[0] );
        dummy.next = listNode;

        for ( int i = 1; i < intArray.length; i++ ) {

            ListNode child = new ListNode( intArray[i] );
            listNode.next = child;
            listNode = child;
        }

        ListNode listNodeToReturn = dummy.next;
        return listNodeToReturn;
    }


    private ListNode[] getListNodes( int[][] ints ) {

        List<ListNode> listNodes = new ArrayList<>();

        for ( int[] intArray : ints ) {

            ListNode listNode = getListNode( intArray );

            if ( listNode != null ) {

                listNodes.add( listNode );
            }
        }

        return listNodes.toArray( new ListNode[listNodes.size()] );
    }


    private void assertEqual( ListNode merged, int[] expectedOutput ) {

        if ( merged == null && expectedOutput.length == 0 ) {

            return;
        }

        System.out.println( "merged = " + merged );

        List<Integer> integers = new ArrayList<>();
        integers.add( merged.val );

        while ( true ) {

            ListNode child = merged.next;

            if ( child == null ) {

                break;
            }
            else {

                integers.add( child.val );
            }

            merged = child;
        }

        int[] actualOutput = new int[integers.size()];
        int i = 0;

        for ( Integer integer : integers ) {

            actualOutput[i++] = integer;
        }

        Assert.assertEquals( actualOutput, expectedOutput );
    }


    void mergeKListsTest_1() {

        int[][] ints = { { 1, 4, 5 }, { 1, 3, 4 }, { 2, 6 } };
        int[] output = { 1, 1, 2, 3, 4, 4, 5, 6 };
        ListNode[] lists = getListNodes( ints );
        ListNode merged = mergeKSortedLists.mergeKLists( lists );
        assertEqual( merged, output );
    }


    void mergeKListsTest_2() {

        int[][] ints = {};
        int[] output = {};
        ListNode[] lists = getListNodes( ints );
        ListNode merged = mergeKSortedLists.mergeKLists( lists );
        assertEqual( merged, output );
    }


    void mergeKListsTest_3() {

        int[][] ints = { {} };
        int[] output = {};
        ListNode[] lists = getListNodes( ints );
        ListNode merged = mergeKSortedLists.mergeKLists( lists );
        assertEqual( merged, output );
    }
}
