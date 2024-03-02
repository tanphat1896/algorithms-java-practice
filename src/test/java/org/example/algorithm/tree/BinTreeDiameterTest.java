package org.example.algorithm.tree;

import org.example.datastructure.tree.TreeNode;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BinTreeDiameterTest {

    @ParameterizedTest
    @MethodSource("sources")
    public void test1(Integer[] vals, int expected) {
        var root = TreeNode.from(vals);
        assertEquals(expected, new BinTreeDiameter().diameterOfBinaryTree(root));
    }

    private static Stream<Arguments> sources() {
        return Stream.of(
            Arguments.of(new Integer[]{1, 2, 3, 4, 5}, 3),
            Arguments.of(new Integer[]{1, 2}, 1),
            Arguments.of(new Integer[]{1}, 0),
            Arguments.of(new Integer[]{1, 2, null, 4, 5, null, null, 6, null, 7, null, null, null, null, null, null, null, null, null, 8}, 5)
        );
    }
}
