package thread;

import bean.Mantou;
import bean.Tong;
/*
 * 做馒头
 */
public class ShiFu  extends Thread{
	
	private Tong t;
	//馒头的编号
	private static int id = 1;
	
	
	public ShiFu(Tong t){
		this.t = t;
	}
	
	@Override
	public void run() {
		
		while(true){
			Mantou mt = new Mantou(id);
			t.push(mt);
			System.out.println("第"+id+"号馒头做出来了");
			id++;
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	
	
}
