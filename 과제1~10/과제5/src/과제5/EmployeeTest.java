package ����5;

public class EmployeeTest {

	public static void main(String[] args) {
		Employee Employee = new Employee();

		Employee.setName("������");
		Employee.setTel("010-9847-8838");
		Employee.setSal(3500);

		System.out.println("�̸� : " + Employee.getName());
		System.out.println("����ó : " + Employee.getTel());
		System.out.println("���� : " + Employee.getSal());

	}

}
