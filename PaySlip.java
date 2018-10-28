import java.util.*;
class Employee 
{
	String Emp_name,Emp_id,Address,Mail_id,Mobile_no;
	double DA,HRA,PF,SCF,netSalary,grossSalary;
	Scanner sc=new Scanner(System.in);
	void readEmployee()
	{
		System.out.println("=======Employee Details========");
		System.out.println("Enter the Employee name:");
		Emp_name=sc.nextLine();
		System.out.print("Enter the Employee Id:");
		Emp_id=sc.nextLine();
		System.out.println("Enter the Employee Address:");
		Address=sc.nextLine();
		System.out.println("Enter the Employee Mail Id:");
		Mail_id=sc.nextLine();
		System.out.println("Enter the Employee Mobile Number:");
		Mobile_no=sc.nextLine();
	}
	void displayEmployee()
	{
		System.out.println("--------------------------------------------");
		System.out.println("KAMARAJ COLLEGE OF ENGINEERING AND TECHNOLOGY");
		System.out.println("--------------------------------------------");
		System.out.println(" Employee Name:"+Emp_name);
		System.out.println(" Employee Id :"+Emp_id);
		System.out.println(" Employee Address:"+Address);
		System.out.println(" Employee Mail Id :"+Mail_id);
		System.out.println(" Employee Mobile Number:"+Mobile_no);
		System.out.println("--------------------------------------------");
	} 
	void paySlipCalc(double basicPay)
	{
		DA=(0.97)*basicPay;
		HRA=(0.1)*basicPay;
		PF=(0.12)*basicPay;
		SCF=(0.001)*basicPay;	
		grossSalary=basicPay+DA+HRA+PF+SCF;
		netSalary=basicPay+HRA+DA;	
		System.out.println(" Basic Pay:"+basicPay);
		System.out.println(" DA  :"+DA);
		System.out.println(" HRA:"+HRA);
		System.out.println(" PF :"+PF);
		System.out.println(" SCF:"+SCF);
		System.out.println("--------------------------------------------");
		System.out.println("Gross Salary:"+grossSalary);
		System.out.println("Net Salary:"+netSalary);
	}
}
class Programmer extends Employee
{
	double basicPay;
	void readProgrammer()
	{
		this.readEmployee();
		System.out.println("Enter the Basic Pay:");
		basicPay=sc.nextDouble();
		if(basicPay>=20000)
		{
			this.displayEmployee();
			this.paySlipCalc(basicPay);
		}
		else
		{	
			System.out.println("Programmer's BasicPay should be 20000 and above");
			System.exit(0);
		}
		
	}
}
class AsstProf extends Employee
{
	double basicPay;
	void readAsstProf()
	{
		this.readEmployee();
		System.out.println("Enter the Basic Pay:");
		basicPay=sc.nextDouble();
		if(basicPay>=40000)
		{
			this.displayEmployee();
			this.paySlipCalc(basicPay);
		}
		else
		{	
			System.out.println("Assistant Professor's BasicPay should be 40000 and above");
			System.exit(0);
		}
		
	}
}
class AssoProf extends Employee
{
	double basicPay;
	void readAssoProf()
	{
		this.readEmployee();
		System.out.println("Enter the Basic Pay:");
		basicPay=sc.nextDouble();
		if(basicPay>=60000)
		{
			this.displayEmployee();
			this.paySlipCalc(basicPay);
		}
		else
		{	
			System.out.println("Associate Professor's BasicPay should be 60000 and above");
			System.exit(0);
		}
		
	}
}
class Professor extends Employee
{
	double basicPay;
	void readProfessor()
	{
		this.readEmployee();
		System.out.println("Enter the Basic Pay:");
		basicPay=sc.nextDouble();
		if(basicPay>=80000)
		{
			this.displayEmployee();
			this.paySlipCalc(basicPay);
		}
		else
		{	
			System.out.println("Professor's BasicPay should be 80000 and above");
			System.exit(0);
		}
		
	}
}
class PaySlip
{
	public static void main(String args[])
	{
		int choice;
		Programmer p=new Programmer();
		AsstProf ap=new AsstProf();
		AssoProf as=new AssoProf();
		Professor pf=new Professor();
		do
		{	
			System.out.println("1.Programmer");
			System.out.println("2.Associate Professor");
			System.out.println("3.Assistant Professor");
			System.out.println("4.Professor");
			System.out.println("Enter your choice:");
			Scanner sc=new Scanner(System.in);
			choice=sc.nextInt();
			switch(choice)
			{
				case 1:
					p.readProgrammer();
					break;
				case 2:
					ap.readAsstProf();
					break;
				case 3:
					as.readAssoProf();
					break;
				case 4:
					pf.readProfessor();
					break;
			}
			
		}while(choice<=4);
	}
}

