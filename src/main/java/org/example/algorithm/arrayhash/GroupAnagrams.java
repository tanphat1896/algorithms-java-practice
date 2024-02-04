package org.example.algorithm.arrayhash;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        var mapper = new HashMap<String, List<String>>();

        for (String str : strs) {
            var key = str.toCharArray();
            Arrays.sort(key);
            mapper.computeIfAbsent(String.valueOf(key), k -> new ArrayList<>()).add(str);
        }

        return new ArrayList<>(mapper.values());
    }
}
