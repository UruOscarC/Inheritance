package com.ogcg.inheritance;

public class OscCalculator extends Calculator{
	
	public int multiplication(int x, int y) {
		return x * y;
	}
	
	public int division(int x, int y) {
	   if(y == 0)
		   return 0;
	   else 
		   return x / y;
   }
}
