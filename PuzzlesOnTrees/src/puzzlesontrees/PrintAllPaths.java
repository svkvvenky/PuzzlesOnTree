/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package puzzlesontrees;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author SVKV
 */
public class PrintAllPaths {

    static int pathNumber = 0;

    /**
     * Prints all paths in a tree.
     *
     * @param root
     * @param path
     */
    public static void printPaths(BinaryTree root, ArrayList path) {
        if (root == null) {
        } else if (root.getLeftChild() == null && root.getRightChild() == null) {
            path.add(root.getData());
            System.err.println("path"
                    + pathNumber + ": " + path);
        } else {
            path.add(root.getData());
            ArrayList p1 = new ArrayList();
            ArrayList p2 = new ArrayList();
            for (Iterator it = path.iterator(); it.hasNext();) {
                Object path1 = it.next();
                p1.add(path1);
                p2.add(path1);
            }
            printPaths(root.getLeftChild(), p1);
            printPaths(root.getRightChild(), p2);
        }
    }

    public static void main(String[] args) {
        MainClass obj = new MainClass();
        BinaryTree root = obj.getSampleBinaryTree();
        ArrayList list = new ArrayList();
        printPaths(root, list);
    }
}
