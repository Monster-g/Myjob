package com.circulation;

public class subject15 {

	public static void main(String[] args) {
//		7. ���쳲���������ǰ20��
		for (int i = 1; i <= 20; i++) {
			System.out.println(f(i));//���ÿһ��
		}
	}
	public static int f(int n) {//��������
		if(n == 1 || n == 2) {//�����ǰ�����1
			return 1;
		}else
			return f(n-1) + f(n-2);//�ݹ飬ÿһ�����ǰ����֮��
	}

}
