package org.example.algorithm.arrayhash;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ContainsDuplicateTest {

    @Test
    public void test1() {
        var input = new int[]{1,2,3,1};
        assertTrue(new ContainsDuplicate().containsDuplicate(input));
    }

    @Test
    public void test2() {
        System.out.println(Integer.valueOf(1).hashCode());
        var input = new int[]{1,2,3,4};
        assertFalse(new ContainsDuplicate().containsDuplicate(input));
    }

    @Test
    public void test3() {
        var input = new int[]{1,1,1,3,3,4,3,2,4,2};
        assertTrue(new ContainsDuplicate().containsDuplicate(input));
    }
}
