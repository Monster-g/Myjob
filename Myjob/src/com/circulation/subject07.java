package com.circulation;

import java.util.Scanner;

public class subject07 {

	public static void main(String[] args) {
		/*
		 * 7.��дһ�����򣬸�������ĳ���༶ѧԱ�ĳɼ���
		 * ����ð༶ѧԱ��ƽ���ɼ��� �༶������Ҫ���û����룬
		 * ����������������ֱ�¼��ѧԱ�ĳɼ�������ð༶ѧԱ��ƽ���ɼ�������ʾ������
		 */
		Scanner input = new Scanner(System.in);
		System.out.println("������༶������");
		int num = input.nextInt();
		int average = 0;
		for (int i = 0; i < num; i++) {
			System.out.println("������" + (i + 1) + "��ͬѧ�ĳɼ���");
			int score = input.nextInt();//ÿ��ѧ���ɼ�
			average += score;//ÿλѧ���ɼ�������
		}
		System.out.println("�ܳɼ�:" + average);
		average /= num;//��ƽ���ɼ�
		System.out.println("ƽ���ɼ�Ϊ��" + average);
	}

}
