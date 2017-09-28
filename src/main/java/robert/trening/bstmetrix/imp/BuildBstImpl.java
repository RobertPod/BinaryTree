package robert.trening.bstmetrix.imp;

import robert.trening.bstmetrix.api.BuildBst;
import robert.trening.bstmetrix.model.BinaryTree;

import java.io.Serializable;

public class BuildBstImpl implements BuildBst, Serializable {

    public BinaryTree buildBst() {
        return buildBst();
    }

    @Override
    public BinaryTree buildBst(int[] values) {

        if (values == null) return null;
        int length = values.length;
        if (length == 0) return null;
        BinaryTree root = new BinaryTree(values[0]);

        if (length > 1) {
            for (int i = 1; i < length; i++) {
                BinaryTree locRoot = root;
                while (true) {
                    if (values[i] >= locRoot.getValue()) {
                        if (locRoot.getRight() == null) {
                            locRoot.setRight(new BinaryTree(values[i]));
                            break;
                        } else {
                            locRoot = locRoot.getRight();
                        }
                    } else {
                        if (locRoot.getLeft() == null) {
                            locRoot.setLeft(new BinaryTree(values[i]));
                            break;
                        } else {
                            locRoot = locRoot.getLeft();
                        }
                    }
                }
            }
        }
        return root;
    }

    @Override
    public BinaryTree buildBstRecursiveFunction(int[] values) {
        if (values == null) return null;
        int length = values.length;
        if (length == 0) return null;
//        BinaryTree root = new BinaryTree(values[0]);
        BinaryTree root = null;
        for (int value : values) {
            root = addNode(root, value);
        }

        return root;
    }

    private BinaryTree addNode(BinaryTree node, int value) {
        if (node == null) {
            node = new BinaryTree(value);
        } else if (value < node.getValue()) {
            if (node.getLeft() != null) {
                node.setLeft(addNode(node.getLeft(), value));
            } else {
                node.setLeft(new BinaryTree(value));
            }
        } else if (node.getRight() != null) {
            node.setRight(addNode(node.getRight(), value));
        } else {
            node.setRight(new BinaryTree(value));
        }
        return node;
    }
}
