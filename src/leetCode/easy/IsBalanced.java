package leetCode.easy;

import leetCode.utility.TreeNode;
/*
Given a binary tree, determine if it is height-balanced.
For this problem, a height-balanced binary tree is defined as a binary tree in which the depth of the two subtrees of every node never differ by more than 1.
 */
public class IsBalanced
{
    public boolean isBalanced(TreeNode root)
    {
        if(root == null)
            return true;
        
        if(Math.abs(height(root.left)-height(root.right))>1)
                return false;

        return isBalanced(root.left) && isBalanced(root.right);
    }

    public static int height(TreeNode root)
    {
        if (root == null)
            return 0;

        return 1+ Math.max(height(root.left), height(root.right));
                
    }
    

}
