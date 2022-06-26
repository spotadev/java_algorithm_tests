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
package com.spotadev.interview.japanese_internship;

/**
 * This question came from:
 * 
 *     An organisation that bridges students with japan internships (fully sponsored)
 *     
 *     Ask Miguel for further details.
 *     
 *     There was one hour to answer the question and nobody was looking at you while you did this.
 * 
 * Battleships is a game played on a rectangle board.  You are given a representation of such a 
 * board of size N (height) x  M (width) with information about the location of the ships.
 * 
 * The board is given as an arrayB whose each element is a String that corresponds to one row of 
 * the game board. Each character of each string represents a cell of the board and is either:
 * 
 *     a '#' character marking a part of a ship
 *     a '.' character representing an empty cell
 *     
 * Two cells that share a side and have a value of '#' are parts of the same ship.  Cell( X,Y ) 
 * shares a side with celss (X, Y-1_, (X, Y+1), (X-1, Y) and (X+1, Y).
 * 
 * In the Battleships game there are types of ships:
 * 
 * (i) Patrol boats of size 1: 
 * 
 *      #
 *      
 * (ii) Submarines of size 2 which come in 2 shapes:
 * 
 *      ##   # 
 *           #
 *           
 * (iii) Destroyers of size 3 which come in 6 shapes:
 * 
 *      ###  #   ##   ##   #    #
 *           #   #     #   ##  ##
 *           #  
 *             
 *  Your task is to find the number of ships of each type occurring on the board.
 *  
 *  For example on the board represented by
 *  
 *      { ".##.#", "#.#..", "#...#", "#.##." }
 *      
 *  it looks like:
 *  
 *      .DD.P
 *      D.D..
 *      D...P
 *      D.SS.
 *      
 *  So there are 2 Destroyers, 2 Patrols and 1 Submarine
 *      
 * @author John Dickerson - 23 Jun 2022
 */
public class BattleShip_MS implements BattleShipAPI {

    private boolean isValidPosition( String[] B, int i, int j ) {

        if ( i < 0 || j < 0 || i >= B.length || j >= B[i].length() || B[i].charAt( j ) == '.' ) {
            return false;
        }
        return true;
    }


    private int typeOfShip( String[] B, int i, int j ) {

        if ( B[i].charAt( j ) == '#' ) {

            B[i] = B[i].substring( 0, j ) + '.' + B[i].substring( j + 1 );
            int top = 0;
            int bottom = 0;
            int left = 0;
            int right = 0;

            if ( isValidPosition( B, i - 1, j ) ) {
                top = typeOfShip( B, i - 1, j );
            }

            if ( isValidPosition( B, i + 1, j ) ) {
                bottom = typeOfShip( B, i + 1, j );
            }

            if ( isValidPosition( B, i, j - 1 ) ) {
                left = typeOfShip( B, i, j - 1 );
            }

            if ( isValidPosition( B, i, j + 1 ) ) {
                right = typeOfShip( B, i, j + 1 );
            }

            return 1 + top + bottom + left + right;
        }

        return 0;
    }


    private Result numberOfShips( String[] B ) {

        int p = 0;
        int s = 0;
        int d = 0;
        int sum = 0;

        for ( int i = 0; i < B.length; i++ ) {

            for ( int j = 0; j < B[i].length(); j++ ) {

                if ( B[i].charAt( j ) == '#' ) {

                    sum = typeOfShip( B, i, j );

                    if ( sum == 1 ) {
                        p++;
                    }

                    if ( sum == 2 ) {
                        s++;
                    }

                    if ( sum == 3 ) {
                        d++;
                    }
                }
            }
        }

        Result result = new Result( p, s, d );
        return result;
    }


    @Override
    public Result getResult( String[] rows ) {

        Result result = numberOfShips( rows );
        return result;
    }
}
