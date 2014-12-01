package concurrent.sync;

public class Entry
{

    public static void main(String[] args)
    {
        // 必须是对同一个实例
        Deligate deligate = new Deligate();
        for (int i = 0; i < 10; i++)
        {

            new SyncThread(deligate).start();

        }

    }

}
