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
}
