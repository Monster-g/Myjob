package com.circulation;

public class subject17 {

	public static void main(String[] args) {
//		2.�ֱ�ʹ��while do while for �� 1 + ������ + 100�ĺ͡�
		System.out.println(method3(1));
	}
	public static int method1(int i) {//whileѭ�����
		int sum = 0;
		while(i <= 100) {
			sum += i;
			i++;
		}
		return sum;//���غ͵�ֵ
	}
	public static int method2(int i) {//do����whileѭ�����
		int sum = 0;
		do{
			sum += i;
			i++;
		}while(i <= 100);
		return sum;
	}
	public static int method3(int i) {//forѭ�����
		int sum = 0;
		for (i = 1; i <= 100; i++) {
			sum += i;
		}
		return sum;
	}

}
