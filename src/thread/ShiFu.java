package thread;

import bean.Mantou;
import bean.Tong;
/*
 * ����ͷ
 */
public class ShiFu  extends Thread{
	
	private Tong t;
	//��ͷ�ı��
	private static int id = 1;
	
	
	public ShiFu(Tong t){
		this.t = t;
	}
	
	@Override
	public void run() {
		
		while(true){
			Mantou mt = new Mantou(id);
			t.push(mt);
			System.out.println("��"+id+"����ͷ��������");
			id++;
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	
	
}
