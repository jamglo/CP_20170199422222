package ����10;

import java.util.Scanner;

public class ShapeTest {
	public static void main(String[] args) {
		Shape[] shape = new Shape[3];
		shape[0] = new Triangle();
		shape[1] = new Rectangle();
		shape[2] = new Circle();

		Scanner sc = new Scanner(System.in);
		System.out.println("- ������ ���� ���ϱ� (1, 2 : ���ο� ���� ������ �Է��� �ּ��� / 3 : ��� ��� // ���� ���θ� 0���� �Է��� �ּ���) -");
		System.out.println("~ �Է��ϴ� ������ �ﰢ��, �簢��, �� �Դϴ�. ~");
		for (int i = 0; i < shape.length; i++) {
			System.out.println();
			shape[i].Shape(sc.nextInt(), sc.nextInt());
			System.out.println(shape[i].area());
		}
	}
}