package dataStructureAndAlgorithm.tree.AvlTree;

import java.util.logging.Level;

public class AVLTreeTest
{

    private static int arr[] =
//        {10,40,20,30};
//        {10,20,30,40,50,60,70};
        {3,2,1,4,5,6,7,16,15,14,13,12,11,10,8,9};


    public static void main(String[] args)
    {
        int i;
        AVLTree<Integer> tree = new AVLTree<Integer>();

        System.out.print("== 依次添加: ");
        for (i = 0; i < arr.length; i++)
        {
            System.out.print( arr[i]+" ");
            tree.add(arr[i]);
        }

        
        System.out.println("\n== 层次遍历1: ");
        tree.levelOrder1();
        System.out.println();

        System.out.println("== 层次遍历2: ");
        tree.levelOrder2();
        System.out.println();
        
        System.out.println("== 层次遍历3: ");
        tree.levelOrder3();
        System.out.println();
 /*       
        System.out.println("== 树的高度: " + tree.height());
        System.out.println("== 最小值: " + tree.minimum());
        System.out.println("== 最大值: " + tree.maximum());
       
        System.out.println("当前树的根节点是: "+ tree.getRoot().key);
        System.out.println("");        
        
        i = 8;
        System.out.println("== 删除节点:" + i);
        tree.remove(i);

        System.out.println("== 新树的高度:" + tree.height());
        System.out.println("== 新树的最小值: " + tree.minimum());
        System.out.println("== 新树的最大值: " + tree.maximum());
        System.out.println("== 新树的详细信息: ");
        tree.levelOrder2();
        System.out.println("\n新树的根节点是: "+ tree.getRoot().key);

        // 销毁二叉树
        tree.destroy();*/
    }

}