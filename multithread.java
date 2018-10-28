import java.util.*;
class even implements Runnable
{
	int x,val;
	even(int x)
	{
		this.x=x;
	}
	public void run()
	{
		val=x*x;
		System.out.println("======== MULTI THREADING =========");
		System.out.println("GENERATED NUMBER IS :" +x+"\nSQUARE OF THE NUMBER IS:"+val);
	}
}
class odd implements Runnable
{
	int x,val1;
	odd(int x)
	{
	this.x=x;
	}
	public void run()
	{
		val1=x*x*x;
		System.out.println("MAIN THREAD :"+x+" IS ODD AND CUBE OF "+x+" IS:"+val1);
		System.out.println("=========================================");
	}
}
class A extends Thread 
{
	int num;
	Random r=new Random();
	public void run()
	{
		try
		{
			for (int i=0;i<5;i++)
			{
				num=r.nextInt(100);
				if(num%2==0)
				{
					even e =new even(num);
					Thread t1=new Thread(e);
					t1.start();
				}
				else
				{	
					odd o=new odd(num);
					Thread t2=new Thread(o);
					t2.start();
				}
				Thread.sleep(1000);
			}
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
}
class Test
{
	public static void main(String args[])
	{
		A a=new A();
		a.start();
	}
}



