package ����9;

public class CustomerTest {

	public static void main(String[] args) {
		Person p1 = new Person("��","����","010-1111-9999");
		Customer c1 = new Customer("1��",3321);
		
		System.out.println("�̸� : "+p1.getName());
		System.out.println("�ּ� : "+p1.getAdd());
		System.out.println("��ȭ��ȣ : "+p1.getNum());
		System.out.println("����ȣ : "+c1.cus_num);
		System.out.println("���ϸ��� : "+c1.mile);

	}

}
