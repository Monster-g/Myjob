package com.circulation;

import java.util.Scanner;

public class subject07 {

	public static void main(String[] args) {
		/*
		 * 7.编写一个程序，根据输入某个班级学员的成绩，
		 * 计算该班级学员的平均成绩， 班级的人数要求用户输入，
		 * 根据输入的人数，分别录入学员的成绩，计算该班级学员的平均成绩，并显示计算结果
		 */
		Scanner input = new Scanner(System.in);
		System.out.println("请输入班级人数：");
		int num = input.nextInt();
		int average = 0;
		for (int i = 0; i < num; i++) {
			System.out.println("请输入" + (i + 1) + "号同学的成绩：");
			int score = input.nextInt();//每个学生成绩
			average += score;//每位学生成绩逐个相加
		}
		System.out.println("总成绩:" + average);
		average /= num;//求平均成绩
		System.out.println("平均成绩为：" + average);
	}

}
