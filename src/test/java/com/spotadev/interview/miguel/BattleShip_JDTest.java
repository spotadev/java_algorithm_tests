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
package com.spotadev.interview.miguel;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * @author John Dickerson - 23 Jun 2022
 */
public class BattleShip_JDTest extends AbstractBattleShipTest {

    @BeforeClass
    public void setUp() {

        battleShip = new BattleShip_JD();
    }


    @Test
    public void getResultTest_1() {

        super.getResultTest_1();
    }
}
