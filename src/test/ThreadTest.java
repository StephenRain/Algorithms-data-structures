package test;

import bean.Tong;
import thread.ShiFu;
import thread.Student;

public class ThreadTest {
	
	public static void main(String[] args) {
		Tong t = new Tong();
		ShiFu shiFu1 = new ShiFu(t);
		ShiFu shiFu2 = new ShiFu(t);
		Student stu = new Student(t);
		shiFu1.start();
		System.out.println("һ���߳̿��������ŵȴ�����");
		shiFu2.start();
		System.out.println("������ʦ������");
		stu.start();
	}

}
