package ����6;

import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		Scanner in = new Scanner(System.in);
		String str;
		
		System.out.print("���ڿ��� �Է��Ͻÿ�: ");
		str = in.nextLine();
		sb.append(str);
		
		System.out.println(sb.reverse());

	}

}
