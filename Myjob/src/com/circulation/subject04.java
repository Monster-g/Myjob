package com.circulation;

import java.util.Scanner;

public class subject04 {

	public static void main(String[] args) {
		/*
		 * 4.��s=a+aa+aaa+aaaa+aa...a��ֵ������a��һ�����֡�
		 * ����2+22+222+2222+22222(��ʱ����5�������)��
		 * ����������ɼ��̿��ơ�
		 */
		Scanner input = new Scanner(System.in);
		System.out.println("������һ����λ����");
		int n = input.nextInt();
		System.out.println("������������ĸ�����");
		int m = input.nextInt();
		int p = m, count = 1, num1 = 0, sum = 0;
		while(count <= p) {//ѭ����ӵĸ�����
			num1 = num1 + n;//��ǰλ���ϵ���
			sum += num1;//��ǰλ���ϵ�����ǰ���������֮��
			n *= 10;//��ǰλ���ϵ������ǰ�����ÿ�������ӵ���
			count++;//��¼ѭ������
			System.out.println(sum);		
		}
	}

}
