package ����1;

import java.util.Scanner;

public class Farenheit {

	public static void main(String[] args) {
		double farenheit;
		double celcius;

		Scanner input = new Scanner(System.in);
		System.out.print("ȭ�� �µ��� �Է��Ͻÿ�: ");
		farenheit = input.nextDouble();

		celcius = (farenheit - 32) * 5 / 9;
		System.out.println("���� �µ��� " + celcius + "�Դϴ�.");

	}

}
