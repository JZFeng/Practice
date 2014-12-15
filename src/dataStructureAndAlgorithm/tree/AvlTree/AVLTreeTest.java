package dataStructureAndAlgorithm.tree.AvlTree;

public class AVLTreeTest
{

    private static int arr[] =
    { 3, 2, 1, 4, 5, 6, 7, 16, 15, 14, 13, 12, 11, 10, 8, 9 };

    public static void main(String[] args)
    {
        int i;
        AVLTree<Integer> tree = new AVLTree<Integer>();

        System.out.print("== 依次添加: ");
        for (i = 0; i < arr.length; i++)
        {
            System.out.printf("%d ", arr[i]);
            tree.insert(arr[i]);
        }

        System.out.println();
        
        System.out.print("== 前序遍历: ");
        tree.preOrder();
        System.out.println();

        System.out.print("== 中序遍历: ");
        tree.inOrder();
        System.out.println();

        System.out.print("== 后序遍历: ");
        tree.postOrder();
        System.out.println();
        
        System.out.printf("");

        System.out.printf("== 高度: %d", tree.height());
        System.out.println("== 最小值: " + tree.minimum());
        System.out.println("== 最大值: " + tree.maximum());
        System.out.println("== 树的详细信息:");
        tree.print();

        i = 8;
        System.out.println("== 删除根节点:" + i);
        tree.remove(i);

        System.out.println("== 高度:" + tree.height());
        System.out.printf("== 中序遍历:");
        tree.inOrder();
        System.out.println("== 树的详细信息:");
        tree.print();

        // 销毁二叉树
        tree.destroy();
    }

}