package bean;

public class Tong {
	
	public  int age;
	
	//维护一个数组
	private  Mantou[] t = new Mantou[10];

	//栈顶指针(索引)
	private int index = 0;
	
	//取馒头
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
	//添加馒头
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
