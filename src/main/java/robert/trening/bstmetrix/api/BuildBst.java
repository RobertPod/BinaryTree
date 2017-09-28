package robert.trening.bstmetrix.api;

import robert.trening.bstmetrix.model.BinaryTree;

public interface BuildBst {
    //    Basic function, without recursion
    BinaryTree buildBst(int[] values);

    //    For comparison, recursive function
    BinaryTree buildBstRecursiveFunction(int[] values);

}
