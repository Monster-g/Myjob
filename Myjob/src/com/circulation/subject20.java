package com.circulation;

import java.util.Scanner;

public class subject20 {

	public static void main(String[] args) {
//		5.����һ�������ж��Ƿ���ż������
		Scanner input = new Scanner(System.in);
		System.out.println("������һ������");
		int num = input.nextInt();
		if(num % 2 == 0) {
			System.out.println(num + "��ż��");
		}else
			System.out.println(num + "����ż��");
	}

}
