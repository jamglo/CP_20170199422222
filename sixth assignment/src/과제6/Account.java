package ����6;

import java.util.Scanner;

public class Account {

	String id1, pw1, id2, pw2;

	public void input1() {
		Scanner sc = new Scanner(System.in);
		System.out.println("<��������>");
		System.out.print("���̵� �Է��Ͻÿ�:");
		id1 = sc.nextLine();
		System.out.print("��й�ȣ�� �Է��Ͻÿ�:");
		pw1 = sc.nextLine();
		System.out.println();
	}

	public void input2() {
		Scanner sc = new Scanner(System.in);
		System.out.println("<�α���>");
		System.out.print("ID:");
		id2 = sc.nextLine();
		System.out.print("PW:");
		pw2 = sc.nextLine();
		if (id1.equals(id2) && pw1.equals(pw2))
			System.out.println("�α��ο� �����Ͽ����ϴ�.");
		else
			System.out.println("�α��ο� �����Ͽ����ϴ�.");

	}

}
