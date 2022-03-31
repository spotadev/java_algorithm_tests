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
package com.spotadev.algo.difficulty_3.substringwithconcatenationofallwords;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 * OVERVIEW:
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
 *             (ii)  If we find the word then we search if the characters on the end of the word are
 *                   the start of another word.
 *             (iii) This means we do not have to try all possible combinations.  We can also do
 *                   some optimisations like group words by what letter they start with etc.
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
public class SubstringWithConcatenationOfAllWords {

    // Key   = first letter of word
    // Value = list of words which start with that letter
    private Map<String, List<String>> dictionary = new HashMap<>();
    private List<String> allWords = new ArrayList<>();

    private void populateWordsByStartingLetter( String[] words ) {

        for ( String word : words ) {

            String startingLetter = word.substring( 0, 1 );
            List<String> wordList = dictionary.get( startingLetter );

            if ( wordList == null ) {

                wordList = new ArrayList<>();
                dictionary.put( startingLetter, wordList );
            }

            wordList.add( word );
            allWords.add( word );
        }
    }


    private Boolean wordInRemainingWords( String word, List<String> remainingWords ) {

        Boolean found = Boolean.FALSE;

        for ( String remainingWord : remainingWords ) {

            if ( remainingWord.equals( word ) ) {

                found = Boolean.TRUE;
                break;
            }
        }

        return found;
    }


    private List<String> removeWordAndClone( String word, List<String> remainingWords ) {

        List<String> clonedRemainingWords = new ArrayList<>( remainingWords );
        clonedRemainingWords.remove( word );
        return clonedRemainingWords;
    }


    private void addMatchIfFound(
            String s,
            String letter,
            int startIndex,
            int currentIndex,
            SortedSet<Integer> indexesOfMatches,
            List<String> remainingWords ) {

        if ( remainingWords.size() == 0 ) {

            indexesOfMatches.add( startIndex );
        }
        else {

            if ( letter != null ) {

                List<String> wordList = dictionary.get( letter );

                if ( wordList != null ) {

                    for ( String word : wordList ) {

                        if ( currentIndex <= s.length() && s.indexOf( word, currentIndex ) != -1 ) {

                            if ( wordInRemainingWords( word, remainingWords ) ) {

                                List<String> newRemainingWords =
                                        removeWordAndClone( word, remainingWords );

                                int newCurrentIndex = currentIndex + word.length();

                                String newLetter = null;

                                if ( newCurrentIndex + 1 == s.length() ) {

                                    newLetter = s.substring( newCurrentIndex, newCurrentIndex + 1 );
                                }

                                addMatchIfFound(
                                        s, newLetter, startIndex, newCurrentIndex,
                                        indexesOfMatches, newRemainingWords );
                            }
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
        char[] letters = s.toCharArray();
        int index = 0;

        for ( char letter : letters ) {

            List<String> remainingWords = new ArrayList<>( allWords );
            addMatchIfFound( s, letter + "", index, index, indexesOfMatches, remainingWords );
            index++;
        }

        return new ArrayList<>( indexesOfMatches );
    }
}
