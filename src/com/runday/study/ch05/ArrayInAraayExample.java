package com.runday.study.ch05;

public class ArrayInAraayExample {

	public static void main(String[] args) {
		
		int[][] scores = {
				{99,88,55},
				{55,77,66},
				{55,55,44},
				{55,55,44},
				{55,55,77},
			};
		
		
		System.out.println("scores[1][1]):" + scores[1][1]);
		System.out.println("scores[2][2]):" + scores[2][2]);
		System.out.println("scores[0][0]):" + scores[0][0]);
		System.out.println("----------------------------------");
		// 1. 개인의 평균
		// 2. 과목별 평균
		
		
		System.out.println("나의 평균:"+ (double)(scores[0][0]+scores[0][1]+scores[0][2])/3);
		System.out.println("장동건의 평균:"+ (double)(scores[1][0]+scores[1][1]+scores[1][2])/3);
		System.out.println("고소영의 평균:"+ (double)(scores[2][0]+scores[2][1]+scores[2][2])/3);
		System.out.println("A의 평균:"+ (double)(scores[3][0]+scores[3][1]+scores[3][2])/3);
		System.out.println("B의 평균:"+ (double)(scores[4][0]+scores[4][1]+scores[4][2])/3);
		
		System.out.println("---------------------");
		System.out.println("국어 평균:"+ (double)(scores[0][0]+scores[1][0]+scores[2][0]+scores[3][0]+scores[4][0])/5);
		System.out.println("수학 평균:"+ (double)(scores[0][1]+scores[1][1]+scores[2][1]+scores[3][1]+scores[4][1])/5);
		System.out.println("영어 평균:"+ (double)(scores[0][2]+scores[1][2]+scores[2][2]+scores[3][2]+scores[4][2])/5);
		
		//for문으로..
		for(int i=0; i<scores.length; i++) {
			for(int j=0; j<scores[j].length; j++) {
				for(int k=0; k<scores[k].length; k++) {
					
				}
			}
		}
	
		}

}
