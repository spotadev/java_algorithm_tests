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
package com.spotadev.interview.undirected_graph;

/**
 * This question came from:
 * 
 *     An interview Miguel did
 *     
 *     Ask Miguel for further details
 *     
 * You are given an undirected graph consisting of N vertices, numbered from 1 to N, and M edges.  
 * The graph is descrived by two arrats, A and B, both of length M. A pair (A[K], B[K]) for K from
 * 0 to M-1, describes an edge between vertex A[K] and vertex B[K].
 * 
 * Your task is to assign all values from the range [1..N] to the vertices of the graph, giving
 * one number to each of the vertices. Do it in such a a way that the sum over all edges of the 
 * values at the edges endpoints is maximal.
 * 
 * For example, given 
 * 
 *     N = 5, 
 *     A = [ 2, 2, 1, 2 ]
 *     B = [ 1, 3, 4, 5 ]
 *     
 * the graph has four edges:
 * 
 *     ( 2, 1 )
 *     ( 2, 3 )
 *     ( 1, 4 )
 *     ( 2, 4 )
 *     
 * In order to obtain the maximum sum of weights, you can assign the following values to the 
 * vertices:
 * 
 *     3, 5, 2, 4, 1
 *     
 * ( to vertices 1, 2, 3, 4, 5 respectively).
 * 
 *                                       5 val=1
 *        1 val=3  \8          
 *           |      |___ 2 val=5 _____3 val=2
 *          7|      |              7
 *        4 val=4  /9
 * 
 * 
 * This way we obtain the sum of the values at all edge endpoints equal to:
 * 
 *     7 + 8 + 9 = 31
 * 
 * @author John Dickerson - 26 Jun 2022
 */
public class UndirectedGraph_MS implements UndirectedGraphAPI {
	static int maxSum;

    static int getSum(int[] nums, int[] A, int[] B) {
        int sum = 0;
        for (int j = 1; j <= A.length; j++) {
            for (int i = 0; i < A.length; i++) {
                if (A[i] == j) {
                    sum = sum + nums[j - 1];
                }
                if (B[i] == j) {
                    sum = sum + nums[j - 1];
                }
            }
        }

        return sum;
    }

    static void swap(int nums[], int l, int i) {
        int temp = nums[l];
        nums[l] = nums[i];
        nums[i] = temp;
    }

    static void permutation(int[] nums, int l, int h, int[] A, int[] B) {

        if (l == h) {
            int sum = getSum(nums, A, B);
            maxSum = Math.max(sum, maxSum);
            return;
        }

        for (int i = l; i <= h; i++) {

            swap(nums, l, i);

            permutation(nums, l + 1, h, A, B);

            swap(nums, l, i);
        }
        return;
    }

    static void permute(int[] nums, int[] A, int[] B) {

        int x = nums.length - 1;

        permutation(nums, 0, x, A, B);
        return;
    }

    public static void main(String[] args) {
        int N = 5;
        int A[] = { 2, 2, 1, 2 };
        int B[] = { 1, 3, 4, 4 };
        int[] nums = new int[A.length];
        for (int i = (N - A.length) + 1; i <= N; i++) {
            nums[i - ((N - A.length) + 1)] = i;
        }

        permute(nums, A, B);
        System.out.println(maxSum);

    }
}
