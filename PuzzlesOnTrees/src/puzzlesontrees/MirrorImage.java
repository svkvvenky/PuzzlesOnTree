/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package puzzlesontrees;

/**
 *
 * @author SVKV
 */
public class MirrorImage {
/**
 * Creates a mirror image of a tree.
 * @param root 
 */
    public static void getMirrorImage(BinaryTree root) {
        if (root != null) {
            BinaryTree temp;
            getMirrorImage(root.getLeftChild());
            getMirrorImage(root.getRightChild());
            temp = root.getLeftChild();
            root.setLeftChild(root.getRightChild());;
            root.setRightChild(temp);
        }
    }

    public static void main(String[] args) {
        MainClass obj = new MainClass();
        BinaryTree root = obj.getSampleBinaryTree();
        System.out.println("Before mirroring Inorder Traversal:");
        InOrderTraversal.printInOrderTraversal(root);
        MirrorImage.getMirrorImage(root);
        System.out.println("After mirroring Inorder Traversal:");
        InOrderTraversal.printInOrderTraversal(root);
    }
}
