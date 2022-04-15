package com.javaex.practice;
import java.util.*;

public class Ex11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("알파벳 1글자(소문자)를 입력하세요");
		System.out.print("알파벳: ");
		String letter = sc.next();
		
		if((letter.charAt(0) > 122) || (letter.charAt(0) < 97) 
				|| (letter.length() > 1)) {
			System.out.println("잘못 입력하셨습니다. 다시 시도하세요");
		} else {
			switch(letter) {
			case("a"):
			case("e"):
			case("i"):
			case("o"):
			case("u"):
				System.out.println("모음입니다.");
				break;
			default:
				System.out.println("자음입니다.");
				break;
			
			}
		}
		sc.close();
	}
}
