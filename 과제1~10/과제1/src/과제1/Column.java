package ����1;

import java.util.Scanner;

public class Column {

	public static void main(String[] args) {
		int r;
		int h;
		double vol;

		Scanner input = new Scanner(System.in);
		System.out.print("����� �ظ��� �������� �Է��Ͻÿ�: ");
		r = input.nextInt();

		System.out.print("������� ���̸� �Է��Ͻÿ�: ");
		h = input.nextInt();

		vol = r * r * 3.141592 * h;
		System.out.println("������� ���Ǵ� " + vol + "�Դϴ�.");

	}

}