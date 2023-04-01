package com.circulation;

public class subject09 {

	public static void main(String[] args) {
		/* 9.假设有一对兔子，生长4个月后生一对兔子，
		 * 成年兔子每月会生一对兔子，多少个月之后超过5000对兔子。
		1: a 1
		2: a 1
		3: a 1
		4: a a1 2 
		5: a a1 a2 3
		6: a a1 a2 a3 4
		7: a a1 a2 a3 a4 a11 6
		8: a a1 a2 a3 a4 a11 a5 a12 a21 9
		9: a a1 a2 a3 a4 a11 a5 a12 a21 a6 a13 a22 a31 13
		x: a a1 a2 a3 a4 a11 a5 a12 a21 a6 a13 a22 a31 a7 a14 a23 a32 a41 a111 19
		f(n) = 1
		f(n) = f(n-1) + f(n-3);
		 */
		for(int n = 1;; n++) {
			if(f(n) > 5000) {
				System.out.println(n);
				break;
			}
		}
	}
	public static int f(int n) {
		if(n == 1 || n == 2 || n == 3) {
			return 1;
		}else
			return f(n-1) + f(n-3);
	}
	

}
