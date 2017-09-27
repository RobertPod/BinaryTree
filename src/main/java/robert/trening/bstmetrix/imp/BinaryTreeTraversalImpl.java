package robert.trening.bstmetrix.imp;

import robert.trening.bstmetrix.api.BinaryTreeTraversal;
import robert.trening.bstmetrix.model.BinaryTree;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreeTraversalImpl implements BinaryTreeTraversal {
    @Override
    public int[] preOrderTraversal(BinaryTree binaryTree) {
        if (binaryTree == null)
            return new int[0];

        List<Integer> traverse = new ArrayList<Integer>();
        Stack stack = new Stack();

        traverse.add(binaryTree.getValue());
        BinaryTree locRoot = binaryTree;
        BinaryTree lastNode = null;

        while (true) {
            if (locRoot.getLeft() != null && lastNode != locRoot.getLeft() &&
                    (lastNode != locRoot.getRight() || locRoot.getRight() == null)) {
                stack.push(locRoot);
                locRoot = locRoot.getLeft();
                traverse.add(locRoot.getValue());
                continue;
            } else if (locRoot.getRight() != null && lastNode != locRoot.getRight()) {
                stack.push(locRoot);
                locRoot = locRoot.getRight();
                traverse.add(locRoot.getValue());
                continue;
            } else if (!stack.isEmpty()) {
                lastNode = locRoot;
                locRoot = stack.pop();
                continue;
            } else break;
        }

        int[] traversePreOrder = new int[traverse.size()];
        int i = 0;
        for (Integer value : traverse) traversePreOrder[i++] = value;
        return traversePreOrder;
    }

    @Override
    public int[] inOrderTraversal(BinaryTree binaryTree) {
        if (binaryTree == null)
            return new int[0];

        List<Integer> traverse = new ArrayList<Integer>();
        Stack stack = new Stack();
        BinaryTree locRoot = binaryTree;
        BinaryTree lastNode = null;

        if (binaryTree.getLeft() == null)
            traverse.add(locRoot.getValue());

        while (true) {
            if (locRoot.getLeft() != null && lastNode != locRoot.getLeft() &&
                    (lastNode != locRoot.getRight() || locRoot.getRight() == null)) {
                stack.push(locRoot);
                locRoot = locRoot.getLeft();
                if (locRoot.getLeft() == null) {
                    traverse.add(locRoot.getValue());
                }
                continue;
            } else if (locRoot.getRight() != null && lastNode != locRoot.getRight()) {
                stack.push(locRoot);
                locRoot = locRoot.getRight();
                if (locRoot.getLeft() == null) {
                    traverse.add(locRoot.getValue());
                }
                continue;
            } else if (!stack.isEmpty()) {
                lastNode = locRoot;
                locRoot = stack.pop();
                if (lastNode == locRoot.getLeft()) {
                    traverse.add(locRoot.getValue());
                }
                continue;
            } else {
                break;
            }
        }
        int[] traverseInOrder = new int[traverse.size()];
        int i = 0;
        for (Integer value : traverse) traverseInOrder[i++] = value;
        return traverseInOrder;
    }

    @Override
    public int[] postOrderTraversal(BinaryTree binaryTree) {

        if (binaryTree == null)
            return new int[0];

        List<Integer> traverse = new ArrayList<Integer>();
        Stack stack = new Stack();

//        traverse.add(binaryTree.getValue());
        BinaryTree locRoot = binaryTree;
        BinaryTree lastNode = null;

        while (true) {
            if (locRoot.getLeft() != null && lastNode != locRoot.getLeft() &&
                    (lastNode != locRoot.getRight() || locRoot.getRight() == null)) {
                stack.push(locRoot);
                locRoot = locRoot.getLeft();
//                traverse.add(locRoot.getValue());
                continue;
            } else if (locRoot.getRight() != null && lastNode != locRoot.getRight()) {
                stack.push(locRoot);
                locRoot = locRoot.getRight();
//                traverse.add(locRoot.getValue());
                continue;
            } else if (!stack.isEmpty()) {
                traverse.add(locRoot.getValue());
                lastNode = locRoot;
                locRoot = stack.pop();
                continue;
            } else {
                traverse.add(locRoot.getValue());
                break;
            }
        }

        int[] traversePostOrder = new int[traverse.size()];
        int i = 0;
        for (Integer value : traverse) traversePostOrder[i++] = value;
        return traversePostOrder;
    }

    private class Stack {
        private List<BinaryTree> binaryTreeStack = new ArrayList<BinaryTree>();
//        private boolean branch; // false - left, true - right

        void push(BinaryTree binaryTree) {
            binaryTreeStack.add(binaryTree);
        }

        BinaryTree pop() {
            if (binaryTreeStack.isEmpty())
                throw new IndexOutOfBoundsException("Stack is empty");
            return binaryTreeStack.remove(binaryTreeStack.size() - 1);
        }

        boolean isEmpty() {
            return (binaryTreeStack.size() == 0);
        }

    }
}
