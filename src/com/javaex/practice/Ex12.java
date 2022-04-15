package com.javaex.practice;
import java.util.*;

class CustomException extends Exception {
	public CustomException(String message) {
        super(message);
    }
}

public class Ex12 {
	
	static void check(String s, int num) throws CustomException {
		if((s.charAt(0) != '+' && s.charAt(0) != '-' && s.charAt(0) != '*'
				&& s.charAt(0) != '/' && s.charAt(0) != '%') || s.length() > 1) {
		throw new CustomException("기호 잘못 입력하셨습니다.");
		}
		
		if(s.equals("/") && num == 0) {
			throw new CustomException("0으로 나누기 불가능합니다.");
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String operator;
		int num1;
		int num2;
		int result;
		
		try {
			System.out.println("출력되는 내용을 입력하세요");
			System.out.print("기호: ");
			operator = sc.next();
			System.out.print("숫자1: ");
			num1 = sc.nextInt();
			System.out.print("숫자2: ");
			num2 = sc.nextInt();
			
			check(operator, num2);
			
			switch(operator) {
				case("+"): result = num1 + num2; break;
				case("-"): result = num1 - num2; break;
				case("*"): result = num1 * num2; break;
				case("/"): result = num1 / num2; break;
				default: result = num1 % num2; break;
			}
			
			System.out.println("결과는: " + result);
			
		} catch(CustomException e) {
			e.printStackTrace();
		} catch(Exception e) {
			System.out.println("오류, 다시 시도하세요");
		}
		
		sc.close();
	}
}
