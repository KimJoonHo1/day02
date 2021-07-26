package day02;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int age;
		String name;
		System.out.print("이름 입력 : ");
		name = scanner.next();
		System.out.print("나이 입력 : ");
		age = scanner.nextInt();
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
	}

}
