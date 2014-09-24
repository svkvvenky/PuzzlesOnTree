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
public class Spiral_LevelOrder {

    /**
     * Prints the nodes at given level either from left to right or vice versa,
     * based on <tt>flag</tt>
     *
     * @param node
     * @param level level of the nodes to be printed.
     * @param flag if true, nodes will be printed from left to right.<br/>
     * Otherwise,nodes will be printed from right to left.
     */
    public static void printNodesAtGivenLevel(BinaryTree node, int level, boolean flag) {
        if (node == null) {
            return;
        }
        if (level == 1) {
            System.out.print("" + node.getData() + "    ");
        }
        if (flag) {
            printNodesAtGivenLevel(node.getLeftChild(), level - 1, flag);
            printNodesAtGivenLevel(node.getRightChild(), level - 1, flag);
        } else {
            printNodesAtGivenLevel(node.getRightChild(), level - 1, flag);
            printNodesAtGivenLevel(node.getLeftChild(), level - 1, flag);

        }
    }

    public static void main(String[] args) {
        MainClass obj = new MainClass();
        BinaryTree root = obj.getSampleBinaryTree();
        int height = HeightOFTree.getHeight(root);
        boolean flag = true;
        for (int i = 1; i <= height; i++) {
            printNodesAtGivenLevel(root, i, flag);
            flag = !flag;
        }
        System.out.println("");
        flag = false;
        for (int i = 1; i <= height; i++) {
            printNodesAtGivenLevel(root, i, flag);
            flag = !flag;
        }

    }
}
