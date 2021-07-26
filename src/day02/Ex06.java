package day02;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		int val;
		System.out.print("입력 : ");
		val = System.in.read();
		System.out.println("입력 data : " + (char)val);
		
		System.in.read();
		System.in.read();
		
		System.out.print("2번째 입력 : ");
		char ch = (char) System.in.read();
		System.out.println("입력 data : " + ch);
	}

}
