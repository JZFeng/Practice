package leetCode.easy;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import leetCode.utility.TreeNode;


public class LevelOrder
{

    public static void main(String[] args)
    {

    }

    public static void levelOrder(TreeNode root)
    {
        if (root == null)
            return;

        LinkedList<Integer> queue = new LinkedList<Integer>();
        queue.offer(root.val);

        while (!queue.isEmpty())
        {
            System.out.println(queue.poll());

            if (root.left != null)
                queue.offer(root.left.val);
            if (root.right != null)
                queue.offer(root.right.val);
        }

    }
    
    
    public static List<List<Integer>> levelOrder1(TreeNode root)
    {
        List<List<Integer>> results = new ArrayList<List<Integer>>();

        if(root == null)
            return results;
        

        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.offer(root);
        int nodesInCurrentLevel = 1;
        int nodesInNextLevel = 0;
        
        while (!queue.isEmpty())
        {
            List<Integer> levelArray = new ArrayList<Integer>();
            TreeNode currNode = queue.poll();
            nodesInCurrentLevel--;
            levelArray.add(currNode.val);
            
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
                nodesInCurrentLevel = nodesInNextLevel;
                nodesInNextLevel = 0;
                results.add(levelArray);
                levelArray = new ArrayList<Integer>();
            }
        }

        return results;
    }


 

}
