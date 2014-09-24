/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package puzzlesontrees;

/**
 *
 * @author SVKV
 * @param <V>
 */
public class MainClass<V> {

    /**
     * Creates a node object with <tt>data</tt> as its value and its left and
     * right pointers are null.
     *
     * @param data
     * @return
     */
    public BinaryTree<V> createNode(V data) {
        return new BinaryTree<>(data);
    }

    /**
     * Creates a sample binary tree whose inorder traversal is 50 20 70 60 10 40
     * 30 80
     *
     * @return
     */
    public BinaryTree<V> getSampleBinaryTree() {
        //<editor-fold defaultstate="collapsed" desc="Tree1">
        MainClass obj = new MainClass();
        BinaryTree root1 = obj.createNode("10");
        BinaryTree _20 = obj.createNode("20");
        BinaryTree _30 = obj.createNode("30");
        BinaryTree _40 = obj.createNode("40");
        BinaryTree _50 = obj.createNode("50");
        BinaryTree _60 = obj.createNode("60");
        BinaryTree _70 = obj.createNode("70");
        BinaryTree _80 = obj.createNode("80");
        _60.setLeftChild(_70);
        _20.setLeftChild(_50);
        _20.setRightChild(_60);
        _30.setLeftChild(_40);
        _30.setRightChild(_80);

        root1.setLeftChild(_20);
        root1.setRightChild(_30);
//</editor-fold>
        return root1;
    }

}
