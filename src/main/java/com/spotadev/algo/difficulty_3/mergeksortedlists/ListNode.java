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
package com.spotadev.algo.difficulty_3.mergeksortedlists;

/**
 * @author John Dickerson - 5 Feb 2022
 */
public class ListNode {

    int val;
    ListNode next;

    ListNode() {

    }


    ListNode( int val ) {

        this.val = val;
    }


    ListNode( int val, ListNode next ) {

        this.val = val;
        this.next = next;
    }


    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        sb.append( val );

        if ( next != null ) {

            sb.append( ", " );

            if ( next != null ) {

                sb.append( next.toString() );
            }
        }

        return sb.toString();
    }
}
