/**
 *
 * Copyright 2014 JZ. All rights reserved.
 * FirstThread.java
 *
 */
package concurrent.threadDemo;

/**
 *@author JZ
 *@date 2014Äê10ÔÂ25ÈÕ
 */
public class FirstThread extends Thread
{
    int no =0;

    public FirstThread(int i)
    {
        this.no = i;
    }
    
    public void start()
    {
        int sum=0;
        for(int index = 1;index<=this.no;index++)
        {
            sum+=sum+index;
            System.out.println("Sum of "+this.no+" is "+sum);
        }
    }
    

}
