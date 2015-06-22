package leetCode.easy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import leetCode.utility.TreeNode;

/*
 Given a binary tree, return the level order traversal of its nodes' values. (ie, from left to right, level by level).

 For example:
 Given binary tree {3,9,20,#,#,15,7},
 3
 / \
 9  20
 /  \
 15   7
 return its level order traversal as:
 [
 [3],
 [9,20],
 [15,7]
 ]
 */

public class LevelOrder
{

    public static void main(String[] args)
    {

    }

    public void levelOrder(TreeNode mRoot)
    {
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.offer(mRoot);

        while (!queue.isEmpty())
        {
            TreeNode currNode = queue.poll();
            System.out.print(currNode.val + " ");

            if (currNode.left != null)
                queue.offer(currNode.left);
            if (currNode.right != null)
                queue.offer(currNode.right);
        }
    }

    public void levelOrder1(TreeNode mRoot)
    {
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.offer(mRoot);

        int nodesInCurrentLevel = 1;
        int nodesInNextLevel = 0;

        while (!queue.isEmpty())
        {
            TreeNode currNode = queue.poll();
            nodesInCurrentLevel--;

            System.out.print(currNode.val + " ");

            if (currNode.left != null)
            {
                queue.offer(currNode.left);
                nodesInNextLevel++;
            }

            if (currNode.right != null)
            {
                queue.offer(currNode.right);
                nodesInNextLevel++;
            }

            if (nodesInCurrentLevel == 0)
            {
                System.out.println();
                nodesInCurrentLevel = nodesInNextLevel;
                nodesInNextLevel = 0;
            }
        }

    }

}
