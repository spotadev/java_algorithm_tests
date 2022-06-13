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
 * @author John Dickerson - 19 May 2022
 */
public class MeetingRooms_JDTest extends AbstractMeetingRoomsTest {

    @BeforeClass
    public void setUp() {

        meetingRooms = new MeetingRooms_JD();
    }


    @Test
    public void canAttendMeetingsTest() {

        super.canAttendMeetingsTest();
    }
}
