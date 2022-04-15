package com.javaex.practice;
import java.util.*;

public class Ex14 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double amt;
		double tax;
		
		System.out.println("수익을 입력해 주세요");
		System.out.print("금익: ");
		amt = sc.nextDouble();
		
		if(amt >= 0 && amt <= 1000) {
			tax = amt * 0.09;
			System.out.println("소득세는 " + tax + " 입니다.");
		}
		else if(amt > 1000 && amt <= 4000) {
			tax = 1000 * 0.09 + (amt - 1000) * 0.18;
			System.out.println("소득세는 " + tax + " 입니다.");
		}
		else if(amt > 4000 && amt < 8000) {
			tax = 1000 * 0.09 + 3000 * 0.18 + (amt - 4000) * 0.27;
			System.out.println("소득세는 " + tax + " 입니다.");
		}
		else if(amt >= 8000) {
			tax = 1000 * 0.09 + 3000 * 0.18 + 4000 * 0.27 + (amt - 8000) * 0.36;
			System.out.println("소득세는 " + tax + " 입니다.");
		}
		else System.out.println("잘못 입력하셨습니다.");
		
		sc.close();
	}
}
