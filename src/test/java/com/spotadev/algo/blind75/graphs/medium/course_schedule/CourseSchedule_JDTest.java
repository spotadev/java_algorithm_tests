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
package com.spotadev.algo.blind75.graphs.medium.course_schedule;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * @author John Dickerson - 13 May 2022
 */
public class CourseSchedule_JDTest extends AbstractCourseScheduleTest {

    @BeforeClass
    public void setUp() {

        courseSchedule = new CourseSchedule_JD();
    }


    @Test
    public void canFinishTest_1() {

        super.canFinishTest_1();
    }


    @Test
    public void canFinishTest_2() {

        super.canFinishTest_2();
    }
}
