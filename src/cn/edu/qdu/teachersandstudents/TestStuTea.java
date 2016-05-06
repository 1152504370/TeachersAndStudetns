package cn.edu.qdu.teachersandstudents;

import java.util.Scanner;

public class TestStuTea {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Teacher[] tea = new Teacher[2];
		Student[] stu = new Student[3];
		for (int i = 0; i < tea.length; i++) {
			System.out.println("输入并创建第" + (i + 1) + "个老师的基本信息：");
			System.out.print("请输入老师姓名：");
			String name = input.next();
			System.out.print("请输入老师专业：");
			String major = input.next();
			System.out.print("请输入老师所讲授的课程：");
			String lesson = input.next();
			System.out.print("请输入老师教龄：");
			int teachAge = input.nextInt();
			tea[i] = new Teacher(name, major, lesson, teachAge);
		}
		for (int i = 0; i < stu.length; i++) {
			System.out.println("输入并创建第" + (i + 1) + "个学生的基本信息：");
			System.out.print("请输入学生姓名：");
			String name = input.next();
			System.out.print("请输入学生年龄：");
			int age = input.nextInt();
			System.out.print("请输入学生性别：（1,男2，女）");
			int sex = input.nextInt();
			System.out.print("请输入学生年级：");
			int grade = input.nextInt();
			stu[i] = new Student(name, age, sex, grade);
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
