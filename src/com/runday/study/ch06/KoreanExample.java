package com.runday.study.ch06;

public class KoreanExample {

	public static void main(String[] args) {
		Korean k1 = new Korean("장원영", "011225-1234567");
		System.out.println("k1.name:" + k1.name);
		System.out.println("Korean.nationality:" + Korean.nationality);
		
		int result = Korean.staticTest(10);
		System.out.println(result);
	}

}
