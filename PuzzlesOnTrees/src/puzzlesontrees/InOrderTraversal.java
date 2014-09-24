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
public class InOrderTraversal {

    /**
     * Prints the inorder traversal of a tree.
     *
     * @param t1
     */
    public static void printInOrderTraversal(BinaryTree t1) {
        if (t1 == null) {
            return;
        }
        printInOrderTraversal(t1.getLeftChild());
        System.out.print("" + t1.getData() + "    ");
        printInOrderTraversal(t1.getRightChild());
    }

    public static void main(String[] args) {
        MainClass obj = new MainClass();
        printInOrderTraversal(obj.getSampleBinaryTree());
    }
}
