package test;

import java.util.HashMap;
import java.util.Map;

public class QuickSort {
	public static void sort(int[] arr, int left, int right) {
		if(left < right) { //�ݹ�ĳ���
			//���Ȱ���������ı߽��¼����
			int left_temp = left;
			int right_temp = right;
			
			int base = arr[left];//�������Ϊ��׼��.
			
			while(left < right) {
				// ����������.
				while(left < right && arr[right] >= base) {
					right--;
				}
				
				arr[left] = arr[right];//�����ݸ�ֵ�����
				
				while(left < right && arr[left] <= base) {
					left++;
				}
				
				arr[right] = arr[left];
			}
			
			//���ѭ������, ��ζleft��right��ͬ��. 
			arr[left] = base;
			//�����left, ������һ�εݹ�ı߽�
			//����ݹ�
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
		map.put("jay", "�ܽ���");
	}
}
