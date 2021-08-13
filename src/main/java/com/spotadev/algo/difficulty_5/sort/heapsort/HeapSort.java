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
package com.spotadev.algo.difficulty_5.sort.heapsort;

/**
 * Implement a method with the following method signature:
 * 
 *      public void heapSort(int[] array)
 * 
 * The data in array should be sorted to a correct ascending or descending order. Create a testng 
 * unit test to prove your heap sort works. Print both unsorted and sorted array to the console.
 *
 * The heap sort algorithm works as follows:
 * 
 * 1. A max heap is created from the input array.
 * 2. The root(max value in the array) is replaced with the last element in the array.
 *    then it is cut from the array i.e it's index is not considered during the next heapify.
 * 3. Repeats step 1 and 2 for the remaining part of the algorithm till the entire array is sorted.
 * 
 * Here is a visual representation of how it works:
 * 
 *  assume we have an array:
 *  
 *  index:   0   1   2   3  4  5  6
 *        [ 16, 12, 54, 37, 8, 2, 7 ]
 *        
 * Let's create the heap( A special tree-based data structure)
 * 
 * Key: 1. Stuff with round brackets () are the indexes of the array.
 *      2. stuff with square brackets [] are the elements of the array.
 * 
 *                         (0)
 *                         [16]
 *                      /        \
 *                    (1)       (2)
 *                    [12]      [54] 
 *                    /  \      /   \
 *                  (3)  (4)  (5)  (6)
 *                  [37] [8]  [2]  [7]
 *  
 *  Now, let's heapify the heap: i.e (the child nodes should all be less than the parent nodes)
 *  
 *                         (0)
 *                         [54]
 *                       /      \
 *                     (1)     (2)
 *                     [12]    [16]
 *                     
 *        Here, 54 is placed as the parent node as it is the largest hence swapped with 16.
 *        
 *                         (0)
 *                         [54]
 *                       /      \
 *                     (1)     (2)
 *                     [37]    [16]
 *                     /  \    /  \
 *                   (3)  (4) (5) (6)
 *                   [12] [8] [2] [7]
 *                   
 *        Here, 37 is placed as the parent node as it is the largest in that sub-tree hence swapped 
 *        with 12.
 *        
 *        Now we have a max heap!!!!. i.e (A tree where the parent nodes are largest)
 *        
 *  Next the root node i.e (largest parent node in our case 54) is swapped with the leaf node at 
 *  the largest index in our case [7]
 *   
 *  i.e
 *   
 *                         (0)
 *                         [7]
 *                       /      \
 *                     (1)     (2)
 *                     [37]    [16]
 *                     /  \    /  \
 *                   (3)  (4) (5) (6)
 *                   [12] [8] [2] [54]
 *                   
 *    The last index is then cut off (not literally) so that it cannot be included during the next 
 *    heapify
 *    
 *    i.e    
 *                          (0)
 *                         [7]
 *                       /      \
 *                     (1)     (2)
 *                     [37]    [16]
 *                     /  \    /
 *                   (3)  (4) (5)
 *                   [12] [8] [2]
 *                   
 *    Here is how the algorithm looks like currently:
 *    
 *              [ 7, 37, 16, 12, 8, 2, 54 ]
 *    
 *    We now have 54 at the last place in the algorithm where it should be as it is the largest.
 *    We then carry on to have a max heap from the remaining elements in the array then repeat the 
 *    process.
 *    
 *    i.e
 *     
 *    max heap of remaining elements:
 *    
 *                         (0)
 *                         [37]
 *                       /      \
 *                     (1)     (2)
 *                     [12]    [16]
 *                     /  \    /
 *                   (3)  (4) (5)
 *                   [7] [8] [2]
 *              
 *    swap parent with last index:
 *    
 *                         (0)
 *                         [2]
 *                       /      \
 *                     (1)     (2)
 *                     [12]    [16]
 *                     /  \    /
 *                   (3)  (4) (5)
 *                   [7] [8] [37]
 *                   
 *     Here is how the algorithm looks like currently:
 *     
 *              [ 2, 12, 16, 7, 8, 37, 54 ]
 *              
 *              
 *     max heap of remaining elements:
 *     
 *                         (0)
 *                         [16]
 *                       /      \
 *                     (1)     (2)
 *                     [12]    [2]
 *                     /  \ 
 *                   (3)  (4)
 *                   [7] [8]
 *              
 *     swap parent with last index:
 *     
 *                         (0)
 *                         [8]
 *                       /      \
 *                     (1)     (2)
 *                     [12]    [2]
 *                     /  \
 *                   (3)  (4)
 *                   [7] [16]
 *                   
 *     Here is how the algorithm looks like currently:
 *     
 *              [ 8, 12, 2, 7, 16, 37, 54 ]
 *              
 *     max heap of remaining elements:
 *     
 *                         (0)
 *                         [12]
 *                       /      \
 *                     (1)     (2)
 *                     [8]    [2]
 *                     /
 *                   (3)
 *                   [7]
 *              
 *     swap parent with last index:
 *     
 *                         (0)
 *                         [7]
 *                       /      \
 *                     (1)     (2)
 *                     [8]    [2]
 *                     /
 *                   (3)
 *                   [12]
 *                   
 *     Here is how the algorithm looks like currently:
 *     
 *              [ 7, 8, 2, 12, 16, 37, 54 ]
 *      
 *      max heap of remaining elements:
 *                         (0)
 *                         [8]
 *                       /      \
 *                     (1)     (2)
 *                     [7]    [2]
 *              
 *      swap parent with last index:
 *                         (0)
 *                         [2]
 *                       /      \
 *                     (1)     (2)
 *                     [7]    [8]
 *                    
 *      Here is how the algorithm looks like currently:
 *      
 *              [ 2, 7, 8, 12, 16, 37, 54 ]
 *              
 *      max heap of remaining elements:
 *      
 *                         (0)
 *                         [7]
 *                       /
 *                     (1)
 *                     [2]
 *              
 *      swap parent with last index:
 *      
 *                         (0)
 *                         [2]
 *                       /
 *                     (1)
 *                     [7]
 *                    
 *      Here is how the algorithm looks like currently:
 *      
 *              [ 2, 7, 8, 12, 16, 37, 54 ]
 *              
 *      We now have a sorted array!!!!
 *      
 *      [ 2, 7, 8, 12, 16, 37, 54 ]
 *                         
 * Now to the big O notation for this algorithm:
 *   
 *   Heap Sort has O(n*log n) time complexities for all the cases ( best case, average case, and 
 *   worst case).
 *   
 *   Let us understand the reason why. The height of a complete binary tree containing n elements 
 *   is log n
 *   
 *   As we have seen earlier, to fully heapify an element whose subtrees are already max-heaps, 
 *   we need to keep comparing the element with its left and right children and pushing it downwards 
 *   until it reaches a point where both its children are smaller than it.
 *   
 *   In the worst case scenario, we will need to move an element from the root to the leaf node 
 *   making a multiple of log(n) comparisons and swaps.
 *   
 *   When building the max heap, we do that for n/2 elements so the worst case complexity of the 
 *   build_heap step is n/2*log n ~ n*log n.
 *   
 *   when we exchange the root element with the last element and heapify the root element, for each 
 *   element, this again takes log n worst time because we might have to bring the element all the 
 *   way from the root to the leaf.
 *   
 *   Since we repeat this n times, the heapsort step is also nlog n.
 *   
 *   Since building max heap and heap sort steps are executed one after another, the algorithmic 
 *   complexity is not multiplied and it remains in the order of n*log n.
 *   
 * Hence time complexity of O(n*log n) for all cases.
 *    
 *                    
 *   Time Allocated: 20 minutes
 *
 *   Difficulty: 5
 * 
 * @author Kingsley Muturi - 5th July 2021
 */
