package cn.edu.qdu.teachersandstudents;

import java.util.Scanner;

public class TestStuTea {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Teacher[] tea = new Teacher[2];
		Student[] stu = new Student[3];
		for (int i = 0; i < tea.length; i++) {
			System.out.println("���벢������" + (i + 1) + "����ʦ�Ļ�����Ϣ��");
			System.out.print("��������ʦ������");
			String name = input.next();
			System.out.print("��������ʦרҵ��");
			String major = input.next();
			System.out.print("��������ʦ�����ڵĿγ̣�");
			String lesson = input.next();
			System.out.print("��������ʦ���䣺");
			int teachAge = input.nextInt();
			tea[i] = new Teacher(name, major, lesson, teachAge);
		}
		for (int i = 0; i < stu.length; i++) {
			System.out.println("���벢������" + (i + 1) + "��ѧ���Ļ�����Ϣ��");
			System.out.print("������ѧ��������");
			String name = input.next();
			System.out.print("������ѧ�����䣺");
			int age = input.nextInt();
			System.out.print("������ѧ���Ա𣺣�1,��2��Ů��");
			int sex = input.nextInt();
			System.out.print("������ѧ���꼶��");
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
