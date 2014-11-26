package concurrent.threadDemo;

public class Entry
{

    public Entry()
    {
        // TODO Auto-generated constructor stub
    }

    public static void main(String[] args)
    {
        FirstThread firstThread = null;
        for (int i = 1; i <= 10; i++)
        {
            firstThread = new FirstThread(i);
            firstThread.start();
            
        }
    }

}
