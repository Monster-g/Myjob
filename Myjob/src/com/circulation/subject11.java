package com.circulation;

public class subject11 {

	public static void main(String[] args) {
//		2.打印1——100的所有数，除了7的倍数和带7的数。
		int n = 0;
		while(n < 100) {//循环100次
			n++;
			if( n % 10 != 7 && n / 10 != 7) {
				System.out.println(n);
			}
		}
	}

}
