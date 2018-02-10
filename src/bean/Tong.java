package bean;

public class Tong {
	
	public  int age;
	
	//ά��һ������
	private  Mantou[] t = new Mantou[10];

	//ջ��ָ��(����)
	private int index = 0;
	
	//ȡ��ͷ
	public synchronized Mantou pop(){
		while(index == 0){
			try {
				this.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		this.notifyAll();
		index --;
		return t[index];
	}
	//�����ͷ
	public synchronized void push(Mantou mt){
		while(index == 10){
			try {
				this.wait();
			} catch (InterruptedException e) {
			}
		}
		this.notifyAll();
		t[index] = mt;
		index ++;
	}
}
