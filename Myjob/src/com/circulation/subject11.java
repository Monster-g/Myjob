package com.circulation;

public class subject11 {

	public static void main(String[] args) {
//		2.��ӡ1����100��������������7�ı����ʹ�7������
		int n = 0;
		while(n < 100) {//ѭ��100��
			n++;
			if( n % 10 != 7 && n / 10 != 7) {
				System.out.println(n);
			}
		}
	}

}
