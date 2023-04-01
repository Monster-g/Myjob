package com.circulation;

public class subject17 {

	public static void main(String[] args) {
//		2.分别使用while do while for 求 1 + 。。。 + 100的和。
		System.out.println(method3(1));
	}
	public static int method1(int i) {//while循环求和
		int sum = 0;
		while(i <= 100) {
			sum += i;
			i++;
		}
		return sum;//返回和的值
	}
	public static int method2(int i) {//do……while循环求和
		int sum = 0;
		do{
			sum += i;
			i++;
		}while(i <= 100);
		return sum;
	}
	public static int method3(int i) {//for循环求和
		int sum = 0;
		for (i = 1; i <= 100; i++) {
			sum += i;
		}
		return sum;
	}

}
