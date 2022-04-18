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
package com.spotadev.algo.difficulty_0.mergetwolists;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * @author John Dickerson - 17 Apr 2022
 */
public class MergeTwoListsTest {

    private MergeTwoLists mergeTwoLists;

    @BeforeClass
    public void setUp() {

        mergeTwoLists = new MergeTwoLists();
    }


    private ListNode createNode( int... values ) {

        ListNode dummy = new ListNode( -1 );
        ListNode head = dummy;

        for ( int value : values ) {

            head.next = new ListNode( value );
            head = head.next;
        }

        return dummy.next;
    }


    private int[] getNumbers( ListNode listNode ) {

        List<Integer> integers = new ArrayList<>();
        ListNode currentNode = listNode;

        while ( currentNode != null ) {

            integers.add( currentNode.val );
            currentNode = currentNode.next;
        }

        int[] ints = new int[integers.size()];

        for ( int i = 0; i < integers.size(); i++ ) {

            ints[i] = integers.get( i );
        }

        return ints;
    }


    private void assertTrue( ListNode listNode, int... values ) {

        int[] expected = getNumbers( listNode );
        Assert.assertArrayEquals( values, expected );
    }


    @Test
    public void mergeTwoListsTest_1() {

        ListNode list1 = createNode( 1, 2, 4 );
        ListNode list2 = createNode( 1, 3, 4 );
        ListNode merged = mergeTwoLists.mergeTwoLists( list1, list2 );
        assertTrue( merged, 1, 1, 2, 3, 4, 4 );

    }


    @Test
    public void mergeTwoListsTest_2() {

        ListNode list1 = createNode();
        ListNode list2 = createNode();
        ListNode merged = mergeTwoLists.mergeTwoLists( list1, list2 );
        assertTrue( merged );

    }


    @Test
    public void mergeTwoListsTest_3() {

        ListNode list1 = createNode();
        ListNode list2 = createNode( 0 );
        ListNode merged = mergeTwoLists.mergeTwoLists( list1, list2 );
        assertTrue( merged, 0 );
    }
}
