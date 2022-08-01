package com.runday.study.ch02;

public class CastingExample {

	public static void main(String[] args) {
	
		//강제 형변환 casting : (원하는 형) 변수명
		
		double doubleValue = 1234567;
		System.out.println("doubleValue:" + doubleValue);
		
		double doubleValue2 = 1234567891; // 7자리 이상인 경우에는 e로 표현됨
		System.out.println("doubleValue:" + doubleValue2);
		
		//float 변수에 double 대입 (큰 거에서 작은 거 변환)
		float floatValue = (float) doubleValue;
		System.out.println("floatValue:" + floatValue);
		
		//
		float floatvalue = 1000000;
		long longvalue1 = (long) floatvalue;
		System.out.println(longvalue1);
		
		long longvalue = 1000000;
		int intvalue = (int) longvalue;
		System.out.println(intvalue);
		
		int intvalue1 = 1000000;
		short shortvalue1 = (short) intvalue1;
		System.out.println(shortvalue1);
		
		short shortvalue = 1000;
		byte bytevalue1 =  (byte) shortvalue;
		System.out.println(bytevalue1);
		
		//int를 string으로 변환
		int intValue1 = 123;
		int intValue2 = -123;
		
		String str1 = Integer.toString(intValue1);
		String str2 = Integer.toString(intValue2);
		System.out.println(str1);
		System.out.println(str2);
		
		//string을 int로 변환
		String str3 ="123";
		String str4 ="-123";
		
		int intValue3 = Integer.parseInt(str3);
		int intValue4 = Integer.parseInt(str4);
		System.out.println(intValue3);
		System.out.println(intValue4);
	}

}
