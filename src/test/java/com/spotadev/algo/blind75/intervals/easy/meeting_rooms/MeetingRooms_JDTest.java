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

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

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
public class MeetingRooms_JDTest extends AbstractMeetingRoomsTest {

    @BeforeClass
    public void setUp() {

        meetingRooms = new MeetingRooms_JD();
    }


    @Test
    public void canAttendMeetings_1Test() {

        super.canAttendMeetings_1Test();
    }


    @Test
    public void canAttendMeetings_2Test() {

        super.canAttendMeetings_2Test();
    }
}
