package com.circulation;

public class subject12 {

	public static void main(String[] args) {
//		3.通过do while，找出1000以内所有的7的倍数。
		int n = 0;
		do {
			n++;
			if(n % 7 == 0) {//判断是否是7的倍数
				System.out.println(n);
			}
		}while(n < 1000);//循环1000次
	}

}
