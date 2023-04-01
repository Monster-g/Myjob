package com.circulation;

public class subject16 {

	public static void main(String[] args) {
		/*
		 * 1.找出所有的水仙花数，三位数，各位立方和等于该数本身。
		 * 153 = 1 ^ 3 + 5 ^ 3 + 3 ^ 3 （***）
		 */
		for (int i = 100; i < 1000; i++) {
			if(i == qiugsb(i)) {//判断各位数立方和是否等于这个数本身
				System.out.println(i);
			}
		}
	}
	public static int qiugsb(int n) {//创建一个求各位数立方和的方法
		int g = n % 10;//个位
		int s = n / 10 % 10;//十位
		int b = n /100;//百位
		return g * g * g + s * s * s + b * b * b;
	}

}
