package com.circulation;

import java.util.Scanner;

public class subject06 {

	public static void main(String[] args) {
		/*
		 * 6.����Ҫ����ʾ�ַ� ���⣺��дһ������
		 * ���ڽ����û����������Ȼ����ʾ��0������Ϊֹ��ʾ�������ַ��� 
		 * ѯ���û��Ƿ�Ը���ٴμ���ͬ���Ĺ���
		 */
		Scanner input = new Scanner(System.in);
		int m;
		do {//��ִ��һ�Σ��ٽ����ж�
			System.out.println("������һ������");
			int n = input.nextInt();
			for (int i = 0; i <= n; i++) {
				char cha = (char) i;//��int����ת��Ϊ�ַ�
				System.out.println(cha);
			}
			System.out.println("�Ƿ�Ը�������(����0Ϊ��Ը��)");
			m = input.nextInt();
		}while(m > 0);
		System.out.println("������");	
			
	}

}
