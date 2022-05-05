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
package com.spotadev.algo.difficulty_3.substringwithconcatenationofallwords.recursive;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 * 
 * NOTE this solution is FAILING the last test case with all the a's in them.
 * 
 * OVERVIEW:
 * 
 *     https://leetcode.com/problems/substring-with-concatenation-of-all-words/
 * 
 *     This question is about searching for a match in a String for lots of combinations of some
 *     words.
 *     
 *     Previously:
 *     
 *          I implemented a previous solution that worked fine when there were a few words.  It 
 *          worked out all possible combinations of the words and then one by one searched for them 
 *          in the String.
 *     
 *          The problem is the questions wrote:
 *     
 *              1 <= words[i].length <= 30
 *         
 *          I ignored that part of the question.  30! means the number of combinations are like 32 
 *          digits.
 *     
 *          It means it would take thousands of years to get all possible combinations and search for
 *          each combination in the String
 *          
 *     Now:
 *     
 *         Having read the question properly now.  We can now use a different strategy. Instead of
 *         calculating all possible combinations in advance we do:
 *         
 *             (i)   Search for one of the words
 *             
 *             (ii)  If we find the word then we search if the characters on the end of the word are
 *                   the start of another word.
 *             
 *             (iii) This means we do not have to try all possible combinations.  We can also do
 *                   some optimisations like group words by what letter they start with etc.
 *                   
 *     Problem with this solution:
 *     
 *         It used recursion so when given a massive data set it threw java.lang.StackOverflowError
 *         
 *         See SubstringWithConcatenationOfAllWords.findSubstringTest_scenario_4() for test that 
 *         threw StackOverflowError.    Note that on leetcode.com it passed 174 tests before failing
 *         the 175th test.  All in all there are 176 tests.
 * 
 * QUESTION:
 * 
 *     You are given a string s and an array of strings words of the same length. Return all starting 
 *     indices of substring(s) in s that is a concatenation of each word in words exactly once, 
 *     in any order, and without any intervening characters.
 *
 *     You can return the answer in any order.
 *
 * Example 1:
 *
 *     Input: s = "barfoothefoobarman", words = ["foo","bar"]
 *     Output: [0,9]
 * 
 *     Explanation: Substrings starting at index 0 and 9 are "barfoo" and "foobar" respectively.
 *     The output order does not matter, returning [9,0] is fine too.
 * 
 * Example 2:
 *
 *     Input: s = "wordgoodgoodgoodbestword", words = ["word","good","best","word"]
 *     Output: []
 * 
 * Example 3:
 *
 *     Input: s = "barfoofoobarthefoobarman", words = ["bar","foo","the"]
 *     Output: [6,9,12]
 *
 *
 * Constraints:
 * 
 *    1 <= s.length <= 104
 *    s consists of lower-case English letters.
 *    1 <= words.length <= 5000
 *    1 <= words[i].length <= 30
 *    words[i] consists of lower-case English letters.
 *    
 *    
 * Sample Data:
 * 
 *  String[] words = { "dhvf", "sind", "ffsl", "yekr", "zwzq", "kpeo", "cila", "tfty", "modg",
 *               "ztjg", "ybty", "heqg", "cpwo", "gdcj", "lnle", "sefg", "vimw", "bxcb" };
 *
 *      String s =
 *               "pjzkrkevzztxductzzxmxsvwjkxpvukmfjywwetvfnujhweiybwvvsrfequzkhossmootkmyxgjg" +
 *                       "fordrpapjuunmqnxxdrqrfgkrsjqbszgiqlcfnrpjlcwdrvbumtotzylshdvccdmsqoadfrpsvnw"
 *                       + "pizlwszrtyclhgilklydbmfhuywotjmktnwrfvizvnmfvvqfiokkdprznnnjycttprkxpuykhmpc"
 *                       + "hiksyucbmtabiqkisgbhxngmhezrrqvayfsxauampdpxtafniiwfvdufhtwajrbkxtjzqjnfocdh"
 *                       + "ekumttuqwovfjrgulhekcpjszyynadxhnttgmnxkduqmmyhzfnjhducesctufqbumxbamalqudei"
 *                       + "bljgbspeotkgvddcwgxidaiqcvgwykhbysjzlzfbupkqunuqtraxrlptivshhbihtsigtpipguhb"
 *                       + "hctcvubnhqipncyxfjebdnjyetnlnvmuxhzsdahkrscewabejifmxombiamxvauuitoltyymsarq"
 *                       + "cuuoezcbqpdaprxmsrickwpgwpsoplhugbikbkotzrtqkscekkgwjycfnvwfgdzogjzjvpcvixns"
 *                       + "qsxacfwndzvrwrycwxrcismdhqapoojegggkocyrdtkzmiekhxoppctytvphjynrhtcvxcobxbcj"
 *                       + "jivtfjiwmduhzjokkbctweqtigwfhzorjlkpuuliaipbtfldinyetoybvugevwvhhhweejogrghll"
 *                       + "souipabfafcxnhukcbtmxzshoyyufjhzadhrelweszbfgwpkzlwxkogyogutscvuhcllphshivnot"
 *                       + "eztpxsaoaacgxyaztuixhunrowzljqfqrahosheukhahhbiaxqzfmmwcjxountkevsvpbzjnilwpo"
 *                       + "ermxrtlfroqoclexxisrdhvfsindffslyekrzwzqkpeocilatftymodgztjgybtyheqgcpwogdcjln"
 *                       + "lesefgvimwbxcbzvaibspdjnrpqtyeilkcspknyylbwndvkffmzuriilxagyerjptbgeqgebiaqnv"
 *                       + "dubrtxibhvakcyotkfonmseszhczapxdlauexehhaireihxsplgdgmxfvaevrbadbwjbdrkfbbjjk"
 *                       + "gcztkcbwagtcnrtqryuqixtzhaakjlurnumzyovawrcjiwabuwretmdamfkxrgqgcdgbrdbnugzec"
 *                       + "bgyxxdqmisaqcyjkqrntxqmdrczxbebemcblftxplafnyoxqimkhcykwamvdsxjezkpgdpvopddptdf"
 *                       + "bprjustquhlazkjfluxrzopqdstulybnqvyknrchbphcarknnhhovweaqawdyxsqsqahkepluypwrzj"
 *                       + "egqtdoxfgzdkydeoxvrfhxusrujnmjzqrrlxglcmkiykldbiasnhrjbjekystzilrwkzhontwmehrfs"
 *                       + "rzfaqrbbxncphbzuuxeteshyrveamjsfiaharkcqxefghgceeixkdgkuboupxnwhnfigpkwnqdvzlyd"
 *                       + "pidcljmflbccarbiegsmweklwngvygbqpescpeichmfidgsjmkvkofvkuehsmkkbocgejoiqcnafvuo"
 *                       + "kelwuqsgkyoekaroptuvekfvmtxtqshcwsztkrzwrpabqrrhnlerxjojemcxel";
 *
 *
 * @author John Dickerson - 7 Feb 2022
 */
