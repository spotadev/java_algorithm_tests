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
package com.spotadev.interview.miguel;

/**
 * @author John Dickerson - 23 Jun 2022
 */
public class BattleShip_JD implements BattleShipAPI {

    private char[][] getDataAsCharArrays( String[] rows ) {

        char[][] data = new char[rows.length][];

        for ( int i = 0; i < rows.length; i++ ) {

            data[i] = rows[i].toCharArray();
        }

        return data;
    }


    private void dfs( int r, int c, String[] inProgress, char[][] data, Result result ) {

        if ( r < 0 || c < 0 || r >= data.length ||
                c >= data[0].length ||
                data[r][c] == '$' ) {

            return;
        }

        Character square = data[r][c];
        data[r][c] = '$';

        if ( square.charValue() != '.' ) {

            inProgress[0] = inProgress[0] + square.toString();

            dfs( r + 1, c, inProgress, data, result );
            dfs( r - 1, c, inProgress, data, result );
            dfs( r, c + 1, inProgress, data, result );
            dfs( r, c - 1, inProgress, data, result );
        }
    }


    @Override
    public Result getResult( String[] rows ) {

        char[][] data = getDataAsCharArrays( rows );
        Result result = new Result();
        String[] inProgress = new String[1];

        for ( int r = 0; r < data.length; r++ ) {

            for ( int c = 0; c < data[0].length; c++ ) {

                inProgress[0] = "";
                dfs( r, c, inProgress, data, result );
                result.setResult( inProgress[0] );
            }
        }

        return result;
    }
}
