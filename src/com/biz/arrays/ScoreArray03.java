package com.biz.arrays;

public class ScoreArray03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String strNation = "Republic of Korea";
		strNation.length();
		
		int intNum = 0;
		
		int intNumbers = 10;
		
		int[] intE = new int[intNumbers];
		int intLength = intE.length;
		
		System.out.println(intLength);
		
		for(int i= 0; i<intLength; i++) {
			intE[i] = ConstMethod.makeScore();
		}
		
		int intSum = 0;
		for(int i = 0 ; i < intLength; i++) {
			intSum += intE[i];
		}
	}

}
