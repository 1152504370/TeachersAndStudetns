package cn.edu.qdu.teachersandstudents;

import java.util.Scanner;

public class Teacher {
	private String name;
	private String major;
	private String lesson;
	private int teachAge;

	public Teacher() {
		Scanner input = new Scanner(System.in);
		System.out.print("请输入老师姓名：");
		this.name = input.next();
		System.out.print("请输入老师专业：");
		this.major = input.next();
		System.out.print("请输入老师所讲授的课程：");
		this.lesson = input.next();
		System.out.print("请输入老师教龄：");
		this.teachAge = input.nextInt();
	}

	public void teach() {
		System.out.println(this.name + "老师正在辛苦讲：" + this.lesson + "课程！");
	}
	public void checkHomeWork(Student stu){
		System.out.println("讲授："+this.lesson+"的老师："+this.name+"已经批改完毕："+stu.getName()+" 的作业！");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public String getLesson() {
		return lesson;
	}

	public void setLesson(String lesson) {
		this.lesson = lesson;
	}

	public int getTeachAge() {
		return teachAge;
	}

	public void setTeachAge(int teachAge) {
		this.teachAge = teachAge;
	}

}
