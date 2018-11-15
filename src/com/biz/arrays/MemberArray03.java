package com.biz.arrays;

public class MemberArray03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MemberVo[] arrVo = new MemberVo[100];
		for(int i = 0; i < arrVo.length; i++) {
			arrVo[i] = new MemberVo();
		}
		
		for(int i = 0; i < arrVo.length; i++) {
			System.out.println(arrVo[i]);
		}

	}

}
