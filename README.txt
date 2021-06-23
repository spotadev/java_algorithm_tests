====================================================================================================
java_algorithm_tests/README.txt
====================================================================================================

This document describes how we should go about building up a library of Java Algorithms.  It is 
common practise for companies like turing.com to choose devs on the basis of their raw algorithmic 
java coding capability.  Turing.com takes on roughly 1% of all those who apply.

At SpotADev we see it is possible to improve one's algorithmic coding ability with practise. 

There are those however who see java algorithmic coding ability to be proportional to IQ. Let us
change that and show that practise makes perfect.


====================================================================================================
STEP 1
====================================================================================================

If you find a resource online for Java algo quetions add the url to:

    java_algorithm_tests/urls_of_online_java_algo_tests.txt
    
====================================================================================================
STEP 2
====================================================================================================
    
Then for each example add a separate text file with the question and answer and amount of time given
to code the answer under the folders:

    temp/questions_with_answers
    
or

    temp/question_with_no_answers

====================================================================================================
STEP 3
====================================================================================================

Take a file under these directories:

    temp/questions_with_answers
    temp/question_with_no_answers

and add the solution to:

    src/main/java

add the testng unit test under

    src/test/java
    
In the comments of both the solution and unit test write the question, the time allocated to provide
the solution and the difficulty

    e.g
    
    /**
     * Implement a method with the following method signature:
     * 
     *     public void reverse( T[] inData, T[] outData )
     * 
     * The data in inData should be reversed and put in outData.  Create a testng unit test to prove
     * your reverse works. You can expect inData and outData to be the same length. Also print both
     * inData and outData to the console.
     *
     * Time Allocated: 10 minutes
     *
     * Difficulty: 0
     * 
     * @author John Dickerson - 23rd Jun 2021
     */
    
Note: Please use sensible naming in the packaging:

     e.g if the example is about reversing an array and is very easy use naming like:
     
     src/main/java/com/spotadev/algo/difficulty_0/reversearray/ReverseArray.java
     src/test/java/com/spotadev/algo/difficulty_0/reversearray/ReverseArrayTest.java


Once you have completed the example remove the file under:

    temp/questions_with_answers
    temp/question_with_no_answers

Please note we are using testng and not junit for the unit tests

The main difference between using testng and junit for unit tests is that the expected and actual
are in a different order.