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

        System.out.print("== �������: ");
        for (i = 0; i < arr.length; i++)
        {
            System.out.print( arr[i]+" ");
            tree.insert(arr[i]);
        }

        System.out.println();
        System.out.print("== �������: ");
        tree.inOrder();
        System.out.println();

        
        System.out.println("== ���ĸ߶�: " + tree.height());
        System.out.println("== ��Сֵ: " + tree.minimum());
        System.out.println("== ���ֵ: " + tree.maximum());
       
        System.out.println("��ǰ���ĸ��ڵ���: "+ tree.getRoot().key);
        System.out.println("");        
        
        i = 7;
        System.out.println("== ɾ���ڵ�:" + i);
        tree.remove(i);

        System.out.println("== �����ĸ߶�:" + tree.height());
        System.out.println("== ��������Сֵ: " + tree.minimum());
        System.out.println("== ���������ֵ: " + tree.maximum());
        System.out.println("== ��������ϸ��Ϣ: ");
        tree.inOrder();
        System.out.println("\n�����ĸ��ڵ���: "+ tree.getRoot().key);

        // ���ٶ�����
        tree.destroy();
    }

}