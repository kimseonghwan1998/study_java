package com.runday.study.ch03;

public class LogicalOperatorExample {

	public static void main(String[] args) {
		//&& = & : and : 논리곱
		// || = | : or : 논리합 
		// ^ : 배타적 논리합 : 연산 참 참 폴스, 폴스 폴스 폴스, 참 폴스 참, 폴스 참 참
		
		int a = 65;
		
		boolean result = (a >=65);
		System.out.println("result:" + result);
		
		if(a >=65 & a <=90) {
			System.out.println("65보다 크거나 같고 90보다 작거나 같다");
		}
		if(a >=65 && a <=90) {
			System.out.println("65보다 크거나 같고 90보다 작거나 같다");
		}
			System.out.println("---------------------------");
		if(a>=65 | a <=90 ) {
			System.out.println("65보다 크거나 같고 90보다 작거나 같다");
		}
		if(a>=66 | a <=90 ) {
			System.out.println("65보다 크거나 같고 90보다 작거나 같다");
		}
		if(a>=66 | a <=50 ) {
			System.out.println("둘다 폴스라서 이글은 보이지 않아야 되는데 말이지..");
		}
		if(a>=66 ^ a <=90 ) {
			System.out.println("65보다 크거나 같고 90보다 작거나 같다");
		}
		
		System.out.println("----------------------------------------");
		
		if(a>=70 ^ a<=100) {
			System.out.println("70보다 크거나 같고 100보다 작거나 같다"); 		//ture
		}
		if(a>=63 ^ a<=65) {
			System.out.println("배타연산 참 참이라 보이면 안돼");		//false
		}
		if(a>=70 ^ a<= 60) {
			System.out.println("배타연산 거짓 거짓이라 보이면 안돼");	 	//false
		}
	}

}
