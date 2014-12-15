package dataStructureAndAlgorithm.tree.AvlTree;

public class AVLTreeTest
{

    private static int arr[] =
    { 3, 2, 1, 4, 5, 6, 7, 16, 15, 14, 13, 12, 11, 10, 8, 9 };

    public static void main(String[] args)
    {
        int i;
        AVLTree<Integer> tree = new AVLTree<Integer>();

        System.out.print("== �������: ");
        for (i = 0; i < arr.length; i++)
        {
            System.out.printf("%d ", arr[i]);
            tree.insert(arr[i]);
        }

        System.out.println();
        
        System.out.print("== ǰ�����: ");
        tree.preOrder();
        System.out.println();

        System.out.print("== �������: ");
        tree.inOrder();
        System.out.println();

        System.out.print("== �������: ");
        tree.postOrder();
        System.out.println();
        
        System.out.printf("");

        System.out.printf("== �߶�: %d", tree.height());
        System.out.println("== ��Сֵ: " + tree.minimum());
        System.out.println("== ���ֵ: " + tree.maximum());
        System.out.println("== ������ϸ��Ϣ:");
        tree.print();

        i = 8;
        System.out.println("== ɾ�����ڵ�:" + i);
        tree.remove(i);

        System.out.println("== �߶�:" + tree.height());
        System.out.printf("== �������:");
        tree.inOrder();
        System.out.println("== ������ϸ��Ϣ:");
        tree.print();

        // ���ٶ�����
        tree.destroy();
    }

}