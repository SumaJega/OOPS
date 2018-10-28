import java.util.*;
class generic 
{
	public static <T extends Comparable<T>>T max(T...elements)
	{
		T max=elements[0];
		for(T element:elements)
		{
			if(element.compareTo(max)>0)
			{
				max=element;
			}
		}
		return max;
	}
	public static void main(String args[])
	{
		System.out.println("Integer Max:"+max(Integer.valueOf(27),Integer.valueOf(56),Integer.valueOf(89),Integer.valueOf(120)));
		System.out.println("Double Max:"+max(Double.valueOf(5.69),Double.valueOf(7.8),Double.valueOf(12.36),Double.valueOf(23.33)));
		System.out.println("String Max:"+max("Jegadeeswari","Suma","Suzhu","Jega","Ganapathy","Lalitha"));
		System.out.println("Boolean Max:"+max(Boolean.TRUE,Boolean.FALSE));
		System.out.println("Byte Max:"+max(Byte.MIN_VALUE,Byte.MAX_VALUE));
	}
}
