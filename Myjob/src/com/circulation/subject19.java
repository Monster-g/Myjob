package com.circulation;

import java.util.Scanner;

public class subject19 {

	public static void main(String[] args) {
		/* 4.输入任意两个数，
		 * 如果第一个数小，从第一个数打印到第二个数，
		 * 如果第二个数小，从第二个数打印到第一个数。 */
		Scanner input = new Scanner(System.in);
		System.out.println("请输入第一个数：");
		int a = input.nextInt();
		System.out.println("请输入第二个数：");
		int b = input.nextInt();
		if(a > b) {//判断大小按照从小到大的顺序打印
			System.out.println(b + "," + a);
		}else
			System.out.println(a + "," + b);
			
	}

}
