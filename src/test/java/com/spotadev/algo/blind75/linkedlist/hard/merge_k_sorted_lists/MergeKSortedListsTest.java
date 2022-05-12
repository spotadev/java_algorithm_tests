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
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * @author John Dickerson - 6 Feb 2022
 */
public class MergeKSortedListsTest {

    private MergeKSortedLists mergeKSortedLists;

    @BeforeClass
    public void setUp() {

        mergeKSortedLists = new MergeKSortedLists();
    }


    private ListNode getListNode( int[] intArray ) {

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

        ListNode[] listNodes = new ListNode[ints.length];
        int i = 0;

        for ( int[] intArray : ints ) {

            listNodes[i++] = getListNode( intArray );
        }

        return listNodes;
    }


    private void assertEqual( ListNode merged, int[] expectedOutput ) {

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


    @Test
    public void mergeKListsTest() {

        int[][] ints = { { 1, 4, 5 }, { 1, 3, 4 }, { 2, 6 } };
        int[] output = { 1, 1, 2, 3, 4, 4, 5, 6 };
        ListNode[] lists = getListNodes( ints );
        ListNode merged = mergeKSortedLists.mergeKLists( lists );
        assertEqual( merged, output );
    }
}
