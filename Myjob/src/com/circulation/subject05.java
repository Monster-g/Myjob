package com.circulation;

public class subject05 {

	public static void main(String[] args) {
		/* 5.有一分数序列：
		 * 2/1，3/2，5/3，8/5，13/8，21/13...
		 * 求出这个数列的前20项之和 */
		double n1 = 1.0;//第一个分数的分母
		double n2 = 2.0;//第一个分数的分子
		double n, m, num, sum = 0;
		for (int i = 0; i < 20; i++) {//循环20次
			num = n2 / n1;//得到每一个位置上的分数
			sum += num;//将分数逐个相加
			n = n1;//当前分数的分母记录下来
			n1 = n2;//当前分数的分子传递给下一个分数的分母
			n2 = n2 + n;//把当前分数的分子和分母相加的值传递给下一个分数的分子
		}
		System.out.println(sum);

	}

}
