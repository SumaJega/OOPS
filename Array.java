import java.util.*;
class Array
{
	public static void main(String args[])
	{	
		ArrayList<String>al=new ArrayList<String>();	
		String name,letter;
		int index,choice,i,n;
		do
		{
			System.out.println("=============================================");
			System.out.println("|    	ArrayList Operations           |");
			System.out.println("============================================");
			System.out.println("|		1.Append		       |");
			System.out.println("|      2.Insert at any postion             |");
			System.out.println("|		3.Search                       |");
			System.out.println("|4.List all String starts with given letter|");
			System.out.println("|		5.Display                      |");
			System.out.println("|		6.Delete                       |");
			System.out.println("============================================");
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter your choice:");
			choice=sc.nextInt();
			switch(choice)
			{	
				case 1:
					System.out.println("Enter a String:");
					name=sc.next();
					al.add(name);					
					break;
				case 2:
					System.out.println("Enter the String to insert:");
					name=sc.next();
					System.out.println("Enter the position:");
					index=sc.nextInt();
					n=al.size();
					if(index<n)
					{
						al.add(index,name);	
					}
					else
					{
						System.out.println("Position is not found");
					}
					break;
				case 3:
					System.out.println("Enter the string to be inserted");
					name=sc.next();
					if(al.contains(name))
					{
						System.out.println(name+"is found in the list");
					}
					else
					{
						System.out.println(name+"is not found");
					}
					break;
				case 4:
					System.out.println("Enter the first letter of  a string");	
					letter=sc.next();
					for(i=0;i<(al.size());i++)
					{
						if(al.get(i).startsWith(letter))			
						{
							System.out.println(al.get(i));
						}
					}
					break;
				case 5:
					System.out.println("The list contains the following names");
					System.out.println(al);
					break;
				case 6:
					System.out.println("Enter the position of the string to be removed");
					index=sc.nextInt();
					if(index<al.size())
					{
						al.remove(index);
					}
					else
					{
						System.out.println("not found");
					}
					break;
				
			}
		}while(choice<7);
	}
}
