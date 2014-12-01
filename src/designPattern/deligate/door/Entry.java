package designPattern.deligate.door;

import java.io.Console;

public class Entry
{

    public static void main(String[] args)
    {
        Runnable runnable = new LightDoor();
        Thread thread = new Thread(runnable);
        thread.start();
        System.out.println("This is the main thread statement.");

    }

}
