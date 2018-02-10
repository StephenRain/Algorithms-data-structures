package custom.list;


/**
 * �Լ�ʵ��ArrayList
 */
public class ArrayList {

	//�ڲ�ά��������
	private int[] arr ;
	//�����ʵ�ʴ�С
	private int index  = 0;
	//����Ĭ�ϳ�ʼ��С
	private int size = 8;
	
	public ArrayList(){
		arr = new int[size];
	}
	
	public ArrayList(int len){
		size = len;
		arr = new int[size];
	}
	
	public void add(int data){
		//�ж����������������ڲ�����һ�룬����
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
	
	
	//��ȡ
	public int get(int index){
		if(index >= this.index || index < 0){
			throw new ArrayIndexOutOfBoundsException("����Ǳ�Խ��");
		}
		return arr[index];
	}
	
	//���ϴ�С -������ʵ�ʴ�С
	public int size(){
		return this.index;
	}
	
}
