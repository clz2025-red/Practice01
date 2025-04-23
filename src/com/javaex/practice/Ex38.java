package com.javaex.practice;

import java.util.Scanner;

public class Ex38 {

	public static void main(String[] agrgs) {

		int totalPrice;
		int resultPrice;
		
		Scanner sc = new Scanner(System.in);

		// 전체금액입력
		System.out.print("전체금액을 입력해주세요:  ");
		totalPrice = sc.nextInt();

		// 계산        15270 / 1000      :정수/정수  
		//            15.270 --> 15     :15.270 이 정수형으로 자동형변환된다
		//            15 * 1000 ==> 15000          
		resultPrice = totalPrice/1000 * 1000;
		System.out.println("실제지불금액은 " + resultPrice + " 입니다.");

		sc.close();

	}

}
