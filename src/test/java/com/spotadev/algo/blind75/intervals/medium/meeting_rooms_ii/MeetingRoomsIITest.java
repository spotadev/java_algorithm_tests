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

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * @author John Dickerson - 19 May 2022
 */
public class MeetingRoomsIITest {

    private MeetingRoomsII meetingRoomsII;

    @BeforeClass
    public void setUp() {

        meetingRoomsII = new MeetingRoomsII();
    }


    @Test
    public void minMeetingRoomsTest() {

        List<Interval> intervals = new ArrayList<>();
        meetingRoomsII.minMeetingRooms( intervals );
    }
}
