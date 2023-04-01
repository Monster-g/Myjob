package com.circulation;

import java.util.Scanner;

public class subject20 {

	public static void main(String[] args) {
//		5.输入一个数，判断是否是偶数（）
		Scanner input = new Scanner(System.in);
		System.out.println("请输入一个数：");
		int num = input.nextInt();
		if(num % 2 == 0) {
			System.out.println(num + "是偶数");
		}else
			System.out.println(num + "不是偶数");
	}

}
