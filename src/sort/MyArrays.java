package sort;
/**
 * 实现了选择排序、冒泡排序，二分查找、及快速排序
 */
public class MyArrays {
	 
	/**
	 * 二分查找法 :（条件必须要是有序的数组）
	 * @param int[] arr :有序的整形数组
	 * @param value  : 要查找的值 
	 * 找到返回索引值，找不到返回 -1;
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
	 * 冒泡排序:从小到大
	 */
	public static void bubbleSort(int[] arr) {
		//外层循环通过i控制内层循环的次数
		for(int i = 0;i < arr.length -1;i++ ){
			//内层循环通过J控制数组中相邻的两个数比较
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
	 * 选择排序：从小到大排序
	 */
	public static void selectSort(int[] arr){
		//外层循环一次会将数组中的最值依次放到左边
		for(int i = 0; i < arr.length-1; i++){
			//内层循环是将i后面的数据依次和i对应的数据对比
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
	 * 对数组进行快速排序
	 * left :最左边的索引
	 * right :最右边的索引
	 */
	public static void quickSort(int[] arr, int left,int right){
		//退出条件
		if(right < left)
			return ;
				
		int t_left = left;
		int r_right = right;	
		int base = arr[left];	//定义基准点
		
		while(left < right){
			
			//先从右边开始查找直到找到 小于等于 基准点的数 假设为m停止下来，记录其索引
			//注意：	arr[right] >= base ，包含相等的情况
			while(left < right && arr[right] >= base){
				right --;
			}
			arr[left] = arr[right];
			//再从左边开始查找，直到找到左边大于等于基准点的数假设为n，记录索引
			while(left < right && arr[left] <= base){
				left ++ ;
			}
			arr[right] = arr[left];
		}
		
		arr[left] = base;
		//当left= right时，对该索引两边的数据在进行上述操作
		quickSort(arr,t_left,left-1);
		quickSort(arr,left+1,r_right);
		
	}
	
 
	
	/**
	 * 通过StringBuilder遍历输出数组
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

