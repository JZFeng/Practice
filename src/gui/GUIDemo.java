package gui;
import java.awt.Button;  
import java.awt.FlowLayout;  
import java.awt.Frame;  
import java.awt.event.WindowAdapter;  
import java.awt.event.WindowEvent;  



public class GUIDemo
{
    public static void main(String[] args)
    {
        Frame f = new Frame("my awt");
        f.setSize(500, 400);
        f.setLocation(300, 200);
        f.setLayout(new FlowLayout());

        Button b = new Button("I am a button");

        f.add(b);
        f.setVisible(true);
    }

}