public class SubstringWithConcatenationOfAllWordsRecursive {

    // Key   = first letter of word
    // Value = list of words which start with that letter
    private Map<String, SortedSet<String>> dictionary = new HashMap<>();
    private List<String> allWords = new ArrayList<>();

    private void populateWordsByStartingLetter( String[] words ) {

        for ( String word : words ) {

            String startingLetter = word.substring( 0, 1 );
            SortedSet<String> wordList = dictionary.get( startingLetter );

            if ( wordList == null ) {

                wordList = new TreeSet<>();
                dictionary.put( startingLetter, wordList );
            }

            wordList.add( word );
            allWords.add( word );
        }
    }


    private void callRecursively(
            SortedSet<Integer> indexesOfMatches,
            List<String> remainingWords, int startIndexIn, int currentIndexIn,
            String matchedWord, String s ) {

        int startIndex = startIndexIn;
        int currentIndex = currentIndexIn + matchedWord.length();
        addIndexes( indexesOfMatches, remainingWords, startIndex, currentIndex, s );
    }


    private void addIndexes(
            SortedSet<Integer> indexesOfMatches,
            List<String> remainingWordsIn,
            int startIndex, int currentIndex, String s ) {

        if ( currentIndex > ( s.length() - 1 ) ) {

            return;
        }

        Character letterChar = s.charAt( currentIndex );
        SortedSet<String> words = dictionary.get( letterChar.toString() );

        if ( words != null ) {

            // check if we match on a word 
            for ( String word : words ) {

                List<String> remainingWords = new ArrayList<>( remainingWordsIn );

                int endIndex = currentIndex + word.length();

                if ( endIndex < ( s.length() + 1 ) ) {

                    String match = s.substring( currentIndex, endIndex );

                    if ( word.equals( match ) && remainingWords.contains( word ) ) {

                        remainingWords.remove( word );

                        if ( remainingWords.size() == 0 ) {

                            indexesOfMatches.add( startIndex );
                        }
                        else {

                            callRecursively(
                                    indexesOfMatches,
                                    remainingWords,
                                    startIndex,
                                    currentIndex,
                                    word,
                                    s );
                        }
                    }
                }
            }
        }
    }


    public List<Integer> findSubstring( String s, String[] words ) {

        SortedSet<Integer> indexesOfMatches = new TreeSet<>();
        populateWordsByStartingLetter( words );

        // Start from left and progress to right.  For each letter check if we have a word in the
        // dictionary which starts with that letter.  If we do check if the whole word is there.
        // If the whole word is there - call a method to check the sequence.

        for ( int i = 0; i < s.length(); i++ ) {

            List<String> remainingWords = new ArrayList<>( allWords );
            addIndexes( indexesOfMatches, remainingWords, i, i, s );
        }

        return new ArrayList<>( indexesOfMatches );
    }
}
