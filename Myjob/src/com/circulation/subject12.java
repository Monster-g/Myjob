package com.circulation;

public class subject12 {

	public static void main(String[] args) {
//		3.ͨ��do while���ҳ�1000�������е�7�ı�����
		int n = 0;
		do {
			n++;
			if(n % 7 == 0) {//�ж��Ƿ���7�ı���
				System.out.println(n);
			}
		}while(n < 1000);//ѭ��1000��
	}

}
