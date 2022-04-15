package com.javaex.practice;
import java.util.*;

public class Ex13 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int y;
		int x;
		
		System.out.println("숫자를 입역해주세요");
		System.out.print("숫자: ");
		x = sc.nextInt();
		
		if(x > 0) y = (int)Math.pow(x, 3) - (9 * x) + 2;
		else y = (7 * x) + 2;
		
		System.out.println("계산결과는 " + y + " 입니다.");
		
		sc.close();
	}
}
