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
package com.spotadev.algo_daily.implement_linked_list;

import static org.testng.Assert.assertEquals;

import java.util.ArrayList;

import com.spotadev.algo_daily.implement_linked_list.LinkedListAPI.LinkedListNode;

/**
 * @author John Dickerson - 2 Jan 2023
 */
public class AbstractLinkedListTest {

    protected LinkedListAPI linkedList;

    public String listToString( LinkedListNode head ) {

        final ArrayList<String> toPrint = new ArrayList<String>();
        LinkedListNode currNode = head;

        while ( currNode != null ) {

            toPrint.add( Integer.toString( currNode.val ) );
            currNode = currNode.next;
        }

        return String.join( " -> ", toPrint );
    }


    public void prependOnlyTest() {

        linkedList.prepend( 25 );
        linkedList.prepend( 15 );
        linkedList.prepend( 5 );
        linkedList.prepend( 9 );

        assertEquals( listToString( linkedList.getHead() ), "9 -> 5 -> 15 -> 25" );
    }


    public void prependThanAppendTest() {

        linkedList.prepend( 25 );
        linkedList.prepend( 15 );
        linkedList.prepend( 5 );
        linkedList.prepend( 9 );

        linkedList.append( 15 );
        linkedList.append( 5 );
        linkedList.append( 9 );

        assertEquals( listToString( linkedList.getHead() ), "9 -> 5 -> 15 -> 25 -> 15 -> 5 -> 9" );
    }


    public void prependAppendMixedTest() {

        linkedList.prepend( 15 );
        linkedList.append( 5 );
        linkedList.prepend( 7 );
        linkedList.append( 19 );

        assertEquals( listToString( linkedList.getHead() ), "7 -> 15 -> 5 -> 19" );
    }
}
