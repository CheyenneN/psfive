package practice.set.five;

import java.text.DecimalFormat;
import java.lang.Math;

public class CalcEngine {
    
    public static String Calculation(double amount, double interestRate, double years)
    {
    	double FutureValue = amount * Math.pow((1 + ((interestRate / 100)/12)), (years * 12));
    	
    	 DecimalFormat df = new DecimalFormat("#.##");
         String futureValue = df.format(FutureValue);
         
         return futureValue;
    
    }
}