package com.logical;

import java.time.Year;

public class LogicalProgram {
	
	
		public void palindromeNumber() {
				
		int num = 121, rem = 0, rev = 0, x = num; //321
		
		while (num>0) {
			rem = num%10;
			rev = rev*10 +rem;
			num = num/10;
		}
		
		if (x ==rev) {
			System.out.println("palindrome");
		}else {
			System.out.println("Not a Palindrome");
		}
		
		}
		
		private void primeNumber() {
		
			int num =10;
			boolean flag = true;
			
			if (num<=1) {
				flag = false;	
			}
			
			for (int i =2; i<num/2; i++) {
				if (num%i==0) {
					flag = false;
				}
				
				if (flag) {
					System.out.println("prime number");
				}else {
					System.out.println("Not a Prime Number");
				}
				
			}	

		}
		
		
	private void fibonancci() {
	
		int n =12, first = 0, second =1;
		for (int i =1; i<=n; i++) {
			System.out.println(first + " ");
			
			int next = first + second;
			first = second;
			second = next;
		}	
		
	}
		
	
	private void reverseNumber() {
    int num = 123, rem = 0, rev = 0, x = num; //321
		
		while (num>0) {
			rem = num%10;
			rev = rev*10 +rem;
			num = num/10;
		}
  System.out.println(rev);
	}
	
	private void swapTwoNumbers() {
	
		int a=10, b=20;
		
		System.out.println("Before swap a :" + a);
		System.out.println("Before swap b :" + b);
		
		a = a+b;
		b = a-b;
		a = a-b;
		
		System.out.println("After swap a :" + a);
		System.out.println("After swap b :" + b);
	}
	
	private void oddOrEven() {
	
		int num = 80;
		if (num%2 ==0) {
			System.out.println("even nuber");
		}else {
			System.out.println("odd number");
		}

	}
	
	private void sumOfDigits() {
		
		
		int num =1234, sum=0, rem=0, count = 0;
		
		while (num>0) {
			rem = num%10;
			sum = sum+rem;
			num = num/10;
			count++;
		}
		
		System.out.println("Sum of digits :" + sum);
		System.out.println("Count of digits :" + count);

	}
	
	private void reverseString() {
	
		
		String s = "Hello";
		String rev = new StringBuilder(s).reverse().toString();
		System.out.println("Reversed String :" + rev);

	}
	
	private void multiplicationTable() {
		
		int num =5;
		
		System.out.println("Multiplication of Table: " + ":");
		
		for (int i = 1; i <=10; i++) {
			System.out.println(num + "X" + i + "="+ (num*i));
			
		}

	}
	
	private void leapYear() {
		
		int year =2021;
		
		if (Year.isLeap(year)){
			System.out.println("leap year");
		}else {
			System.out.println("Not a leap year");
		}

	}
	
	
		public static void main(String[] args) {
		LogicalProgram logicalProgram = new LogicalProgram();
		logicalProgram.palindromeNumber();
		logicalProgram.primeNumber();
		logicalProgram.fibonancci();
		logicalProgram.reverseNumber();
		logicalProgram.swapTwoNumbers();
		logicalProgram.oddOrEven();
		logicalProgram.sumOfDigits();
		logicalProgram.reverseString();
		logicalProgram.multiplicationTable();
		logicalProgram.leapYear();
		
		
		
		}
		
	}






