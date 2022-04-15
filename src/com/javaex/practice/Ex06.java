package com.javaex.practice;
import java.util.*;

public class Ex06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1;
		int num2;
		
		System.out.println("숫자 2개를 입력해주세요");
		System.out.print("숫자1: ");
		num1 = sc.nextInt();
		System.out.print("숫자2: ");
		num2 = sc.nextInt();
		
		if(num1 > num2) {
			System.out.println("큰수: " + num1);
			System.out.println("작은수:" + num2);
		} else {
			System.out.println("큰수: " + num2);
			System.out.println("작은수:" + num1);
		}
		
		sc.close();
	}
}
