package com.javaex.practice;
import java.util.*;

public class Ex08 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자 3개를 입력하세요");
		System.out.print("숫자 1:");
		int num1 = sc.nextInt();
		System.out.print("숫자 2:");
		int num2 = sc.nextInt();
		System.out.print("숫자 3:");
		int num3 = sc.nextInt();
		
		int big;
		
		if((num1 <= num2) && (num1 <= num3)) big = num1;
		else if((num2 <= num1) && (num2 <= num3)) big = num2;
		else big = num3;
		
		System.out.println("가장 작은수는 " + big + " 입니다.");
		
		sc.close();
	}
}
