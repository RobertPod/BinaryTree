package robert.trening.bstmetrix.api;

import org.junit.jupiter.api.Test;
import robert.trening.bstmetrix.imp.BuildBstImpl;
import robert.trening.bstmetrix.model.BinaryTree;

import static org.junit.jupiter.api.Assertions.*;

class BuildBstTest {
    @Test
    void buildBstNull() {
        BuildBst buildTree = new BuildBstImpl();

        BinaryTree root = buildTree.buildBst(null);
        assertEquals(null, root);
    }

    @Test
    void buildBstEmpty() {
        BuildBst buildTree = new BuildBstImpl();
        int[] values = new int[0];

        BinaryTree root = buildTree.buildBst(values);
        assertEquals(null, root);
    }

    @Test
    void buildBstOne() {
        BuildBst buildTree = new BuildBstImpl();
        int[] values = {11};

        BinaryTree root = buildTree.buildBst(values);
        assertEquals(11, root.getValue());
        assertEquals(null, root.getLeft());
        assertEquals(null, root.getRight());
    }

    @Test
    void buildBstTree() {
        BuildBst buildTree = new BuildBstImpl();
        int[] values = {11, 6, 12, 33};

        BinaryTree root = buildTree.buildBst(values);
        assertEquals(11, root.getValue());
        assertEquals(6, root.getLeft().getValue());
        assertEquals(12, root.getRight().getValue());
        assertEquals(33, root.getRight().getRight().getValue());
    }

}