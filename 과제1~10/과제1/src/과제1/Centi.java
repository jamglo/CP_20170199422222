package ����1;

import java.util.Scanner;

public class Centi {

	public static void main(String[] args) {
		int centimeter;
		int feet;
		double inch;

		Scanner input = new Scanner(System.in);
		System.out.print("Ű�� �Է��Ͻÿ�: ");
		centimeter = input.nextInt();

		feet = centimeter / (int) 30.48; // 30.48���� 30�� ����ȴ�
		inch = (centimeter - feet * 30.48) / 2.54;
		System.out.println(centimeter + "cm�� " + feet + "��Ʈ " + inch + "��ġ�Դϴ�.");

	}

}
