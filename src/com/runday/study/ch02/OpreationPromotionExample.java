package com.runday.study.ch02;

public class OpreationPromotionExample {

	public static void main(String[] args) {
		//byte 변수 byteValue 선언하고 12로 초기화
		//byte 변수 byteValue2 선언하고 12로 초기화
		//byte 변수 byteValue3 선언하고 위의 두 변수를 합 연산 수행
		//byteValue3 결과 출력
		
		byte byteValue = 12;
		byte byteValue2 = 12;
		//byte byteVlaue3 = byteValue + byteValue2;
		int intValue6 = byteValue + byteValue2;
		System.out.println(intValue6);
		
		short shortValue = 12;
		short shortValue2 = 12;
		int intValue = shortValue + shortValue2;
		System.out.println(intValue);
		
		int intValue1 = 12;
		int intValue2 = 12;
		int intValue3= intValue1 + intValue2;
		System.out.println(intValue3);
		
		long longValue = 12;
		long longValue2 = 12;
		long longValue3 = longValue + longValue2;
		System.out.println(longValue3);
		
		float floatValue = 12;
		float floatValue2 = 12;
		float floatValue3 = floatValue + floatValue2;
		System.out.println(floatValue3);
		
		double doubleValue = 12;
		double doubleValue2 = 12;
		double doubleValue3 = doubleValue + doubleValue2;
		System.out.println(doubleValue3);
		
	// -------------------------------------------------------------
		
		
		int byteValue4 = byteValue + intValue;
		System.out.println(byteValue4);
		
		int intValue4 = byteValue + intValue;
		System.out.println(intValue4);
		
	// ----------------------------------------------------------------
		
	//	int intValue5 = intValue + doubleValue;
		double doubleValue4 = intValue + doubleValue;
		System.out.println(doubleValue4);
	}
}
