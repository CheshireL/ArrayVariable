package com.biz.arrays;

public class ScoreArray02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int intNum = 100;
		int[] intK = new int[intNum];
		for(int i =0; i<intNum; i++) {
			intK[i] = makeScore();
			intK[i] = ConstMethod.makeScore();
		}
		for(int i = 0; i<intNum;i++) {
			System.out.printf("%d 번학생 국어점수 : %d\n",(i+1),intK[i] );
		}

		System.out.println("========================");
		System.out.println("총점");
		System.out.println("------------------------");
		
		int intSum = 0;
		for(int i = 0; i <intNum; i++) {
			intSum += intK[1];
		}
		System.out.println("========================");
		System.out.println("총점");
		System.out.println(intSum);
		
		System.out.println("평균");
		System.out.println(intSum/5);
		
		
		System.out.println("------------------------");
	}

	public static int makeScore() {
		return (int)(Math.random()*(100-50+1))+50;
	}
	
	
}


