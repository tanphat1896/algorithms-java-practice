package org.example.algorithm.arrayhash;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ValidAnagramTest {

    @ParameterizedTest
    @CsvSource({
        "anagram,nagaram,true",
        "foobar,barfoo,true",
        "a,aa,false",
        "rat,car,false",
        "nl,cx,false",
    })
    public void test(String a, String b, boolean isAnagram) {
        assertEquals(isAnagram, new ValidAnagram().isAnagram(a, b));
    }

}
