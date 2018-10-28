package Converter;
import java.util.*;
public class DistanceConverter 
{
	double kilometer,meter,miles;	
	public void MeterToKilometer(double meter)
	{
		kilometer=meter*0.001;
		System.out.println("Kilometer:"+kilometer);
	}
	public void KilometerToMeter(double kilometer)
	{
		meter=kilometer*1000;
		System.out.println("Meter:"+meter);
	}
	public void KilometerToMiles(double kilometer)
	{
		miles=kilometer*0.621;
		System.out.println("Miles:"+miles);
	}
	public void MilesToKilometer(double miles)
	{
		kilometer=miles*1.609;
		System.out.println("Kilometer:"+kilometer);
	}
}
