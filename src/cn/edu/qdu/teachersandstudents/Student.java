package cn.edu.qdu.teachersandstudents;

import java.util.Scanner;

public class Student {
	private String name;
	private int age;
	private int sex;
	private int grade;

	public Student(String name, int age, int sex, int grade) {
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.grade = grade;
	}

	public void listen() {
		System.out.println(this.name + "�����������Σ�");
	}

	public void doHomeWork() {
		System.out.println("�����Ǳ���ʱ�䣺20�㣬 " + this.name + "����д��ҵ��");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getSex() {
		return sex;
	}

	public void setSex(int sex) {
		this.sex = sex;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

}
