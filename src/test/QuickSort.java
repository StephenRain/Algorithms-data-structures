package test;

import java.util.HashMap;
import java.util.Map;

public class QuickSort {
	public static void sort(int[] arr, int left, int right) {
		if(left < right) { //递归的出口
			//首先把左右两侧的边界记录下来
			int left_temp = left;
			int right_temp = right;
			
			int base = arr[left];//最左侧作为基准点.
			
			while(left < right) {
				// 从右向左找.
				while(left < right && arr[right] >= base) {
					right--;
				}
				
				arr[left] = arr[right];//把数据赋值到左边
				
				while(left < right && arr[left] <= base) {
					left++;
				}
				
				arr[right] = arr[left];
			}
			
			//外层循环结束, 意味left和right相同了. 
			arr[left] = base;
			//这里的left, 就是下一次递归的边界
			//进入递归
			sort(arr,left_temp, left-1);
			sort(arr,left+1, right_temp);
		}
	}
	
	public static void main(String[] args) {
		int[] am = {7,6,5,4,2,8,5,3,1,9,12,33,12,5};
		sort(am, 0, am.length-1);
		
		for(int i = 0 ; i < am.length;i++) {
			System.out.print(am[i]+"\t");
		}
		
		Map map = new HashMap();
		map.put("jay", "周杰伦");
	}
}
