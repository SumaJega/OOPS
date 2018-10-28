package Converter;
import java.util.*;
public class CurrencyConverter 
{
	double dollar,inr,euro,yen;
	public void DollarToInr(double dollar)
	{
		inr=dollar*68.01;
		System.out.println("Indian Rupee:"+inr);
	}
	public void EuroToInr(double euro)
	{
		inr=euro*80.31;
		System.out.println("Indian Rupee:"+inr);
	}
	public void YenToInr(double yen)
	{
		inr=yen*0.61;
		System.out.println("Indian Rupee:"+inr);
	}
	public void InrToDollar(double inr)
	{
		dollar=inr/68.01;
		System.out.println("Dollar:"+dollar);
	}
	public void InrToEuro(double inr)
	{
		euro=inr/80.31;
		System.out.println("Euro:"+euro);
	}
	public void InrToYen(double inr)
	{
		yen=inr/0.61;
		System.out.println("Yen:"+yen);
	}
}
