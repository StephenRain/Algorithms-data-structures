package thread;

import bean.Mantou;
import bean.Tong;

/*
 * 
 */
public class Student extends Thread{

	private Tong t;
	
	
	public Student(Tong t){
		this.t = t;
	}
	
	@Override
	public void run() {
		
		while(true){
			Mantou mt = t.pop();
			System.out.println("学生吃了"+mt.getId()+"馒头");
			
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		
		
	}
}
