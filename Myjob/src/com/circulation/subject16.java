package com.circulation;

public class subject16 {

	public static void main(String[] args) {
		/*
		 * 1.�ҳ����е�ˮ�ɻ�������λ������λ�����͵��ڸ�������
		 * 153 = 1 ^ 3 + 5 ^ 3 + 3 ^ 3 ��***��
		 */
		for (int i = 100; i < 1000; i++) {
			if(i == qiugsb(i)) {//�жϸ�λ���������Ƿ�������������
				System.out.println(i);
			}
		}
	}
	public static int qiugsb(int n) {//����һ�����λ�������͵ķ���
		int g = n % 10;//��λ
		int s = n / 10 % 10;//ʮλ
		int b = n /100;//��λ
		return g * g * g + s * s * s + b * b * b;
	}

}
