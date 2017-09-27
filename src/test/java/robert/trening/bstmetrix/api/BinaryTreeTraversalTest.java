package robert.trening.bstmetrix.api;

import org.junit.jupiter.api.Test;
import robert.trening.bstmetrix.imp.BinaryTreeTraversalImpl;
import robert.trening.bstmetrix.imp.BuildBstImpl;
import robert.trening.bstmetrix.model.BinaryTree;

import static org.junit.jupiter.api.Assertions.*;

class BinaryTreeTraversalTest {
    @Test
    void preOrderTraversalNull() {
        BuildBst buildTree = new BuildBstImpl();
        BinaryTree root = buildTree.buildBst(null);

        BinaryTreeTraversal binaryTreeTraversal = new BinaryTreeTraversalImpl();

        assertEquals(0, binaryTreeTraversal.preOrderTraversal(root).length);
    }

    @Test
    void preOrderTraversalEmpty() {
        BuildBst buildTree = new BuildBstImpl();
        int[] values = new int[0];
        BinaryTree root = buildTree.buildBst(values);

        BinaryTreeTraversal binaryTreeTraversal = new BinaryTreeTraversalImpl();

        assertEquals(0, binaryTreeTraversal.preOrderTraversal(root).length);
    }

    @Test
    void preOrderTraversalOneNode() {
        BuildBst buildTree = new BuildBstImpl();
        int[] values = {22};
        BinaryTree root = buildTree.buildBst(values);

        BinaryTreeTraversal binaryTreeTraversal = new BinaryTreeTraversalImpl();

        assertEquals(values.length, binaryTreeTraversal.preOrderTraversal(root).length);
        assertArrayEquals(values, binaryTreeTraversal.preOrderTraversal(root));
    }

    @Test
    void preOrderTraversal() {
        BuildBst buildTree = new BuildBstImpl();
        int[] values = {20, 15, 200, 25, -5, 0, 100, 20, 12, 126, 1000, -150};
        int[] preOrder = {20, 15, -5, -150, 0, 12, 200, 25, 20, 100, 126, 1000};
        BinaryTree root = buildTree.buildBst(values);

        BinaryTreeTraversal binaryTreeTraversal = new BinaryTreeTraversalImpl();

        assertEquals(values.length, binaryTreeTraversal.preOrderTraversal(root).length);
        assertArrayEquals(preOrder, binaryTreeTraversal.preOrderTraversal(root));
    }

    @Test
    void inOrderTraversalNull() {
        BuildBst buildTree = new BuildBstImpl();
        BinaryTree root = buildTree.buildBst(null);

        BinaryTreeTraversal binaryTreeTraversal = new BinaryTreeTraversalImpl();

        assertEquals(0, binaryTreeTraversal.inOrderTraversal(root).length);
    }

    @Test
    void inOrderTraversalEmpty() {
        BuildBst buildTree = new BuildBstImpl();
        int[] values = new int[0];
        BinaryTree root = buildTree.buildBst(values);

        BinaryTreeTraversal binaryTreeTraversal = new BinaryTreeTraversalImpl();

        assertEquals(0, binaryTreeTraversal.inOrderTraversal(root).length);
    }

    @Test
    void inOrderTraversalOneNode() {
        BuildBst buildTree = new BuildBstImpl();
        int[] values = {23};
        BinaryTree root = buildTree.buildBst(values);

        BinaryTreeTraversal binaryTreeTraversal = new BinaryTreeTraversalImpl();

        assertEquals(values.length, binaryTreeTraversal.inOrderTraversal(root).length);
        assertArrayEquals(values, binaryTreeTraversal.inOrderTraversal(root));
    }

    @Test
    void inOrderTraversal() {
        BuildBst buildTree = new BuildBstImpl();
        int[] values = {20, 15, 200, 25, -5, 0, 100, 20, 12, 126, 1000, -150};
        int[] preOrder = {-150, -5, 0, 12, 15, 20, 20, 25, 100, 126, 200, 1000};
        BinaryTree root = buildTree.buildBst(values);

        BinaryTreeTraversal binaryTreeTraversal = new BinaryTreeTraversalImpl();

        assertEquals(values.length, binaryTreeTraversal.inOrderTraversal(root).length);
        assertArrayEquals(preOrder, binaryTreeTraversal.inOrderTraversal(root));
    }

    @Test
    void inOrderTraversal1() {
        BuildBst buildTree = new BuildBstImpl();
        int[] values = {1, 2, 3};
        int[] preOrder = {1, 2, 3};
        BinaryTree root = buildTree.buildBst(values);

        BinaryTreeTraversal binaryTreeTraversal = new BinaryTreeTraversalImpl();

        assertEquals(values.length, binaryTreeTraversal.inOrderTraversal(root).length);
        assertArrayEquals(preOrder, binaryTreeTraversal.inOrderTraversal(root));
    }

    @Test
    void postOrderTraversalNull() {
        BuildBst buildTree = new BuildBstImpl();
        BinaryTree root = buildTree.buildBst(null);

        BinaryTreeTraversal binaryTreeTraversal = new BinaryTreeTraversalImpl();

        assertEquals(0, binaryTreeTraversal.postOrderTraversal(root).length);
    }

    @Test
    void postOrderTraversalEmpty() {
        BuildBst buildTree = new BuildBstImpl();
        int[] values = new int[0];
        BinaryTree root = buildTree.buildBst(values);

        BinaryTreeTraversal binaryTreeTraversal = new BinaryTreeTraversalImpl();

        assertEquals(0, binaryTreeTraversal.postOrderTraversal(root).length);
    }

    @Test
    void postOrderTraversalOneNode() {
        BuildBst buildTree = new BuildBstImpl();
        int[] values = {44};
        BinaryTree root = buildTree.buildBst(values);

        BinaryTreeTraversal binaryTreeTraversal = new BinaryTreeTraversalImpl();

        assertEquals(values.length, binaryTreeTraversal.postOrderTraversal(root).length);
    }

    @Test
    void postOrderTraversal() {
        BuildBst buildTree = new BuildBstImpl();
        int[] values = {20, 15, 200, 25, -5, 0, 100, 20, 12, 126, 1000, -150};
        int[] postOrder = {-150, 12, 0, -5, 15, 20, 126, 100, 25, 1000, 200, 20};
        BinaryTree root = buildTree.buildBst(values);

        BinaryTreeTraversal binaryTreeTraversal = new BinaryTreeTraversalImpl();

        assertEquals(values.length, binaryTreeTraversal.postOrderTraversal(root).length);
        assertArrayEquals(postOrder, binaryTreeTraversal.postOrderTraversal(root));
    }

}