package robert.trening.bstmetrix;

import robert.trening.bstmetrix.api.BinaryTreeTraversal;
import robert.trening.bstmetrix.api.BuildBst;
import robert.trening.bstmetrix.imp.BinaryTreeTraversalImpl;
import robert.trening.bstmetrix.imp.BuildBstImpl;
import robert.trening.bstmetrix.model.BinaryTree;

import java.util.Arrays;

public class BstMetrix {

    public static void main(String[] args) {
//        int[] values = {20, 15, 200, 25, -5, 0, 100, 20, 12, 126, 1000, -150};
        int[] values = {1, 10, 2, 10, 3, 10};

        BinaryTree bt;
        BuildBst buildBst = new BuildBstImpl();
        bt = buildBst.buildBst(values);
        BinaryTreeTraversal binaryTreeTraversal = new BinaryTreeTraversalImpl();

        System.out.println(bt);
        System.out.println(Arrays.toString(binaryTreeTraversal.preOrderTraversal(bt)));
        System.out.println(Arrays.toString(binaryTreeTraversal.inOrderTraversal(bt)));
        System.out.println(Arrays.toString(binaryTreeTraversal.postOrderTraversal(bt)));
    }
}
