package com.circulation;

public class subject08 {

	public static void main(String[] args) {
//		8.求1+2+3+4...+ 98 + 99 + 100的和。（5050）
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			sum += i;//逐个相加
			if(i == 100) {//判断如果是最后一个数就把+变=
				System.out.print(i + "=");
			}else
				System.out.print(i + "+");
		}
		System.out.println(sum);
	}

}
