package ����2;

import java.util.Scanner;

public class Money {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a;
		int b;
		int c;
		int d;
		int all;

		System.out.print("500���� ������ �Է��Ͻÿ� : ");
		a = input.nextInt();
		System.out.print("100���� ������ �Է��Ͻÿ� : ");
		b = input.nextInt();
		System.out.print("50���� ������ �Է��Ͻÿ� : ");
		c = input.nextInt();
		System.out.print("10���� ������ �Է��Ͻÿ� : ");
		d = input.nextInt();

		all = 500 * a + 100 * b + 50 * c + 10 * d;
		System.out.println("�Ѿ� : " + all);

	}

}
