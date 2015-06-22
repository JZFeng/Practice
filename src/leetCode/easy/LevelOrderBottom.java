package leetCode.easy;

import java.util.LinkedList;
import java.util.List;
import leetCode.utility.*;
/*
 Given a binary tree, return the bottom-up level order traversal of its nodes' values. (ie, from left to right, level by level from leaf to root).

For example:
Given binary tree {3,9,20,#,#,15,7},
    3
   / \
  9  20
    /  \
   15   7
return its bottom-up level order traversal as:
[
  [15,7],
  [9,20],
  [3]
]
 */

public class LevelOrderBottom
{

    public static void main(String[] args)
    {
        TreeNode root = TreeNodeCreator.createTreeNode("3,9,20,#,#,15,7");
        levelOrderBottom(root);
        TreeNodePrinter.printNode(root);

    }

    public static List<List<Integer>> levelOrderBottom(TreeNode root)
    {

        List<List<Integer>> ret = new LinkedList<List<Integer>>();
        if (root == null)
        {
            return ret;
        }
        
        int level = 0;
        recursive(root, ret, level);
        return ret;
    }

    public static void recursive(TreeNode root, List<List<Integer>> ret, int level)
    {
        //递归结束条件
        if (root == null)
        {
            return;
        }
        
        if (level >= ret.size()) //如果在结果的container里没有这一层，新建一个层
        {
            List<Integer> newlink = new LinkedList<Integer>();
            ret.add(0, newlink);
        }
        ret.get(ret.size() - level - 1).add(root.val);
        recursive(root.left, ret, level + 1);
        recursive(root.right, ret, level + 1);
    }
}
