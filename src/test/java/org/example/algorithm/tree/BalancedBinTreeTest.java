package org.example.algorithm.tree;

import org.example.datastructure.tree.TreeNode;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BalancedBinTreeTest {

    @ParameterizedTest
    @MethodSource("sources")
    public void test(Integer[] vals, boolean expected) {
        var root = TreeNode.from(vals);
        assertEquals(expected, new BalancedBinTree().isBalanced(root));
    }

    private static Stream<Arguments> sources() {
        return Stream.of(
            Arguments.of(new Integer[]{3,9,20,null,null,15,7}, true),
            Arguments.of(new Integer[]{1,2,2,3,3,null,null,4,4}, false),
            Arguments.of(new Integer[]{}, true)
        );
    }
}
