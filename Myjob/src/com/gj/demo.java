package com.gj;

import java.util.Scanner;

public class demo {

	public static void main(String[] args) {
		topic3();
	}

	/*
	 * 1.���� n+(n-1)+(n-2)+....+3+2+1��ֵ
	 * ���⣺���㼶�� n+(n-1)+(n-2)+....+3+2+1��ֵ������n��ֵ���û����룬
	 * ���磺������������8�������8+7+6+5+4+3+2+1��ֵ��������Ӧ����36
	 */
	public static void topic1() {
		Scanner input = new Scanner(System.in);
		System.out.println("������һ������");
		int num = input.nextInt();
		int sum = 0;
		for(int i =1; i <= num; i++) {
			sum += i;
//			System.out.print(i);
		}
		System.out.println(num + "�ݼ�1��1������ֵ���" + "=" + sum);
	}

	/*
	 * 2.������������λ���ĺ� 
	 * ���⣺��дһ���������û�����һ��������ֵ��Ȼ����������λ���ĺͣ� 
	 * ���磺������������123�����������6
	 */
	public static void topic2() {
		Scanner input = new Scanner(System.in);
		System.out.println("������һ����������ֵ��");
		int num = input.nextInt();
		int g = num % 10;
		int s = num / 10 % 10;
		int b = num / 100;
		int sum = g + s + b;
		System.out.println(num + "��λ���ĺ�=" + sum);
	}
	
	/* 3.��һ�����Ľ׳� ����: 5! 5*4*3*2*1 0!==1 */
	public static void topic3() {
		Scanner input = new Scanner(System.in);
		System.out.println("������һ������");
		int num = input.nextInt();
		int product = 1;
		for(int i = 1; i <= num; i++) {
			product *= i;			
		}
		System.out.println(product);
	}
	
	/*
	 * 4.��s=a+aa+aaa+aaaa+aa...a��ֵ������a��һ�����֡�
	 * ����2+22+222+2222+22222(��ʱ����5�������)������������ɼ��̿��ơ�
	 */
	public static void topic4() {
		Scanner input = new Scanner(System.in);
		System.out.println("������һ����λ����");
		int num = input.nextInt();
		System.out.println("���������ĸ�����");
		int m = input.nextInt();
		int sum = 0;
		for(int i =1; i <= m; i++) {
			
//			sum += num;
			for(int j = 1; j <= m; j++) {
				int t = 1;
				t *= 10;
				num += num * t;
				System.out.println(num);
			}
			
		}
	}

}
