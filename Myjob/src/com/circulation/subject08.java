package com.circulation;

public class subject08 {

	public static void main(String[] args) {
//		8.��1+2+3+4...+ 98 + 99 + 100�ĺ͡���5050��
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			sum += i;//������
			if(i == 100) {//�ж���������һ�����Ͱ�+��=
				System.out.print(i + "=");
			}else
				System.out.print(i + "+");
		}
		System.out.println(sum);
	}

}
