package com.circulation;

import java.util.Scanner;

public class subject06 {

	public static void main(String[] args) {
		/*
		 * 6.根据要求显示字符 问题：编写一个程序，
		 * 用于接收用户输入的数，然后显示从0到该数为止表示的所有字符， 
		 * 询问用户是否愿意再次继续同样的过程
		 */
		Scanner input = new Scanner(System.in);
		int m;
		do {//先执行一次，再进行判断
			System.out.println("请输入一个数：");
			int n = input.nextInt();
			for (int i = 0; i <= n; i++) {
				char cha = (char) i;//将int类型转换为字符
				System.out.println(cha);
			}
			System.out.println("是否愿意继续？(输入0为不愿意)");
			m = input.nextInt();
		}while(m > 0);
		System.out.println("结束！");	
			
	}

}
