package com.biz.arrays;

public class MemberArray02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MemberVo[] arrVo = new MemberVo[5];
		
		arrVo[0] = new MemberVo();
		arrVo[0].strName = "홍길동";
		
		arrVo[1] = new MemberVo();
		arrVo[1].strName = "이몽룡";
		
		arrVo[2] = new MemberVo();
		arrVo[2].strName = "성춘향";
		
		arrVo[3] = new MemberVo();
		arrVo[3].strName = "장보고";
		
		
	for(int i = 0; i < arrVo.length; i++) {
		System.out.println(arrVo[i].strName);
	}

	}

}
