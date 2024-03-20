package org.example.algorithm.tree;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Stream;

import org.example.datastructure.tree.TreeNode;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class ValidateBSTTest {

    @ParameterizedTest
    @MethodSource("sources")
    public void test(TreeNode root, boolean isValid) {
        assertEquals(isValid, new ValidateBST().isValidBST(root));
    }

    private static Stream<Arguments> sources() {
        return Stream.of(
            Arguments.of(TreeNode.from(new int[]{2, 1, 3}), true),
            Arguments.of(TreeNode.from(new int[]{2, 2, 2}), false),
            Arguments.of(TreeNode.from(new Integer[]{5, 4, 6, null, null, 3, 7}), false),
            Arguments.of(TreeNode.from(new Integer[]{5, 1, 4, null, null, 3, 6}), false)
        );
    }
}
