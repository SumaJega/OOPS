import java.util.*;
class MyException extends Exception
{
	int index;
	String s;
	MyException(int a,String b)
	{
		index=a;
		s=b;
	}
	public String toString()
	{
		return s+":Index should be within "+index;
	}
}
class UserException
{
	public static void main(String args[])
	{
		int a,n;
		String b;
		Scanner sc=new Scanner(System.in);
		ArrayList<String> a1= new ArrayList <String>();
		System.out.println("Enter the String to be Appended:");
		b=sc.next();
		a1.add(b);
		try
		{
			System.out.println("Enter the String to be Inserted:");
			b=sc.next();
			System.out.println("Enter the index where the String is to inserted:");
			a=sc.nextInt();
			n=a1.size();
			if(a<n)
				a1.add(a,b);
			else
				throw new MyException(n,"Invalid index");
				
		}
		catch(MyException e)
		{
			System.out.println(e);
		}
	}
}
