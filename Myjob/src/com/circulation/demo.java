package com.circulation;

import java.util.Scanner;

public class demo {

	public static void main(String[] args) {
		topic4();
	}

	/*
	 * 1.计算 n+(n-1)+(n-2)+....+3+2+1的值
	 * 问题：计算级数 n+(n-1)+(n-2)+....+3+2+1的值，其中n的值由用户输入，
	 * 例如：如果输入的数是8，则计算8+7+6+5+4+3+2+1的值，计算结果应该是36
	 */
	public static void topic1() {
		Scanner input = new Scanner(System.in);
		System.out.println("请输入一个数：");
		int num = input.nextInt();
		int sum = 0;
		for(int i =1; i <= num; i++) {
			sum += i;
//			System.out.print(i);
		}
		System.out.println(num + "递减1到1，并将值相加" + "=" + sum);
	}

	/*
	 * 2.计算正整数各位数的和 
	 * 问题：编写一个程序，让用户输入一个正整数值，然后计算该数各位数的和， 
	 * 例如：如果输入的数是123，则计算结果是6
	 */
	public static void topic2() {
		Scanner input = new Scanner(System.in);
		System.out.println("请输入一个正整数的值：");
		int num = input.nextInt();
		int g = num % 10;
		int s = num / 10 % 10;
		int b = num / 100;
		int sum = g + s + b;
		System.out.println(num + "各位数的和=" + sum);
	}
	
	/* 3.求一个数的阶乘 例如: 5! 5*4*3*2*1 0!==1 */
	public static void topic3() {
		Scanner input = new Scanner(System.in);
		System.out.println("请输入一个数：");
		int num = input.nextInt();
		int product = 1;
		for(int i = 1; i <= num; i++) {
			product *= i;			
		}
		System.out.println(product);
	}
	
	/*
	 * 4.求s=a+aa+aaa+aaaa+aa...a的值，其中a是一个数字。
	 * 例如2+22+222+2222+22222(此时共有5个数相加)，几个数相加由键盘控制。
	 */
	public static void topic4() {
		Scanner input = new Scanner(System.in);
		System.out.println("请输入一个个位数：");
		int num = input.nextInt();
		System.out.println("请输入数的个数：");
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
