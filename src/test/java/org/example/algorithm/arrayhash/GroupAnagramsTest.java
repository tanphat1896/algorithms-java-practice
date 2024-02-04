package org.example.algorithm.arrayhash;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.Comparator;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class GroupAnagramsTest {

    @Test
    public void test1() {
        var ga = new GroupAnagrams();
        var actual = ga.groupAnagrams(new String[]{"eat", "tea", "tan", "ate", "nat", "bat"}).stream()
            .sorted(Comparator.comparingInt(List::size)).toList();
        var expected = List.of(
            List.of("bat"),
            List.of("nat", "tan"),
            List.of("ate", "eat", "tea")
        );

        for (int i = 0; i < expected.size(); i++) {
            assertThat(actual.get(i)).containsExactlyInAnyOrder(expected.get(i).toArray(new String[]{}));
        }
    }

    @Test
    public void test2() {
        var ga = new GroupAnagrams();
        assertEquals(
            List.of(List.of("")),
            ga.groupAnagrams(new String[]{""})
        );
    }

    @Test
    public void test3() {
        var ga = new GroupAnagrams();
        assertEquals(
            List.of(List.of("a")),
            ga.groupAnagrams(new String[]{"a"})
        );
    }

}
