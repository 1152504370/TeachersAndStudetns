package cn.edu.qdu.teachersandstudents;

import java.util.Scanner;

public class TestStuTea {
	Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		Teacher[] tea = new Teacher[2];
		Student[] stu = new Student[3];
		for (int i = 0; i < tea.length; i++) {
			System.out.println("���벢������" + (i + 1) + "����ʦ�Ļ�����Ϣ��");
			tea[i] = new Teacher();
		}
		for (int i = 0; i < stu.length; i++) {
			System.out.println("���벢������" + (i + 1) + "��ѧ���Ļ�����Ϣ��");
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
