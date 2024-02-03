package org.example.algorithm.arrayhash;

import java.util.Arrays;

public class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        var counter = new int[26];

        var sa = s.toCharArray();
        var ta = t.toCharArray();

        for (char c : sa) {
            counter[c - 'a']++;
        }

        for (char c : ta) {
            if (counter[c - 'a'] == 0) {
                return false;
            }
            counter[c - 'a']--;
        }

        return true;
    }
}
