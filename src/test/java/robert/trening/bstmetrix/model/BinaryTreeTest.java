package robert.trening.bstmetrix.model;

import static org.junit.jupiter.api.Assertions.*;

class BinaryTreeTest {
    @org.junit.jupiter.api.Test
    void BinaryTree() {
        BinaryTree bt = new BinaryTree(7);

        assertEquals(7, bt.getValue());
        assertEquals(null, bt.getLeft());
        assertEquals(null, bt.getRight());
    }

    @org.junit.jupiter.api.Test
    void BinaryTreeTree() {
        BinaryTree bt = new BinaryTree(7);
        BinaryTree root = bt;

        root.setLeft(new BinaryTree(5));

        assertEquals(7, bt.getValue());
        assertEquals(5, bt.getLeft().getValue());
        assertEquals(null, bt.getRight());
    }

}