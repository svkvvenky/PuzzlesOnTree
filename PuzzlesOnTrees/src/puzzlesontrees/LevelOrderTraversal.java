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
public class LevelOrderTraversal {

    /**
     * Prints all the nodes at a given level from left to right.
     *
     * @param node
     * @param level level of the nodes to be printed.
     */
    public static void printNodesAtGivenLevel(BinaryTree node, int level) {
        if (node == null) {
            return;
        }
        if (level == 1) {
            System.out.print("" + node.getData() + "    ");
        } else {
            printNodesAtGivenLevel(node.getLeftChild(), level - 1);
            printNodesAtGivenLevel(node.getRightChild(), level - 1);
        }
    }

    public static void main(String[] args) {
        MainClass obj = new MainClass();
        BinaryTree root = obj.getSampleBinaryTree();
        int height = HeightOFTree.getHeight(root);
        System.err.println("In order traversal:");
        for (int i = 1; i <= height; i++) {
            printNodesAtGivenLevel(root, i);
        }
    }
}
