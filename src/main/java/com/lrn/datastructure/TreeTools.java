package com.lrn.datastructure;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @Decription TODO
 * @Author dengwei
 * @Date 2020/1/7 1:53 PM
 * @Version 1.0
 */
public class TreeTools {

    /**
     * 判断树中节点个数
     * @param root
     * @param <T>
     * @return
     */
    public static <T> int getTreeNum(TreeNode<T> root) {
        if (root == null) {
            return 0;
        }
        return getTreeNum(root.leftChild) + getTreeNum(root.rightChild) + 1;
    }

    /**
     * 判断树的深度
     * @param root
     * @param <T>
     * @return
     */
    public static <T> int getTreeDepth(TreeNode<T> root) {
        if (root == null) {
            return 0;
        }
        int leftDepth = getTreeDepth(root.leftChild) + 1;
        int rightDepth = getTreeDepth(root.rightChild) + 1;
        return Math.max(leftDepth, rightDepth);
    }

    /**
     * 前序遍历
     * @param root
     * @param <T>
     */
    public static <T> void preOrderTravel(TreeNode<T> root) {
        if (root == null) {
            return;
        }
        visitNode(root);
        preOrderTravel(root.leftChild);
        preOrderTravel(root.rightChild);
    }

    /**
     * 中序遍历
     * @param root
     * @param <T>
     */
    public static <T> void midOrderTravel(TreeNode<T> root) {
        if (root == null) {
            return;
        }
        midOrderTravel(root.leftChild);
        visitNode(root);
        midOrderTravel(root.rightChild);
    }

    /**
     * 后序遍历
     * @param root
     * @param <T>
     */
    public static <T> void backOrderTravel(TreeNode<T> root) {
        if (root == null) {
            return;
        }
        backOrderTravel(root.leftChild);
        backOrderTravel(root.rightChild);
        visitNode(root);
    }

    /**
     * 访问node节点
     * @param node
     * @param <T>
     */
    private static <T> void visitNode(TreeNode<T> node) {
        System.out.print(node.value + "\t");
    }

    /**
     * 分层遍历
     * @param root
     * @param <T>
     */
    public static <T> void levelTravel(TreeNode<T> root) {
        Queue<TreeNode<T>> q = new LinkedList<TreeNode<T>>();
        q.offer(root);
        while (!q.isEmpty()) {
            TreeNode<T> temp = q.poll();
            visitNode(temp);
            if (temp.leftChild != null) {
                q.offer(temp.leftChild);
            }
            if (temp.rightChild != null) {
                q.offer(temp.rightChild);
            }
        }
    }

    /**
     * 求第K层节点个数
     * @param root
     * @param k
     * @param <T>
     * @return
     */
    public static <T> int getNumForKlevel(TreeNode<T> root, int k) {
        if (root == null || k < 1) {
            return 0;
        }
        if (k == 1) {
            return 1;
        }
        int leftNum = getNumForKlevel(root.leftChild, k - 1);
        int rightNum = getNumForKlevel(root.rightChild, k - 1);
        return leftNum + rightNum;
    }

    /**
     * 求二叉树中叶子节点的个数
     */
    public static <T> int getLeafNum(TreeNode<T> root) {
        if (root == null) {
            return 0;
        }
        if (root.leftChild == null && root.rightChild == null) {
            return 1;
        }
        int leftNum = getLeafNum(root.leftChild);
        int rightNum = getLeafNum(root.rightChild);
        return leftNum + rightNum;
    }

    /**
     * 交换根节点的左右子树
     */
    public static <T> TreeNode<T> exchange(TreeNode<T> root) {
        if (root == null) {
            return null;
        }
        TreeNode<T> left = exchange(root.leftChild);
        TreeNode<T> right = exchange(root.rightChild);
        root.leftChild = right;
        root.rightChild = left;
        return root;
    }

    /**
     * nodeIsChild: 查看node是否是root的子节点
     *
     * @param root
     * @param node
     * @return boolean 返回类型
     */
    public static <T> boolean nodeIsChild(TreeNode<T> root, TreeNode<T> node) {
        if (root == null || node == null) {
            return false;
        }
        if (root == node) {
            return true;
        }
        boolean isFind = nodeIsChild(root.leftChild, node);
        if (!isFind) {
            isFind = nodeIsChild(root.rightChild, node);
        }
        return isFind;
    }

