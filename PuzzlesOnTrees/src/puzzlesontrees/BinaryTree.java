/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package puzzlesontrees;

import java.util.Objects;

/**
 * A BinaryTree consists of "nodes"--each "node" is itself a BinaryTree. Each
 * node has a parent (unless it is the root), may have a left child, and may
 * have a right child. This class implements loop-free binary trees, allowing
 * shared subtrees.
 *
 * @author David Matuszek
 * @version Jan 25, 2004
 * @param <V> The type of values contained in this BinaryTree.
 */
public class BinaryTree<V> {

    /**
     * The value (data) in this node of the binary tree; may be of any object
     * type.
     */
    private V data;
    private BinaryTree<V> leftChild;
    private BinaryTree<V> rightChild;

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof BinaryTree) {
            return Integer.parseInt((String) this.data) == Integer.parseInt((String) ((BinaryTree) obj).data);
        }
        return false;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + Objects.hashCode(this.data);
        return hash;
    }

    /**
     * Constructor for BinaryTree.
     *
     * @param data The data to be placed in the root.
     * @param leftChild The left child of the root (may be null).
     * @param rightChild The right child of the root (may be null).
     */
    public BinaryTree(V data, BinaryTree<V> leftChild, BinaryTree<V> rightChild) {
        this.data = data;
        this.leftChild = leftChild;
        this.rightChild = rightChild;
    }

    /**
     * Constructor for a BinaryTree leaf node (that is, with no children).
     *
     * @param value The value to be placed in the root.
     */
    public BinaryTree(V value) {
        this(value, null, null);
    }

    /**
     * @return the data
     */
    public V getData() {
        return data;
    }

    /**
     * @param data the data to set
     */
    public void setData(V data) {
        this.data = data;
    }

    /**
     * @return the leftChild
     */
    public BinaryTree<V> getLeftChild() {
        return leftChild;
    }

    /**
     * @param leftChild the leftChild to set
     */
    public void setLeftChild(BinaryTree<V> leftChild) {
        this.leftChild = leftChild;
    }

    /**
     * @return the rightChild
     */
    public BinaryTree<V> getRightChild() {
        return rightChild;
    }

    /**
     * @param rightChild the rightChild to set
     */
    public void setRightChild(BinaryTree<V> rightChild) {
        this.rightChild = rightChild;
    }

}
