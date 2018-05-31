package com.ogcg.inheritance;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	      int a = 20, b = 10;
	      OscCalculator demo = new OscCalculator();
	      Calculator calc = new Calculator();
	      
	      // Clase padre
	      System.out.println(calc.division(a, b));
	      
	      // Clase hija
	      System.out.println(demo.addition(a, b));
	      System.out.println(demo.subtraction(a, b));
	      System.out.println(demo.multiplication(a, b));
	      System.out.println(demo.division(a, b));
	}
}
