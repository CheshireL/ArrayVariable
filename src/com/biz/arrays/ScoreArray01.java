package com.biz.arrays;

public class ScoreArray01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 한반에 학생 10명이라고 가정
		int intClassCount = 10;
		
		// 시험을 보기전(아직 점수가 없다)에 성적처리 프로그램을 "미리" 만들고 있다.
		int[] intK = new int[intClassCount];
		int[] intE = new int[intClassCount];
		int[] intM = new int[intClassCount];
		int[] intS = new int[intClassCount];
		
		intK[0] = 90;
		intK[1] = 91;
		intK[2] = 92;
		intK[3] = 93;
		intK[4] = 94;
		intK[5] = 95;
		intK[6] = 96;
		intK[7] = 97;
		intK[8] = 98;
		intK[9] = 99;
		
		
		int index = 0;
		System.out.println(intK[index++] );
		
		System.out.println(intK[9]);
		
		for(int i = 0 ; i <10;i++)
			System.out.println(intK[1]);
			
	}

}
