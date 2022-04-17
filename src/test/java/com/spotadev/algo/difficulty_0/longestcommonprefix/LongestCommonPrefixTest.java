/*
    =======================================================================================
    This code is part of enigma.

    enigma is software owned by John Spouse.

    The enigma software has a proprietary license. Please look at or request
    enigma_license.txt for further details.

    Copyright (C) 2019 JS

    Email:  johnspouse@gmail.com

    ========================================================================================
    Author : John Dickerson
    ========================================================================================
*/
package com.spotadev.algo.difficulty_0.longestcommonprefix;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * @author John Dickerson - 17 Apr 2022
 */
public class LongestCommonPrefixTest {

    private Logger logger = LoggerFactory.getLogger( LongestCommonPrefixTest.class );

    private LongestCommonPrefix longestCommonPrefix;

    @BeforeClass
    public void setUp() {

        longestCommonPrefix = new LongestCommonPrefix();
    }


    @Test
    public void longestCommonPrefixTest_1() {

        String[] strs = { "flower", "flow", "flight" };
        String prefix = longestCommonPrefix.longestCommonPrefix( strs );
        logger.info( prefix );
        Assert.assertEquals( prefix, "fl" );
    }


    @Test
    public void longestCommonPrefixTest_2() {

        String[] strs = { "dog", "racecar", "car" };
        String prefix = longestCommonPrefix.longestCommonPrefix( strs );
        logger.info( prefix );
        Assert.assertEquals( prefix, "" );
    }

    //    public void longestCommonPrefixTest_3() {
    //
    //        String[] strs = null;
    //        String prefix = longestCommonPrefix.longestCommonPrefix( strs );
    //        Assert.assertEquals( prefix, "" );
    //    }

}
