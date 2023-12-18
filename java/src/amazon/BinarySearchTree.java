package amazon;

import sun.reflect.generics.tree.Tree;

import java.util.*;

public class BinarySearchTree {

    public static void main(String[] args) {
         /*
                        4
                     /    \
                   2       8
                 /  \    /   \
               1     3  7     9
          */
        TreeNode root = new TreeNode(4, new TreeNode(2, new TreeNode(1), new TreeNode(3)), new TreeNode(8, new TreeNode(7), new TreeNode(9)));
        int val = 2;

//        TreeNode result = searchBST(root, val);
//        System.out.println("Result: [" + result.val + ", " + result.left.val + ", " + result.right.val +"]");

        inOrderTraversal(root);
        System.out.println();
        System.out.println(isBinarySearchTree(root));

    }

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public static TreeNode searchBST(TreeNode root, int val) {
        if (root == null) {
            return null;
        }
        if (val == root.val) {
            return root;
        } else if (val > root.val) {
            return searchBST(root.right, val);
        } else {
            return searchBST(root.left, val);
        }
    }


    /*
     Given two binary trees, determine whether they
     have the same inorder traversal.

        Tree 1                  Tree 2
            5                       3
          /   \                  /    \
        3      7               1       6
      /      /                       /   \
    1      6                       5       7
    [1,3,5,6,7]                [1,3,5,6,7]

     */

    public static boolean hasSameInorderTraversal(TreeNode tree1, TreeNode tree2) {

        return true;
    }

    static void inOrderTraversal(TreeNode root) {
        if (root == null) {
            return;
        }
        inOrderTraversal(root.left);
        System.out.print(root.val + " ");
        inOrderTraversal(root.right);
    }

    static void preOrderTraversal(TreeNode root) {
        if (root == null) {
            return;
        }
        System.out.print(root.val + " ");
        preOrderTraversal(root.left);
        preOrderTraversal(root.right);
    }

    static void postOrderTraversal(TreeNode root) {
        if (root == null) {
            return;
        }
        postOrderTraversal(root.left);
        postOrderTraversal(root.right);
        System.out.print(root.val + " ");
    }

    /*
    * Level Order Traversal of Binary Tree
     */
    static void levelOrderTraversal(TreeNode root) {
        if (root == null) {
            return;
        }
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        System.out.print(root.val + " ");
        queue.add(root);
        while (!queue.isEmpty()) {
            TreeNode t = queue.remove();
            if (t.left != null) {
                System.out.print(t.left.val + " ");
                queue.add(t.left);
            }
            if (t.right != null) {
                System.out.print(t.right.val + " ");
                queue.add(t.right);
            }
        }
    }

    static boolean isBinarySearchTree(TreeNode root) {
        Queue<TreeNode> queue = new ArrayDeque<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            TreeNode t = queue.remove();
            if (t.left != null) {
                if (t.left.val > t.val) {
                    return false;
                } else {
                    queue.add(t.left);
                }
            }
            if (t.right != null) {
                if (t.right.val < t.val) {
                    return false;
                } else {
                    queue.add(t.right);
                }
            }
        }
        return true;
    }

    static int[] listToArray(List<Integer> list) {
        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }
        return result;
    }


}
