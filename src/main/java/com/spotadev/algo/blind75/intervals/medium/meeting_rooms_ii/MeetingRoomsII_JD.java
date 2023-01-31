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
package com.spotadev.algo.blind75.intervals.medium.meeting_rooms_ii;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * https://neetcode.io/
 * https://www.youtube.com/watch?v=FdzJmTCVyJU
 * 
 * https://www.lintcode.com/problem/919/
 * 
 * Given an array of meeting time intervals consisting of start and end times [[s1,e1],[s2,e2],...] 
 * (si < ei), find the minimum number of conference rooms required.)
 * 
 * (0,8),(8,10) is not conflict at 8
 * 
 * Example1
 * 
 *     Input: intervals = [(0,30),(5,10),(15,20)]
 *     Output: 2
 *     
 *     Explanation:
 *         We need two meeting rooms
 *         room1: (0,30)
 *         room2: (5,10),(15,20)
 * 
 * Example2
 * 
 *     Input: intervals = [(2,7)]
 *     Output: 1
 *     
 *     Explanation: 
 *         Only need one meeting room
 * 
 * @author John Dickerson - 19 May 2022
 */
public class MeetingRoomsII_JD implements MeetingRoomsIIAPI {

    private int[] getStartTimes( List<Interval> intervals ) {

        List<Interval> intervalsSorted = new ArrayList<>( intervals );

        Collections.sort( intervalsSorted,
                new Comparator<Interval>() {

                    @Override
                    public int compare( Interval o1, Interval o2 ) {

                        if ( o1.start > o2.start ) {

                            return 1;
                        }
                        else if ( o1.start < o2.start ) {

                            return -1;
                        }

                        return 0;
                    }
                } );

        int[] startTimes = new int[intervals.size()];
        int i = 0;

        for ( Interval interval : intervalsSorted ) {

            startTimes[i] = interval.start;
            i++;
        }

        return startTimes;
    }


    private int[] getEndTimes( List<Interval> intervals ) {

        List<Interval> intervalsSorted = new ArrayList<>( intervals );

        Collections.sort( intervalsSorted,
                new Comparator<Interval>() {

                    @Override
                    public int compare( Interval o1, Interval o2 ) {

                        if ( o1.end > o2.end ) {

                            return 1;
                        }
                        else if ( o1.end < o2.end ) {

                            return -1;
                        }

                        return 0;
                    }
                } );

        int[] endTimes = new int[intervals.size()];
        int i = 0;

        for ( Interval interval : intervalsSorted ) {

            endTimes[i] = interval.end;
            i++;
        }

        return endTimes;
    }


    // Input: intervals = [(0,30),(5,10),(15,20)]
    // Output: 2
    @Override
    public int minMeetingRooms( List<Interval> intervals ) {

        int[] startTimes = getStartTimes( intervals );
        int[] endTimes = getEndTimes( intervals );

        int countRooms = 0;
        int start = 0;
        int end = 0;
        int maxCountRooms = 0;

        while ( start < startTimes.length ) {

            if ( startTimes[start] < endTimes[end] ) {

                countRooms++;
                start++;
            }
            else {
                end++;
                countRooms--;
            }

            maxCountRooms = Math.max( maxCountRooms, countRooms );
        }

        return maxCountRooms;
    }
}
