package cn.edu.qdu.teachersandstudents;

import java.util.Scanner;

public class Student {
	private String name;
	private int age;
	private int sex;
	private int grade;
	public Student() {
		Scanner input = new Scanner(System.in);
		System.out.print("请输入学生姓名：");
		this.name = input.next();
		System.out.print("请输入学生性别：（1,男2，女）");
		this.sex = input.nextInt();
		System.out.print("请输入学生年级：");
		this.grade = input.nextInt();
	}
	public void listen(){
		System.out.println(this.name+"正在认真听课！");
	}
	public void doHomeWork(){
		System.out.println("现在是北京时间：20点， "+this.name+"正在写作业！");
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
