package com.runday.study.ch03;

public class DenyLogicOperatorExample {

	public static void main(String[] args) {
		
		boolean play = true;
		System.out.println("play:" + play);
		
//		논리부정연산자: !
		play = !play;
		System.out.println("play:" + play);
		
		play = !play;
		System.out.println("play:" + play);
	}

}
