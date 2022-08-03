package com.runday.study.ch03;

public class CompareOperatorExample {

	public static void main(String[] args) {
		
//비교 연산자
		int num = 10;
		int num1 = 20;
		boolean result1 = (num == num1);
		
		System.out.println(result1);

		boolean result2 = (num != num1);
		System.out.println(result2);
		
		boolean result3 = (num < num1);
		System.out.println(result3);
		
		boolean result4 = (num <= num1);
		System.out.println(result4);
		
		boolean result5 = (num > num1);
		System.out.println(result5);
		
		boolean result6 = (num >= num1);
		System.out.println(result6);
	}

}
