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
package com.spotadev.algo.blind75.greedy.medium.jump_game;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;

/**
 * @author John Dickerson - 15 May 2022
 */
public class JumpGameTest {

    private JumpGame jumpGame;

    @BeforeClass
    public void setUp() {

        jumpGame = new JumpGame();
    }


    public void canJumpTest_1() {

        int[] nums = {};
        boolean canJump = jumpGame.canJump( nums );
        Assert.assertTrue( canJump );
    }
}
