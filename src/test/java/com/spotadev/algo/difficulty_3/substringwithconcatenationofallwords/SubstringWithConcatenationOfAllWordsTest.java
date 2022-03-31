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
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * @author John Dickerson - 9 Feb 2022
 */
public class SubstringWithConcatenationOfAllWordsTest {

    private SubstringWithConcatenationOfAllWords substringWithConcatenationOfAllWords;

    @BeforeClass
    public void setUp() {

        substringWithConcatenationOfAllWords = new SubstringWithConcatenationOfAllWords();
    }


    @Test
    public void findSubstringTest() {

        String[] words = { "foo", "bar" };
        String s = "barfoothefoobarman";
        List<Integer> indexes = substringWithConcatenationOfAllWords.findSubstring( s, words );
        List<Integer> expectedIndexes = new ArrayList<>();
        expectedIndexes.add( 0 );
        expectedIndexes.add( 9 );
        Assert.assertEquals( indexes, expectedIndexes );
    }


    @Test
    public void findSubstringTest_duplicate_words() {

        String[] words = { "word", "good", "best", "word" };
        String s = "wordgoodgoodgoodbestword";
        List<Integer> indexes = substringWithConcatenationOfAllWords.findSubstring( s, words );
        List<Integer> expectedIndexes = new ArrayList<>();
        Assert.assertEquals( indexes, expectedIndexes );
    }


    @Test
    public void findSubstringTest_scenario_1() {

        String[] words = { "foo", "bar" };
        String s = "foobarfoobar";
        List<Integer> indexes = substringWithConcatenationOfAllWords.findSubstring( s, words );
        List<Integer> expectedIndexes = new ArrayList<>();
        expectedIndexes.add( 0 );
        expectedIndexes.add( 3 );
        expectedIndexes.add( 6 );
        Assert.assertEquals( indexes, expectedIndexes );
    }


    @Test
    public void findSubstringTest_scenario_2() {

        String[] words = { "a", "a" };
        String s = "aaa";
        List<Integer> indexes = substringWithConcatenationOfAllWords.findSubstring( s, words );
        List<Integer> expectedIndexes = new ArrayList<>();
        expectedIndexes.add( 0 );
        expectedIndexes.add( 1 );
        Assert.assertEquals( indexes, expectedIndexes );
    }


    /**
     * This solution cannot cope with so many words.  I forgot an important part of the question
     * that said:
     * 
     *     1 <= words[i].length <= 30
     *     
     * This means the number of possible combinations are:  30! which is like a 32 digit number.
     * 
     * It is simply not practical to work out all possible combinations in advance and then check
     * the string for each of them to see if a combination can be found in the String.
     */
    @Test
    public void findSubstringTest_scenario_3() {

        String[] words = { "dhvf", "sind", "ffsl", "yekr", "zwzq", "kpeo", "cila", "tfty", "modg",
                "ztjg", "ybty", "heqg", "cpwo", "gdcj", "lnle", "sefg", "vimw", "bxcb" };

        String s =
                "pjzkrkevzztxductzzxmxsvwjkxpvukmfjywwetvfnujhweiybwvvsrfequzkhossmootkmyxgjg" +
                        "fordrpapjuunmqnxxdrqrfgkrsjqbszgiqlcfnrpjlcwdrvbumtotzylshdvccdmsqoadfrpsvnw"
                        + "pizlwszrtyclhgilklydbmfhuywotjmktnwrfvizvnmfvvqfiokkdprznnnjycttprkxpuykhmpc"
                        +
                        "hiksyucbmtabiqkisgbhxngmhezrrqvayfsxauampdpxtafniiwfvdufhtwajrbkxtjzqjnfocdh"
                        +
                        "ekumttuqwovfjrgulhekcpjszyynadxhnttgmnxkduqmmyhzfnjhducesctufqbumxbamalqudei"
                        +
                        "bljgbspeotkgvddcwgxidaiqcvgwykhbysjzlzfbupkqunuqtraxrlptivshhbihtsigtpipguhb"
                        +
                        "hctcvubnhqipncyxfjebdnjyetnlnvmuxhzsdahkrscewabejifmxombiamxvauuitoltyymsarq"
                        +
                        "cuuoezcbqpdaprxmsrickwpgwpsoplhugbikbkotzrtqkscekkgwjycfnvwfgdzogjzjvpcvixns"
                        +
                        "qsxacfwndzvrwrycwxrcismdhqapoojegggkocyrdtkzmiekhxoppctytvphjynrhtcvxcobxbcj"
                        +
                        "jivtfjiwmduhzjokkbctweqtigwfhzorjlkpuuliaipbtfldinyetoybvugevwvhhhweejogrghll"
                        +
                        "souipabfafcxnhukcbtmxzshoyyufjhzadhrelweszbfgwpkzlwxkogyogutscvuhcllphshivnot"
                        +
                        "eztpxsaoaacgxyaztuixhunrowzljqfqrahosheukhahhbiaxqzfmmwcjxountkevsvpbzjnilwpo"
                        +
                        "ermxrtlfroqoclexxisrdhvfsindffslyekrzwzqkpeocilatftymodgztjgybtyheqgcpwogdcjln"
                        +
                        "lesefgvimwbxcbzvaibspdjnrpqtyeilkcspknyylbwndvkffmzuriilxagyerjptbgeqgebiaqnv"
                        +
                        "dubrtxibhvakcyotkfonmseszhczapxdlauexehhaireihxsplgdgmxfvaevrbadbwjbdrkfbbjjk"
                        +
                        "gcztkcbwagtcnrtqryuqixtzhaakjlurnumzyovawrcjiwabuwretmdamfkxrgqgcdgbrdbnugzec"
                        +
                        "bgyxxdqmisaqcyjkqrntxqmdrczxbebemcblftxplafnyoxqimkhcykwamvdsxjezkpgdpvopddptdf"
                        +
                        "bprjustquhlazkjfluxrzopqdstulybnqvyknrchbphcarknnhhovweaqawdyxsqsqahkepluypwrzj"
                        +
                        "egqtdoxfgzdkydeoxvrfhxusrujnmjzqrrlxglcmkiykldbiasnhrjbjekystzilrwkzhontwmehrfs"
                        +
                        "rzfaqrbbxncphbzuuxeteshyrveamjsfiaharkcqxefghgceeixkdgkuboupxnwhnfigpkwnqdvzlyd"
                        +
                        "pidcljmflbccarbiegsmweklwngvygbqpescpeichmfidgsjmkvkofvkuehsmkkbocgejoiqcnafvuo"
                        +
                        "kelwuqsgkyoekaroptuvekfvmtxtqshcwsztkrzwrpabqrrhnlerxjojemcxel";

        Long nanoStart = System.nanoTime();
        List<Integer> indexes = substringWithConcatenationOfAllWords.findSubstring( s, words );
        Long nanoEnd = System.nanoTime();

        Long elapsedTimeSeconds = ( nanoEnd - nanoStart ) / 1000000000;
        System.out.println( "Seconds Taken: " + elapsedTimeSeconds );

        for ( Integer index : indexes ) {

            System.out.println( index );
        }

        //        List<Integer> expectedIndexes = new ArrayList<>();
        //        expectedIndexes.add( 0 );
        //        expectedIndexes.add( 3 );
        //        expectedIndexes.add( 6 );
        //        Assert.assertEquals( indexes, expectedIndexes );
    }
}
