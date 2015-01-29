package dataStructure.tree.binaryTree;

public class BinaryTree
{
    TreeNode root; 
    
    BinaryTree()
    {
        root = null;
    }
    
    public int maxHeight(TreeNode root)
    {
        if (root == null)
                return 0;
        return 1 + Math.max(maxHeight(root.left), maxHeight(root.right));
    }
    

    
    public class TreeNode
    {
        int val;

        TreeNode left;

        TreeNode right;

        TreeNode(int x)
        {
            val = x;
        }

    }
}
