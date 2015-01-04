package dataStructureAndAlgorithm.tree.AvlTree;

import java.util.logging.Level;

public class AVLTreeTest
{

    private static int arr[] = 
        {3,2,1,4,5,6,7,16,15,14,13,12,11,10,8,9};


    public static void main(String[] args)
    {
        int i;
        AVLTree<Integer> tree = new AVLTree<Integer>();

        System.out.print("== 依次添加: ");
        for (i = 0; i < arr.length; i++)
        {
            System.out.print( arr[i]+" ");
            tree.insert(arr[i]);
        }

        System.out.println();
        System.out.print("== 中序遍历: ");
        tree.inOrder();
        System.out.println();

        
        System.out.println("== 树的高度: " + tree.height());
        System.out.println("== 最小值: " + tree.minimum());
        System.out.println("== 最大值: " + tree.maximum());
       
        System.out.println("当前树的根节点是: "+ tree.getRoot().key);
        System.out.println("");        
        
        i = 7;
        System.out.println("== 删除节点:" + i);
        tree.remove(i);

        System.out.println("== 新树的高度:" + tree.height());
        System.out.println("== 新树的最小值: " + tree.minimum());
        System.out.println("== 新树的最大值: " + tree.maximum());
        System.out.println("== 新树的详细信息: ");
        tree.inOrder();
        System.out.println("\n新树的根节点是: "+ tree.getRoot().key);

        // 销毁二叉树
        tree.destroy();
    }

}