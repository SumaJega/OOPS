package Converter;
import java.util.*;
public class TimeConverter 
{
	Scanner sc=new Scanner(System.in);
	int hour,minute,second,day;
	public void get()
	{
		System.out.println("Enter the hours:");
		hour=sc.nextInt();
		System.out.println("Enter the minutes:");
		minute=sc.nextInt();
		System.out.println("Enter the seconds:");
		second=sc.nextInt();
	}	
	public void time()
	{
		while(second>=60)
		{
			minute=minute+1;
			second=second-60;
		}
		while(minute>=60)	
		{
			hour=hour+1;
			minute=minute-60;
		}
		while(hour>=24)
		{
			day=day+1;
			hour=hour-24;
		}
	}	
			
	public void dis()
	{
		System.out.println(day+"DAY- "+hour+":"+minute+":"+second+"[24hr format]");		
		if(hour<12)
		{
			System.out.println(day+"DAY- "+hour+":"+minute+":"+second+"AM [12hr format]");
		}
		else
		{
			System.out.println(day+"DAY- "+(hour-12)+":"+minute+":"+second+"PM [12hr format]");
		}
	}
}
