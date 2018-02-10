package test;

public class BinarySearch {
	
	public static boolean search(int[] arr, int n) {
		int left = 0;
		int right = arr.length-1;//���һ��
		while(left <= right) {
			
			int middle = (left+right)/2;
			
			if(n > arr[middle]) { //Ӧ�����Ұ벿��
				left = middle+1;
			} else if(n < arr[middle]) { //��벿��
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
		 * ?????Ϊʲô���ֵĽ����һ����������
		 */
		System.out.println(search(arr2,123));
	}

}
