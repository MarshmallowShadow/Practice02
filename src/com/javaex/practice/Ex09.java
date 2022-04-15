package com.javaex.practice;
import java.util.*;

public class Ex09 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 숫자: ");
		int num1 = sc.nextInt();
		System.out.print("두번째 숫자: ");
		int num2 = sc.nextInt();
		
		int big;
		int small;
		
		if(num1 > num2) {
			big = num1;
			small = num2;
		}
		else {
			big = num2;
			small = num1;
		}
		
		if((big%small) == 0) System.out.println(small + "는(은) " + big + " 의 약수입니다.");
		else System.out.println(small + "는(은) " + big + " 의 약수가 아닙니다.");
		
		sc.close();
	}
}
