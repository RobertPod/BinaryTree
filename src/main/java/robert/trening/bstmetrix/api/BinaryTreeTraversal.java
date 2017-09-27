package robert.trening.bstmetrix.api;

import robert.trening.bstmetrix.model.BinaryTree;

public interface BinaryTreeTraversal {
    public int[] preOrderTraversal(BinaryTree binaryTree);

    public int[] inOrderTraversal(BinaryTree binaryTree);

    public int[] postOrderTraversal(BinaryTree binaryTree);

}