    /**
     * findAllFatherNode: 返回两个节点lnode和rnode的以root为根节点的公共父节点
     *
     * @param root
     *            根节点
     * @param lNode
     * @param rNode
     * @return TreeNode 返回类型
     */
    public static <T> TreeNode<T> findAllFatherNode(TreeNode<T> root,
        TreeNode<T> lNode, TreeNode<T> rNode) {
        if (lNode == root || rNode == root) {
            return root;
        }
        if (root == null || lNode == null || rNode == null) {
            return null;
        }
        // 如果lNode是左子树的节点
        if (nodeIsChild(root.leftChild, lNode)) {
            if (nodeIsChild(root.rightChild, rNode)) {
                return root;
            } else {
                return findAllFatherNode(root.leftChild, lNode, rNode);
            }
        } else {
            if (nodeIsChild(root.leftChild, rNode)) {
                return root;
            } else {
                return findAllFatherNode(root.rightChild, lNode, rNode);
            }
        }
    }

    /**
     * getTreeFromPreAndMid: 根据前序和中序构建二叉树
     *
     * @param pre
     *            前序序列
     * @param mid
     *            中序序列
     * @return TreeNode 返回类型
     */
    public static <T> TreeNode<T> getTreeFromPreAndMid(List<T> pre, List<T> mid) {
        if (pre == null || mid == null || pre.size() == 0 || mid.size() == 0) {
            return null;
        }
        if (pre.size() == 1) {
            return new TreeNode<T>(pre.get(0));
        }
        TreeNode<T> root = new TreeNode<T>(pre.get(0));
        // 找出根节点在中序中的位置
        int index = 0;
        while (!mid.get(index++).equals(pre.get(0))) {
        }
        // 构建左子树的前序
        List<T> preLeft = new ArrayList<T>(index);
        // 左子树的中序
        List<T> midLeft = new ArrayList<T>(index);
        for (int i = 1; i < index; i++) {
            preLeft.add(pre.get(i));
        }
        for (int i = 0; i < index - 1; i++) {
            midLeft.add(mid.get(i));
        }

        // 重建左子树
        root.leftChild = getTreeFromPreAndMid(preLeft, midLeft);
        // 右子树的前序
        List<T> preRight = new ArrayList<T>(pre.size() - index - 1);
        // 右子树的中序
        List<T> midRight = new ArrayList<T>(pre.size() - index - 1);
        for (int i = 0; i <= pre.size() - index - 1; i++) {
            preRight.add(pre.get(index + i));
        }
        for (int i = 0; i <= pre.size() - index - 1; i++) {
            midRight.add(mid.get(index + i));
        }
        // 重建→子树
        root.rightChild = getTreeFromPreAndMid(preRight, midRight);
        return root;
    }

    /**
     * equals: 查看node1和node2两棵树是否相等(两棵树所有节点都相等)
     *
     * @param node1
     *            node2 两个节点
     * @return boolean 返回类型
     */
    public static <T> boolean equals(TreeNode<T> node1, TreeNode<T> node2) {
        // TODO Auto-generated method stub
        if (node1 == null && node2 == null) {
            return true;
        } else if (node1 == null || node2 == null) {
            return false;
        }
        boolean isEqual = node1.value.equals(node2.value);
        boolean isLeftEqual = equals(node1.leftChild, node2.leftChild);
        boolean isRightEqual = equals(node1.rightChild, node2.rightChild);
        return isEqual && isLeftEqual && isRightEqual;
    }


    public static void main(String[] args) {
        // TODO Auto-generated method stub
        TreeNode<Integer> t = new TreeNode<Integer>(1);
        t.addLeft(2);
        t.addRight(3);
        t.leftChild.addLeft(4);
        t.leftChild.addRight(5);
        System.out.println("中序遍历测试:");
        TreeTools.midOrderTravel(t);
        System.out.println("\n前序遍历测试:");
        TreeTools.preOrderTravel(t);
        System.out.println("\n后序遍历测试:");
        TreeTools.backOrderTravel(t);
        System.out.println("\n层次遍历测试:");
        TreeTools.levelTravel(t);
        System.out.println("\n树的深度:"+TreeTools.getTreeDepth(t));
        System.out.println("树的叶子个数:"+TreeTools.getLeafNum(t));
        System.out.println("树的节点个数:"+TreeTools.getTreeNum(t));
        System.out.println("第2层节点个数为:"+TreeTools.getNumForKlevel(t,2));
        List<Integer> pre = new ArrayList<Integer>();
        pre.add(1);
        pre.add(2);
        pre.add(4);
        pre.add(5);
        pre.add(3);
        List<Integer> mid = new ArrayList<Integer>();
        mid.add(4);
        mid.add(2);
        mid.add(5);
        mid.add(1);
        mid.add(3);
        TreeNode<Integer> root = TreeTools.getTreeFromPreAndMid(pre, mid);
        System.out.println("\n通过前序和中序构建树测试：");
        TreeTools.levelTravel(root);
        System.out.println("\n构建的树比较测试:");
        System.out.println(TreeTools.equals(t,root));
    }

}
