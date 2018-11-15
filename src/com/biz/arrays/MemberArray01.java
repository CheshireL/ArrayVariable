package com.biz.arrays;

public class MemberArray01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MemberVo[] arrMem = new MemberVo[10];
		
		arrMem[0] = new MemberVo();
		arrMem[0].strName = "홍길동";
		arrMem[0].strTel = "001";
		arrMem[0].strAddr = "광주광역시";

		String[] arrString = new String[10];
		arrString[0] = "KOREA";
		arrString[1] = new String();
		arrString[2] = "";
		
		int[] n = new int[19];
		
		System.out.println(n);
		System.out.println(n[0]);
		
		int n1;
		n1 = n[0];
		//n1 = n;
		
	}

}
