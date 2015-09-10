package primitive;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*    public static void main(String args[])
 {
 Pattern p = Pattern.compile("ReceiveSearchResponse duration is:(\\d*)");
 Matcher m = p.matcher("D/com.telenav.arp(29995): Denali: com.telenav.arp.module.a.d: SearchPageTask ReceiveSearchResponse duration is:40D/com.telenav.arp(29995): Denali: com.telenav.arp.module.a.d: SearchPageTask ReceiveSearchResponse duration is:111D/com.telenav.arp(29995): Denali: com.telenav.arp.module.a.d: SearchPageTask ReceiveSearchResponse duration is:222D/com.telenav.arp(29995): Denali: com.telenav.arp.module.a.d: SearchPageTask ReceiveSearchResponse duration is:43330");

 }
 */
//该例将把句子里的"Kelvin"改为"Kevin" 
public class RegEDemo
{
    public static void main(String[] args) throws Exception
    {
        String source = "D/com.telenav.arp(29995): Denali: com.telenav.arp.module.a.d: SearchPageTask ReceiveSearchResponse duration is:40D/com.telenav.arp(29995): Denali: com.telenav.arp.module.a.d: SearchPageTask ReceiveSearchResponse duration is:111D/com.telenav.arp(29995): Denali: com.telenav.arp.module.a.d: SearchPageTask ReceiveSearchResponse duration is:222D/com.telenav.arp(29995): Denali: com.telenav.arp.module.a.d: SearchPageTask ReceiveSearchResponse duration is:433";
        Pattern p = Pattern.compile("(.*:)(\\d*)");
        Matcher m = p.matcher(source);
        
        while(m.find())
        {
            System.out.println(m.group(2));
        }
//        System.out.println(a[a.length-1]);
        
        
    /*    
        System.out.println(p.pattern());
        String[] a = p.split(source);
        for (int i = 0; i < a.length; i++)
        {
            System.out.println(a[i]);
        }
        StringBuffer sb = new StringBuffer();
        int i = 0;
        // 使用find()方法查找第一个匹配的对象
        boolean result = m.find();
        // 使用循环将句子里所有的kelvin找出并替换再将内容加到sb里
        while (result)
        {
            i++;
            m.appendReplacement(sb, "Kevin");
            System.out.println("第" + i + "次匹配后sb的内容是：" + sb);
            // 继续查找下一个匹配对象
            result = m.find();
        }
        // 最后调用appendTail()方法将最后一次匹配后的剩余字符串加到sb里；
        m.appendTail(sb);
        System.out.println("调用m.appendTail(sb)后sb的最终内容是:" + sb.toString());*/
    }
}
