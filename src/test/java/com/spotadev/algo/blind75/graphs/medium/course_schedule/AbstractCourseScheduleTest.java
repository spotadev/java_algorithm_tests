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

import org.testng.Assert;

/**
 * https://neetcode.io/
 * 
 * https://www.youtube.com/watch?v=EgI5nU9etnU
 * 
 * https://leetcode.com/problems/course-schedule/
 * 
 *     Runtime: 5 ms, faster than 83.40% of Java online submissions for Course Schedule.
 *     
 *     Memory Usage: 47.3 MB, less than 69.44% of Java online submissions for Course Schedule.
 * 
 * There are a total of numCourses courses you have to take, labeled from 0 to numCourses - 1. 
 * You are given an array prerequisites where prerequisites[i] = [ai, bi] indicates that you must 
 * take course bi first if you want to take course ai.
 * 
 * For example, the pair [0, 1], indicates that to take course 0 you have to first take course 1.
 * Return true if you can finish all courses. Otherwise, return false.
 * 
 * Example 1:
 * 
 *     Input: numCourses = 2, prerequisites = [[1,0]]
 *     Output: true
 * 
 *     Explanation: There are a total of 2 courses to take. 
 *     To take course 1 you should have finished course 0. So it is possible.
 * 
 * Example 2:
 * 
 *     Input: numCourses = 2, prerequisites = [[1,0],[0,1]]
 *     Output: false
 * 
 *     Explanation: There are a total of 2 courses to take. 
 *     To take course 1 you should have finished course 0, and to take course 0 you should 
 *     also have finished course 1. So it is impossible. 
 * 
 * Constraints:
 * 
 *     1 <= numCourses <= 2000
 *     0 <= prerequisites.length <= 5000
 *     prerequisites[i].length == 2
 *     0 <= ai, bi < numCourses
 *     All the pairs prerequisites[i] are unique.
 *     
 * @author John Dickerson - 13 Jun 2022
 */
public class AbstractCourseScheduleTest {

    protected CourseScheduleAPI courseSchedule;

    void canFinishTest_1() {

        int numCourses = 2;
        int[][] prerequisites = new int[][] { { 1, 0 } };
        boolean canFinish = courseSchedule.canFinish( numCourses, prerequisites );
        Assert.assertTrue( canFinish );
    }


    void canFinishTest_2() {

        int numCourses = 2;
        int[][] prerequisites = new int[][] { { 1, 0 }, { 0, 1 } };
        boolean canFinish = courseSchedule.canFinish( numCourses, prerequisites );
        Assert.assertFalse( canFinish );
    }
}
