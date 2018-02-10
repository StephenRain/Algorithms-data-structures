package sort;
/**
 * ʵ����ѡ������ð�����򣬶��ֲ��ҡ�����������
 */
public class MyArrays {
	 
	/**
	 * ���ֲ��ҷ� :����������Ҫ����������飩
	 * @param int[] arr :�������������
	 * @param value  : Ҫ���ҵ�ֵ 
	 * �ҵ���������ֵ���Ҳ������� -1;
	 */
	public  static int binarySearch(int[] arr,int value) {
		
		int s = 0;
		int e = arr.length - 1;
		while( s <= e){
			int m = (s +e ) / 2;
			if(value > arr[m]){
				s = m +1;
			}else if(value < arr[m]){
				e = m -1;
			}else{
				return m;
			}
		}
		return -1;
	}
	/**
	 * ð������:��С����
	 */
	public static void bubbleSort(int[] arr) {
		//���ѭ��ͨ��i�����ڲ�ѭ���Ĵ���
		for(int i = 0;i < arr.length -1;i++ ){
			//�ڲ�ѭ��ͨ��J�������������ڵ��������Ƚ�
			for(int j = 0 ; j < arr.length-1-i;j++){
				if(arr[j+1] < arr[j]){
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
	}
	

	/**
	 * ѡ�����򣺴�С��������
	 */
	public static void selectSort(int[] arr){
		//���ѭ��һ�λὫ�����е���ֵ���ηŵ����
		for(int i = 0; i < arr.length-1; i++){
			//�ڲ�ѭ���ǽ�i������������κ�i��Ӧ�����ݶԱ�
			for(int j = i+1;j<arr.length;j++){
				if(arr[i] > arr[j]){
					int temp = arr[i];
					arr[i]= arr[j];
					arr[j]=temp;
				}
			}
		}
	}
	
	/**
	 * ��������п�������
	 * left :����ߵ�����
	 * right :���ұߵ�����
	 */
	public static void quickSort(int[] arr, int left,int right){
		//�˳�����
		if(right < left)
			return ;
				
		int t_left = left;
		int r_right = right;	
		int base = arr[left];	//�����׼��
		
		while(left < right){
			
			//�ȴ��ұ߿�ʼ����ֱ���ҵ� С�ڵ��� ��׼����� ����Ϊmֹͣ��������¼������
			//ע�⣺	arr[right] >= base ��������ȵ����
			while(left < right && arr[right] >= base){
				right --;
			}
			arr[left] = arr[right];
			//�ٴ���߿�ʼ���ң�ֱ���ҵ���ߴ��ڵ��ڻ�׼���������Ϊn����¼����
			while(left < right && arr[left] <= base){
				left ++ ;
			}
			arr[right] = arr[left];
		}
		
		arr[left] = base;
		//��left= rightʱ���Ը��������ߵ������ڽ�����������
		quickSort(arr,t_left,left-1);
		quickSort(arr,left+1,r_right);
		
	}
	
 
	
	/**
	 * ͨ��StringBuilder�����������
	 */
	public static void printArr(int[] arr){
		
		StringBuilder sb =new StringBuilder();
		sb.append("[");
		for( int i =0;i<arr.length;i++){
		 
			sb.append(arr[i]);
			if(i == arr.length-1){
				 
				sb.append("]");
			}else{
				 
				sb.append(" ,");
			}
		}
		System.out.println(sb.toString());
	
	}
	
	public static void main(String[] args) {
		int[] arr = {123,23,54,5,78,20,55,2};
		//selectSort(arr);
		quickSort(arr,0,arr.length);
		printArr(arr);
	}
	
}

