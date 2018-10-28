import java.util.*;
class Consumer
{
	String consumer_no;
	String consumer_name;
	double previous_month_reading;
	double current_month_reading;
	char type_of_connection;
	double consumed_units;
	double amount;
	void read()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("=======Enter the Readings========");
		System.out.print("Enter the Consumer Id:");
		consumer_no=s.next();
		System.out.println("Enter the Consumer name:");
		s.nextLine();
		consumer_name=s.nextLine();
		System.out.println("Enter the Previous month reading:");
		previous_month_reading=s.nextDouble();
		System.out.println("Enter the Current month reading:");
		current_month_reading=s.nextDouble();
		if(current_month_reading>previous_month_reading)
			consumed_units=current_month_reading-previous_month_reading;
		else
		{
			System.out.println("Current Month Reading is lesser than Previous Month Reading");
			System.exit(0);
		}
		System.out.println("Enter the type of connection(D-Domestic / C-Commercial)");
		type_of_connection=s.next().charAt(0);
		if((type_of_connection=='D'||type_of_connection=='d')||(type_of_connection=='C'||type_of_connection=='c'))
			System.out.println("=======ELECTRICITY BILL========");
		else
		{
			System.out.println("Invalid type of EB Connection");	
			System.exit(0);
		}		
	} 
	void Calculate()
	{
		if(type_of_connection=='D'||type_of_connection=='d')
		{
			if(consumed_units<=100)
				amount=consumed_units*1;
			else if((consumed_units>=101)&&(consumed_units>=200))
				amount=consumed_units*2.50;
			else if((consumed_units>=201)&&(consumed_units>=500))
				amount=consumed_units*4;
			else
				amount=consumed_units*6;
		}
		else
		{
			if(consumed_units<=100)
				amount=consumed_units*2;
			else if((consumed_units>=101)&&(consumed_units>=200))
				amount=consumed_units*4.50;
			else if((consumed_units>=201)&&(consumed_units>=500))
				amount=consumed_units*6;
			else
				amount=consumed_units*7;
		}
	} 
	void display()
	{
		System.out.println(" Consumer Id:"+consumer_no);
		System.out.println(" Consumer consumer_name:"+consumer_name);
		System.out.println(" Total units:"+consumed_units);
		System.out.println(" Total Bill:"+amount);	
	} 
}
class Ex1_Bill
{
	public static void main(String args[])
	{
		Consumer c=new Consumer();
		c.read();
		c.Calculate();
		c.display();
	}
}
