package com.spotadev.theory.algo.difficulty_5.generate.combinations.array;

import org.testng.annotations.Test;

/**
 * See:
 * 
 *     https://www.baeldung.com/java-combinations-algorithm
 * 
 * Not combinations are not the same as permutations.
 * 
 * Unlike permutations, the order in which we choose the individual elements 
 * doesn't matter. Instead, we only care whether a particular element is in the 
 * selection.
 * 
 * Therefore for combinations we will not have both:
 * 
 *     1, 0
 *     0, 1
 *     
 *  Instead we will have the smallest combination only:
 *  
 *     0, 1
 *     
 *  Therefore for n = 4 and r = 2 the combinations are:
 *  
 *     0, 1
 *     0, 2
 *     0, 3
 *     1, 2
 *     1, 3
 *     2, 3
 *
 * @author John Dickerson - 5 Apr 2022
 */
public class GenerateAllCombinationsForArray_JDTest extends
        AbstractGenerateAllCombinationsForArrayTest {

    @Test
    public void getAllCombinations_4n_2r_Test() {

        super.getAllCombinations_4n_2r_Test();
    }


    @Test
    public void getAllCombinations_4n_3r_Test() {

        super.getAllCombinations_4n_3r_Test();
    }


    @Test
    public void getAllCombinations_4n_4r_Test() {

        super.getAllCombinations_4n_4r_Test();
    }
}
