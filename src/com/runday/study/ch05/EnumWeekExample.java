package com.runday.study.ch05;

public class EnumWeekExample {

	public static void main(String[] args) {
		
		week abc;
		
		
		
//		abc = 1;
//		abc = "asdfasf";
//		abc = 1.1;
		abc = week.MONDAY;
		
		System.out.println(week.FRIDAY);
		System.out.println("abc:" + abc);
		
		//String name = abc;
		String name = abc.name();
		System.out.println("name:" + name);
		
		int ordinal = abc.ordinal();
		System.out.println("ordinal:" + ordinal);
		
		week xyz = week.THURSDAY;
		
		int result1 = abc.compareTo(xyz);
		int result2 = xyz.compareTo(abc);
		
		System.out.println("result1:" + result1);
		System.out.println("result2:" + result2);
		
		week[] days = week.values();
		
		int index = 0;
		for(week day: days) {
			System.out.println(index + ": day:" + day);
			index ++;
		}
	}

}
