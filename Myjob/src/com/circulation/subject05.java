package com.circulation;

public class subject05 {

	public static void main(String[] args) {
		/* 5.��һ�������У�
		 * 2/1��3/2��5/3��8/5��13/8��21/13...
		 * ���������е�ǰ20��֮�� */
		double n1 = 1.0;//��һ�������ķ�ĸ
		double n2 = 2.0;//��һ�������ķ���
		double n, m, num, sum = 0;
		for (int i = 0; i < 20; i++) {//ѭ��20��
			num = n2 / n1;//�õ�ÿһ��λ���ϵķ���
			sum += num;//������������
			n = n1;//��ǰ�����ķ�ĸ��¼����
			n1 = n2;//��ǰ�����ķ��Ӵ��ݸ���һ�������ķ�ĸ
			n2 = n2 + n;//�ѵ�ǰ�����ķ��Ӻͷ�ĸ��ӵ�ֵ���ݸ���һ�������ķ���
		}
		System.out.println(sum);

	}

}
