package test;

public class BinarySearch {
	
	public static boolean search(int[] arr, int n) {
		int left = 0;
		int right = arr.length-1;//最后一项
		while(left <= right) {
			
			int middle = (left+right)/2;
			
			if(n > arr[middle]) { //应该在右半部分
				left = middle+1;
			} else if(n < arr[middle]) { //左半部分
				right = middle-1;
			} else {
				return true;
			}
		}
		return false;
	}
	
	public static void main(String[] args) {
		int[] arr1 = {1,5,7,12,13,18,35,47,56,88};
		int[] arr2= {234,26,767,234,345,123};
		/**
		 * ?????为什么出现的结果不一样？？？？
		 */
		System.out.println(search(arr2,123));
	}

}
