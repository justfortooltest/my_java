package com.gzl;
/*
	��̬�ı׶ˣ�
		����ʹ����������й��ܡ�
		
	�Ҿ���ʹ����������й���?�в���?
		�С�
		
	��ô����?
		A:�������������÷������ɡ�(���ԣ����Ǻܶ�ʱ�򲻺������ң�̫ռ�ڴ���)
		B:�Ѹ��������ǿ��ת��Ϊ��������á�(����ת��)
		
	������ת�����⣺
		����ת�ͣ�
			Fu f = new Zi();
		����ת�ͣ�
			Zi z = (Zi)f; //Ҫ���f�������ܹ�ת��ΪZi�ġ�
*/
class Fu {
	public void show() {
		System.out.println("show fu");
	}
}

class Zi extends Fu {
	public void show() {
		System.out.println("show zi");
	}
	
	public void method() {
		System.out.println("method zi");
	}

}

class DuoTaiDemo4 {
	public static void main(String[] args) {
		//����
		Fu f = new Zi();
		//f.show();
		Zi z = (Zi)f;
		z.show();
		z.method();
		//f.method();
		//f.method();
		
		//�����������
		//Zi z = new Zi();
		//z.show();
		//z.method();
		
		//���ܹ����ӵĶ���ֵ�����ף���ô���ܲ��ܰѸ������ø�ֵ���ӵ�������?
		//������ԣ���������
//		Zi z = (Zi)f;
//		z.show();
//		z.method();
	}
}
