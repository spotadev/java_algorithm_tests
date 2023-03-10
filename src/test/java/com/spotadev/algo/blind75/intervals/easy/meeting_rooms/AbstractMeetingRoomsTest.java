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
package com.spotadev.algo.blind75.intervals.easy.meeting_rooms;

import java.util.ArrayList;
import java.util.List;

import org.testng.Assert;

/**
 * https://neetcode.io/
 * https://www.youtube.com/watch?v=PaJxqZVPhbg
 * 
 * https://www.lintcode.com/problem/920/
 * 
 * Given an array of meeting time intervals consisting of start and end times 
 * [[s1,e1],[s2,e2],...] (si < ei), determine if a person could attend all meetings.
 * 
 * (0,8),(8,10) is not conflict at 8
 * 
 * Example1
 * 
 *     Input: intervals = [(0,30),(5,10),(15,20)]
 *     Output: false
 *     
 *     Explanation: 
 *         (0,30), (5,10) and (0,30),(15,20) will conflict
 * 
 * Example2
 * 
 *     Input: intervals = [(5,8),(9,15)]
 *     Output: true
 *     
 *     Explanation: 
 *         Two times will not conflict 
 * 
 * @author John Dickerson - 13 Jun 2022
 */
public abstract class AbstractMeetingRoomsTest {

    protected MeetingRoomAPI meetingRooms;

    void canAttendMeetings_1Test() {

        List<Interval> intervals = new ArrayList<>();
        intervals.add( new Interval( 0, 30 ) );
        intervals.add( new Interval( 5, 10 ) );
        intervals.add( new Interval( 15, 20 ) );
        boolean canAttendMeetings = meetingRooms.canAttendMeetings( intervals );
        Assert.assertFalse( canAttendMeetings );
    }


    void canAttendMeetings_2Test() {

        List<Interval> intervals = new ArrayList<>();
        intervals.add( new Interval( 5, 8 ) );
        intervals.add( new Interval( 9, 15 ) );
        boolean canAttendMeetings = meetingRooms.canAttendMeetings( intervals );
        Assert.assertTrue( canAttendMeetings );
    }
}
