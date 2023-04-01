package com.circulation;

public class subject14 {

	public static void main(String[] args) {
//		6.Çó1!+2!+3!+4!+5!
		int sum = 0;
		for(int i = 1; i <= 5; i++) {
			int num = 1;
			for (int j = 1; j <= i; j++) {
				num *= j;
			}
			System.out.println(num);
			sum += num;
		}
		System.out.println("ºÍÎª£º" + sum);
	}

}
