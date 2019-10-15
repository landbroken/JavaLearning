package com.lyl.leetcode;

import com.lyl.leetcode.common.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class 二叉树的层次遍历 {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ret = new ArrayList<>();
        if (root == null) {
            return ret;
        }

        BlockingQueue<TreeNode> queue = new LinkedBlockingDeque();
        queue.add(root);

        while (!queue.isEmpty()) {
            int size = queue.size();
            List<Integer> list_temp = new ArrayList<>();

            while (size > 0) {
                size--;
                TreeNode treeNode = queue.poll();
                Integer iTemp = Integer.valueOf(treeNode.val);
                list_temp.add(iTemp);

                if (treeNode.left!=null) {
                    queue.add(treeNode.left);
                }

                if (treeNode.right!=null) {
                    queue.add(treeNode.right);
                }
            }
            ret.add(list_temp);
        }

        return ret;
    }
}
