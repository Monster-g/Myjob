package com.circulation;

public class subject15 {

	public static void main(String[] args) {
//		7. 输出斐波那契数列前20项
		for (int i = 1; i <= 20; i++) {
			System.out.println(f(i));//输出每一项
		}
	}
	public static int f(int n) {//创建方法
		if(n == 1 || n == 2) {//如果是前两项返回1
			return 1;
		}else
			return f(n-1) + f(n-2);//递归，每一项等于前两项之和
	}

}
