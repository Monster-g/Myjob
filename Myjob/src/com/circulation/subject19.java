package com.circulation;

import java.util.Scanner;

public class subject19 {

	public static void main(String[] args) {
		/* 4.����������������
		 * �����һ����С���ӵ�һ������ӡ���ڶ�������
		 * ����ڶ�����С���ӵڶ�������ӡ����һ������ */
		Scanner input = new Scanner(System.in);
		System.out.println("�������һ������");
		int a = input.nextInt();
		System.out.println("������ڶ�������");
		int b = input.nextInt();
		if(a > b) {//�жϴ�С���մ�С�����˳���ӡ
			System.out.println(b + "," + a);
		}else
			System.out.println(a + "," + b);
			
	}

}