public class HeapSort {

    // To heapify a subtree with node i
    private void heapify( int array[], int heapSize, int i ) {

        int largest = i; // Initialize largest as root
        int leftChildIdx = 2 * i + 1; // left = 2*i + 1
        int rightChildIdx = 2 * i + 2; // right = 2*i + 2

        // If left child is larger than root
        if ( leftChildIdx < heapSize && array[leftChildIdx] > array[largest] ) {

            largest = leftChildIdx;
        }

        // If right child is larger than largest so far
        if ( rightChildIdx < heapSize && array[rightChildIdx] > array[largest] ) {

            largest = rightChildIdx;
        }

        // If largest is not root
        if ( largest != i ) {

            int swap = array[i];
            array[i] = array[largest];
            array[largest] = swap;

            // Recursive call to  heapify the sub-tree
            heapify( array, heapSize, largest );
        }
    }


    public void heapSort( int[] array ) {

        int size = array.length;

        // Build heap
        for ( int i = size / 2 - 1; i >= 0; i-- )
            heapify( array, size, i );

        // One by one extract (Max) an element from heap and
        // replace it with the last element in the array
        for ( int i = size - 1; i >= 0; i-- ) {

            // arrA[0] is a root of the heap and is the max element in heap
            int x = array[0];
            array[0] = array[i];
            array[i] = x;

            // call max heapify on the reduced heap
            heapify( array, i, 0 );
        }
    }
}
