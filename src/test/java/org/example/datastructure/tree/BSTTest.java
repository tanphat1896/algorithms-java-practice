package org.example.datastructure.tree;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class BSTTest {

    @Test
    public void makeTree() {
        var bst = new BST();
        bst.insert(6);
        bst.insert(2);
        bst.insert(9);
        bst.insert(7);
        bst.insert(4);
        assertEquals(List.of(2, 4, 6, 7, 9), bst.inorder());
    }

    @Test
    public void duplicated() {
        var bst = new BST();
        bst.insert(1);
        assertThrows(IllegalArgumentException.class, () -> bst.insert(1));
    }
}
