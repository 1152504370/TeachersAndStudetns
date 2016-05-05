package cn.edu.qdu.teachersandstudents;

import java.util.Scanner;

public class TestStuTea {
	Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		Teacher[] tea = new Teacher[2];
		Student[] stu = new Student[3];
		for (int i = 0; i < tea.length; i++) {
			System.out.println("输入并创建第" + (i + 1) + "个老师的基本信息：");
			tea[i] = new Teacher();
		}
		for (int i = 0; i < stu.length; i++) {
			System.out.println("输入并创建第" + (i + 1) + "个学生的基本信息：");
			stu[i] = new Student();
		}
		tea[0].teach();
		for (int i = 0; i < stu.length; i++) {
			stu[i].listen();
		}
		for (int i = 0; i < stu.length; i++) {
			stu[i].doHomeWork();
		}
		for (int i = 0; i < stu.length; i++) {
			tea[1].checkHomeWork(stu[i]);
		}

	}

}
