package ����2;

import java.util.Scanner;

public class Pyeong {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int pyeong;
		double meter;

		System.out.print("���� �Է��Ͻÿ� : ");
		pyeong = input.nextInt();

		meter = pyeong * 3.3058;
		System.out.println(pyeong + "���� " + meter + "�������Դϴ�.");

	}

}
