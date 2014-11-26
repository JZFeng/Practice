package javaio.xstream;

import com.thoughtworks.xstream.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.List;
import java.util.ArrayList;

/**
 * Created by IntelliJ IDEA.<br>
 * <b>User</b>: leizhimin<br>
 * <b>Date</b>: 2008-5-22 21:10:47<br>
 * <b>Note</b>: XStream学习[[url]http://lavasoft.blog.51cto.com[/url]]
 */
public class XStreamDemo
{

    public static void main(String args[]) throws IOException
    {
        test();
    }

    public static void test() throws IOException
    {
        System.out
                .println("----------XStream学习:http://lavasoft.blog.51cto.com----------");
        // 目标对象
        Address address1 = new Address("3 zhenzhou rd", "450001");
        Address address2 = new Address("yanta rd", "710002");
        List<Address> addList = new ArrayList<Address>();
        addList.add(address1);
        addList.add(address2);
        Profile profile = new Profile("Sofeware Engineer", "13512129933", "Comment");
        Person person = new Person("JZ", "27", profile, addList);

        // 转换装配
        XStream xStream = new XStream();

        /************** 设置类别名 ****************/
        xStream.alias("PERSON", Person.class);
        xStream.alias("PROFILE", Profile.class);
        xStream.alias("ADDRESS", Address.class);
        
        /************* 设置类成员的别名 ***************/
        // 设置Person类的name成员别名Name
        xStream.aliasField("NAME", Person.class, "name");
        xStream.aliasField("AGE", Person.class, "age");
        /*
         * [注意] 设置Person类的profile成员别名PROFILE,这个别名和Profile类的别名一致, 这样可以保持XStream对象可以从profile成员生成的xml片段直接转换为Profile成员,
         * 如果成员profile的别名和Profile的别名不一致,则profile成员生成的xml片段不可 直接转换为Profile对象,需要重新创建XStream对象,这岂不给自己找麻烦?
         */
        xStream.aliasField("PROFILE", Person.class, "profile");
        xStream.aliasField("ADDLIST", Person.class, "addlist");
        xStream.aliasField("ADD", Address.class, "add");
        xStream.aliasField("ZIPCODE", Address.class, "zipcode");
        xStream.aliasField("JOB", Profile.class, "job");
        xStream.aliasField("TEL", Profile.class, "tel");
        xStream.aliasField("REMARK", Profile.class, "remark");

        Writer os = null;
        os = new FileWriter("person.xml");
        xStream.toXML(person, os);

        xStream.alias("PERSON", Person.class);
        Person p = (Person) xStream.fromXML(new File("person.xml"));
        System.out.println("From XML file: "+p);

        /*********************************************/
        String xml = xStream.toXML(person);
        System.out.println(xml);
        output(1, xStream, person);
              
        Person anotherPerson = (Person)xStream.fromXML(xml);
        System.out.println("From XML variable: "+p);
  
        /******* 设置类成员为xml一个元素上的属性 *******/
        xStream.useAttributeFor(Address.class, "zipcode");
        /************* 设置属性的别名 ***************/
        xStream.aliasAttribute(Address.class, "zipcode", "Zipcode");
        output(3, xStream, person);
        
     

    
    }

    public static void output(int i, XStream xStream, Object obj)
    {
        String xml = xStream.toXML(obj);
        System.out.println(">>>第[ " + i + "]次输出\n");
        System.out.println(xml + "\n");
    }
}