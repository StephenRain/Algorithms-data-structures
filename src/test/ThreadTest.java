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
		System.out.println("一号线程开启，二号等待开启");
		shiFu2.start();
		System.out.println("二号老师傅启动");
		stu.start();
	}

}
