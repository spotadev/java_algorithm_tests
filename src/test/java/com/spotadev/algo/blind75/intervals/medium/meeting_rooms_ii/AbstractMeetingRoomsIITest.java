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

/**
 * @author John Dickerson - 13 Jun 2022
 */
public abstract class AbstractMeetingRoomsIITest {

    protected MeetingRoomsIIAPI meetingRoomsII;

    public void minMeetingRoomsTest() {

        List<Interval> intervals = new ArrayList<>();
        meetingRoomsII.minMeetingRooms( intervals );
    }
}