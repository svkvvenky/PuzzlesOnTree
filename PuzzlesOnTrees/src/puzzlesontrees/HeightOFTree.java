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
public class HeightOFTree {
/**
 * returns the height of given tree.
 * @param root 
 * @return 
 */
    public static int getHeight(BinaryTree root) {
        if (root == null) {
            return 0;
        }
        if (root.getLeftChild() == null && root.getRightChild() == null) {
            return 1;
        }
        return getHeight(root.getLeftChild()) + getHeight(root.getRightChild());
    }
    public static void main(String[] args) {
        MainClass obj=new MainClass();
        System.out.println("Height of the tree is : "+ getHeight(obj.getSampleBinaryTree()));
    }
}
