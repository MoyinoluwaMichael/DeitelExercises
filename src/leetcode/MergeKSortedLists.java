package leetcode;

import java.util.ArrayList;
import java.util.List;

public class MergeKSortedLists {
    /*Input: s = "barfoothefoobarman", words = ["foo","bar"]
Output: [0,9]
Explanation: Since words.length == 2 and words[i].length == 3, the concatenated substring has to be of length 6.
The substring starting at 0 is "barfoo". It is the concatenation of ["bar","foo"] which is a permutation of words.
The substring starting at 9 is "foobar". It is the concatenation of ["foo","bar"] which is a permutation of words.
The output order does not matter. Returning [9,0] is fine too.*/

    public static List<Integer> findSubstring(String s, String[] words) {
        ArrayList<Integer> list = new ArrayList<>();
        if (s.length() < (words.length * words[0].length())) {
            return list;
        }
        for (int i = 0; i < s.length(); i++) {
            StringBuilder word = new StringBuilder();
            int count = 0;
            for (int j = i; j < (words.length * words[0].length()) + i; j++) {
                if (i + (words.length) * words[0].length() <= s.length()) {
                    word.append(s.charAt(j));
                }
            }
            ArrayList<String[]> newWords = new ArrayList<>();
            for (int index = 0; index < word.length(); index += words[0].length()) {
                StringBuilder newWord = new StringBuilder();
                for (int k = index; k < words[0].length() + index; k++) {
                    if (words[0].length() + index <= word.length()) {
                        newWord.append(word.charAt(k));
                    }
                }
                boolean isThere = false;
                for (String[] strings : newWords) {
                    if (String.valueOf(strings[0]).equals(newWord.toString())) {
                        int number = Integer.parseInt(strings[1]);
                        strings[1] = String.valueOf(++number);
                        isThere = true;
                        int counter = 0;
                        for (String value : words)
                            if (newWord.toString().equalsIgnoreCase(value)) {
                                counter++;
                                if (counter == number) {
                                    count++;
                                    break;
                                }
                            }
                    }
                }
                if (!isThere) {
                    newWords.add(new String[2]);
                    newWords.get(newWords.size() - 1)[0] = newWord.toString();
                    newWords.get(newWords.size() - 1)[1] = "1";
                    for (String value : words)
                        if (newWord.toString().equalsIgnoreCase(value)) {
                            count++;
                            break;
                        }
                }
            }
            if (count == words.length) {
                list.add(i);
            }
        }
        return list;
    }

    public static void main(String[] args) {
        String s = "bcabbcaabbccacacbabccacaababcbb";
        String[] words = {"c", "b", "a", "c", "a", "a", "a", "b", "c"};
        System.out.println(findSubstring(s, words));


    }
}
