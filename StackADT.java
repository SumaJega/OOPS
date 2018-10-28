import java.util.*;
class StackArray extends Exception implements Stack
{
	final int SIZE=5;
	int top=-1;
	int stack[]=new int[SIZE];
	int a,i;
	Scanner sc=new Scanner(System.in);
	public void push()
	{
		try
		{
			System.out.println("Enter the element:");
			System.out.println("Push");
			a=sc.nextInt();
			top++;
			stack[top]=a;
		}
		catch(ArrayIndexOutOfBoundsException e)
		{	
			System.out.println("Stack is Full!!!\n"+e);
			top-=1;
		}	
	}
	public void pop()
	{
		
		try
		{
			System.out.println("Pop");
			System.out.println("Popped element:"+stack[top]);
			top--;	
		}
		catch(ArrayIndexOutOfBoundsException e)
		{	
			System.out.println("Stack is Empty!!!\n"+e);
		}	
	}
	public void display()
	{
		try
		{
			System.out.println("Stack Elements\n");
			for(i=0;i<=top;i++)
			{
		 		System.out.println(stack[i]);
			}
		}
		catch(ArrayIndexOutOfBoundsException e)
		{	
			System.out.println("Stack is Empty!!!\n"+e);
		}	
	}
}

class StackADT
{
	public static void main(String args[])
	{	
		StackArray sa=new StackArray();
		int choice;
		do
		{
			System.out.println("=====================================");
			System.out.println("|Implementation of Stack using Array|");
			System.out.println("=====================================");
			System.out.println("|		1.Push		       |");
			System.out.println("|      		2.Pop  	               |");
			System.out.println("|		3.Display              |");
			System.out.println("|		4.Exit                 |");
			System.out.println("====================================");
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter your choice:");
			choice=sc.nextInt();
			switch(choice)
			{	
				case 1:
					sa.push();
					break;
				case 2:
					sa.pop();
					break;
				case 3:
					sa.display();
					break;
				default:
					System.out.println("Exit");
			}
		}while(choice<=3);
	}
}
				
