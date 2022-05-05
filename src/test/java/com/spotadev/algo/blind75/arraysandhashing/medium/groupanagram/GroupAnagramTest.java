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
package com.spotadev.algo.blind75.arraysandhashing.medium.groupanagram;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.spotadev.algo.blind75.arraysandhashing.medium.groupanagram.GroupAnagram;

/**
 * @author John Dickerson - 30 Apr 2022
 */
public class GroupAnagramTest {

    private GroupAnagram groupAnagram;

    @BeforeClass
    public void setUp() {

        groupAnagram = new GroupAnagram();
    }


    @Test
    public void groupAnagramsTest_1() {

        List<List<String>> groups =
                groupAnagram.groupAnagrams(
                        new String[] { "eat", "tea", "tan", "ate", "nat", "bat" } );

        // Output: [["bat"],["nat","tan"],["ate","eat","tea"]]

        Assert.assertTrue( groups.size() == 3 );
        boolean foundListSize1 = false;
        boolean foundListSize2 = false;
        boolean foundListSize3 = false;

        for ( List<String> list : groups ) {

            if ( list.size() == 1 ) {

                list.get( 0 ).equals( "bat" );
                foundListSize1 = true;
            }
            else if ( list.size() == 2 ) {

                Set<String> expected = new HashSet<>();
                expected.add( "nat" );
                expected.add( "tan" );

                for ( String item : list ) {

                    Assert.assertTrue( expected.contains( item ) );
                }

                foundListSize2 = true;
            }
            else if ( list.size() == 3 ) {

                Set<String> expected = new HashSet<>();
                expected.add( "ate" );
                expected.add( "eat" );
                expected.add( "tea" );

                for ( String item : list ) {

                    Assert.assertTrue( expected.contains( item ) );
                }

                foundListSize3 = true;
            }
        }

        Assert.assertTrue( foundListSize1 && foundListSize2 && foundListSize3 );
    }


    @Test
    public void groupAnagramsTest_2() {

        List<List<String>> groups =
                groupAnagram.groupAnagrams(
                        new String[] { "" } );

        Assert.assertTrue( groups.size() == 1 );
        Assert.assertTrue( groups.get( 0 ).get( 0 ).equals( "" ) );
    }


    @Test
    public void groupAnagramsTest_3() {

        List<List<String>> groups =
                groupAnagram.groupAnagrams(
                        new String[] { "a" } );

        Assert.assertTrue( groups.size() == 1 );
        Assert.assertTrue( groups.get( 0 ).get( 0 ).equals( "a" ) );
    }
}
