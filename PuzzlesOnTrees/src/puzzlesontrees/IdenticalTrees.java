/*
 * 
 */
package puzzlesontrees;

/**
 *
 * @author SVKV
 */
public class IdenticalTrees {

    /**
     * Returns whether two tress are identical or not.
     *
     * @param t1
     * @param t2
     * @return true if trees are identical.<br/>Otherwise,false.
     */
    public boolean areIdentical(BinaryTree t1, BinaryTree t2) {
        if (t1 == null && t2 == null) {
            return true;
        }
        return t1.equals(t2)
                && areIdentical(t1.getLeftChild(), t2.getLeftChild())
                && areIdentical(t1.getRightChild(), t2.getRightChild());
    }

    public static void main(String[] args) {
        MainClass obj = new MainClass();
        BinaryTree root1 = obj.getSampleBinaryTree();
        BinaryTree root2 = obj.getSampleBinaryTree();
        IdenticalTrees identicalTrees = new IdenticalTrees();
        System.err.println("Tree1 and Tree2 are Identical : " + identicalTrees.areIdentical(root1, root2));
    }
}
