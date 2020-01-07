package com.lrn.datastructure;

/**
 * @Decription TODO
 * @Author dengwei
 * @Date 2020/1/7 12:00 PM
 * @Version 1.0
 */
public class TreeNode<T> {
    T value;

    TreeNode<T> leftChild;
    TreeNode<T> rightChild;

    public TreeNode(T value) {
        this.value = value;
    }

    public void addLeft(T value){
        TreeNode<T> leftChild = new TreeNode<T>(value);
        this.leftChild = leftChild;
    }

    public void addRight(T value){
        TreeNode<T> rightChild = new TreeNode<T>(value);
        this.rightChild = rightChild;
    }

    @Override
    public boolean equals(Object obj) {
        // TODO Auto-generated method stub
        if(!(obj instanceof TreeNode)){
            return false;
        }
        return this.value.equals(((TreeNode<?>)obj).value);
    }

    @Override
    public int hashCode() {
        // TODO Auto-generated method stub
        return this.value.hashCode();
    }
    @Override
    public String toString(){
        return this.value==null?"":this.value.toString();
    }
}
