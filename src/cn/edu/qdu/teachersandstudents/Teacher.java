package cn.edu.qdu.teachersandstudents;

import java.util.Scanner;

public class Teacher {
	private String name;
	private String major;
	private String lesson;
	private int teachAge;

	public Teacher() {
		Scanner input = new Scanner(System.in);
		System.out.print("��������ʦ������");
		this.name = input.next();
		System.out.print("��������ʦרҵ��");
		this.major = input.next();
		System.out.print("��������ʦ�����ڵĿγ̣�");
		this.lesson = input.next();
		System.out.print("��������ʦ���䣺");
		this.teachAge = input.nextInt();
	}

	public void teach() {
		System.out.println(this.name + "��ʦ�������ི��" + this.lesson + "�γ̣�");
	}
	public void checkHomeWork(Student stu){
		System.out.println("���ڣ�"+this.lesson+"����ʦ��"+this.name+"�Ѿ�������ϣ�"+stu.getName()+" ����ҵ��");
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