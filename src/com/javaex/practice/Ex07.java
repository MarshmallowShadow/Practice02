package com.javaex.practice;
import java.util.*;

public class Ex07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 숫자: ");
		int num1 = sc.nextInt();
		System.out.print("두번째 숫자: ");
		int num2 = sc.nextInt();
		
		int quotient = num1 / num2;
		int mod = num1 % num2;
		
		System.out.println("몫: " + quotient);
		System.out.println("나머지: " + mod);
		
		sc.close();
	}
}
