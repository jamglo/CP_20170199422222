package ����5;

public class BoxTest {

	public static void main(String[] args) {
		
		Box Box = new Box();
		Box.setWid(10);
		Box.setVer(20);
		Box.setHei(50);
		
		System.out.println("���� : "+Box.getVolume());
		System.out.println("���� : " + Box.getWid() + ", ���� : " + Box.getVer() + ", ���� : " + Box.getHei());

	}

}
