package com.runday.study.ch02;

public class PromotionExample {

	public static void main(String[] args) {
//		자동 타입 변환(promotion)
//		작은 형이 큰 형으로 변환은 문제가 발생하지 않는다.
//		큰 형이 작은 형으로 변환이 되려면 문제가 생기거나 변환이 이루어져도 데이터 손실이 발생한다.		
//		byte < short < int < long < float < double
	
//		byte byteValue = 10;
//		System.out.println("byteValue: " + byteValue);
		
//		int intValue = byteValue;
//		System.out.println("intValue: " + intValue);
		
//		-----------------------------------------------------
		//int 에 short 대입 후 출력
		short shortvalue = 10;
		int intvalue = shortvalue;
		System.out.println(intvalue);
		
		//long에 int대입 후 출력
		int intvalue1 = 1000;
		long longvalue = intvalue1;
		System.out.println(longvalue);
		
		//float에 long 대입 후 출력
		long longvalue1 = 100000;
		float floatvalue = longvalue1;
		System.out.println(floatvalue);
//		------------------------------------------------------
//		int intValue2 = 1234567890;
//		System.out.println("intValue2" + intValue2);
		
//		byte byteValue2 = intValue2
//		System.out.println("byteValue: " + byteValue);	
		
//			int intValue3 = 200;
//			System.out.println("intValue: " + intValue);
	
//	double doubleValue = intValue3;
//	System.out.println("intValue3:" + doubleValue); // double은 200.0으로 출력
		
		
	}
}
