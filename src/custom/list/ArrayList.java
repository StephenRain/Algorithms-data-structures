package custom.list;


/**
 * 自己实现ArrayList
 */
public class ArrayList {

	//内部维护的数组
	private int[] arr ;
	//数组的实际大小
	private int index  = 0;
	//集合默认初始大小
	private int size = 8;
	
	public ArrayList(){
		arr = new int[size];
	}
	
	public ArrayList(int len){
		size = len;
		arr = new int[size];
	}
	
	public void add(int data){
		//判断如果最大索引超过内部数组一半，扩容
		if(size / 2 < index){
			size = size * 2;
			int[] temp =  new int[size];
			for(int i = 0;i <arr.length;i++){
				temp[i] = arr[i];
			}
			arr = temp;
		}
		arr[index] = data;
		index++;
	}
	
	
	//获取
	public int get(int index){
		if(index >= this.index || index < 0){
			throw new ArrayIndexOutOfBoundsException("数组角标越界");
		}
		return arr[index];
	}
	
	//集合大小 -》数组实际大小
	public int size(){
		return this.index;
	}
	
}
