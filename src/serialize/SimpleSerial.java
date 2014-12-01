package serialize;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SimpleSerial
{

    public static void main(String[] args) throws Exception
    {
        File file = new File("person.out"); 
        Person person = new Person("Jason", 20, Gender.MALE);
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file));
        oos.writeObject(person);
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("person.out"));
        Person p = (Person)ois.readObject();
        System.out.println(p);
        ois.close();
        oos.close();
       
    }
}