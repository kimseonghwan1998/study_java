package com.runday.study.ch03;

public class SumExample {

	public static void main(String[] args) {
		sum(60,70,85,90,45);
		sum(50,75,70,60,70);
		sum(55,60,64,58,90);
		sum(80,70,63,88,78);
	}	
	public static void sum(double a, double b,double c,double d,double e) {
		System.out.println("평균" + "=" + (a+b+c+d+e) / 5);
		
	}

}
