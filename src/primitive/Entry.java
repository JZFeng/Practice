package primitive;

public class Entry {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		if(isPositive(3) || isPositive(5))
		{
			System.out.println("Enter");
		}
		
		System.out.println("最大值:"+ java.lang.Long.MAX_VALUE);
		System.out.println("最小值:"+java.lang.Long.MIN_VALUE);		
		System.out.println("字节数:"+java.lang.Long.SIZE);
		
		int a=10;
		
		while (a>=0)
		{
			System.out.println("a="+a);
			a--;
		}
		
		a = 10;
		int b=0;
		
		do
		{
			b = a*2;
			System.out.println("b="+b);
			a--;
		} while (b>0 && a>0);
		
		
	}
	
	public static boolean isPositive(int i)
	{
		System.out.println(i);
		return i>0;
	}

}
