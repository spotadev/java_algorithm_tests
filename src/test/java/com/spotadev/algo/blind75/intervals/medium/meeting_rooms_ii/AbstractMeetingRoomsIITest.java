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
import java.util.List;

import org.testng.Assert;

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
 * @author John Dickerson - 13 Jun 2022
 */
public abstract class AbstractMeetingRoomsIITest {

    protected MeetingRoomsIIAPI meetingRoomsII;

    void minMeetingRooms_1Test() {

        List<Interval> intervals = new ArrayList<>();
        intervals.add( new Interval( 0, 30 ) );
        intervals.add( new Interval( 5, 10 ) );
        intervals.add( new Interval( 15, 20 ) );
        int numberMeetingRooms = meetingRoomsII.minMeetingRooms( intervals );
        Assert.assertEquals( numberMeetingRooms, 2 );
    }


    void minMeetingRooms_2Test() {

        List<Interval> intervals = new ArrayList<>();
        intervals.add( new Interval( 2, 7 ) );
        int numberMeetingRooms = meetingRoomsII.minMeetingRooms( intervals );
        Assert.assertEquals( numberMeetingRooms, 1 );
    }
}
