package ����1;

import java.util.Scanner;

public class Kilometer {

	public static void main(String[] args) {
		int mile;
		double kilometer;
		
		Scanner input = new Scanner(System.in);
		System.out.print("������ �Է��Ͻÿ�: ");
		mile = input.nextInt();
		
		kilometer = mile * 1.609;
		System.out.println(+mile+"������ "+kilometer+"ų�ι����Դϴ�.");
		
		

	}

}
