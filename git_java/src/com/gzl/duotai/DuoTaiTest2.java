package com.gzl.duotai;

/*
 ��ͬ�ط���ʳ�Ļ���ͬ�İ���
 */
class Person {
	public void eat() {
		System.out.println("�Է�");
	}
}

class SouthPerson extends Person {
	public void eat() {
		System.out.println("����,���׷�");
	}

	public void jingShang() {
		System.out.println("����");
	}
}

class NorthPerson extends Person {
	public void eat() {
		System.out.println("����,����ͷ");
	}

	public void yanJiu() {
		System.out.println("�о�");
	}
}

class DuoTaiTest2 {
	public static void main(String[] args) {
		// ����
		// �Ϸ���
		Person p = new SouthPerson();
		p.eat();
		System.out.println("-------------");
		System.out.println("-------------");
		System.out.println("-------------");
		System.out.println("-------------");
		SouthPerson sp = (SouthPerson) p;
		sp.eat();
		sp.jingShang();
		System.out.println("-------------");

		// ������
		// p = new NorthPerson();
		// p.eat();
		// System.out.println("-------------");
		// NorthPerson np = (NorthPerson)p;
		// np.eat();
		// np.yanJiu();
		p = new NorthPerson();
		NorthPerson np = (NorthPerson) p;
		np.yanJiu();
		np.eat();

	}
}
