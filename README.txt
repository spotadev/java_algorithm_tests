====================================================================================================
java_algorithm_tests/README.txt
====================================================================================================



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
     * Write a method which accepts an array of String as an argument. In the implementation, 
     * reverse the order of the array of Strings.  Also write a testng unit test that proves your
     * implementation works.
     *
     * Time Allocated: 10 minutes
     *
     * Difficulty: 0
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