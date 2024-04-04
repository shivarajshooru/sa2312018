package Calcpackage;

import java.util.Scanner;

public class Calculator {
	
	public static int Sum(int number1,int number2) {
		return number1 + number2;
	}
	
	public static int Subtract(int number1,int number2) {
		return number1 - number2;
	}
	
	public static int Multiply(int number1,int number2) {
		return number1 * number2;
	}
		public static double Divide(double number1,double number2) {
			if (number2 ==0 ) {
				throw new IllegalArgumentException("Number cannot be divided by 0");
			}
			
			
			return number1 / number2;
		}
public static void main(String[] args) {
	
	@SuppressWarnings("resource")
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the first number :");
	int input = sc.nextInt();
	
	System.out.println("Enter the second number :");
	int input1 = sc.nextInt();
	
	System.out.println("The Sum is: " + Calculator.Sum(input, input1));
	System.out.println("The Subtracion is: " + Calculator.Subtract(input, input1));
	System.out.println("The Multiplication is: " + Calculator.Multiply(input, input1));
	System.out.println("The Division is: " + Calculator.Divide(input, input1));
	
	}
	
	

}
