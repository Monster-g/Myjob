package com.circulation;

import java.util.Scanner;

public class subject04 {

	public static void main(String[] args) {
		/*
		 * 4.求s=a+aa+aaa+aaaa+aa...a的值，其中a是一个数字。
		 * 例如2+22+222+2222+22222(此时共有5个数相加)，
		 * 几个数相加由键盘控制。
		 */
		Scanner input = new Scanner(System.in);
		System.out.println("请输入一个个位数：");
		int n = input.nextInt();
		System.out.println("请输入相加数的个数：");
		int m = input.nextInt();
		int p = m, count = 1, num1 = 0, sum = 0;
		while(count <= p) {//循环相加的个数次
			num1 = num1 + n;//当前位置上的数
			sum += num1;//当前位置上的数与前面的所有数之和
			n *= 10;//当前位置上的数相比前面的数每次所增加的量
			count++;//记录循环次数
			System.out.println(sum);		
		}
	}

}
