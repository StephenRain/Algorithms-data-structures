package test;

import static org.junit.Assert.*;

import java.util.LinkedList;

import org.junit.Test;

import sort.MyArrays;

public class ArrayTest {

	@Test
	public void test() {
		int[] arr= {2324,444,55,636,3747,848,995,1000};
 
		//int ind = MyArrays.binarySearch(arr, 99);
		//System.out.println(ind);
//		for (int i : arr) {
//			System.out.println(i);
//		}
		
		//MyArrays.bubbleSort(arr);
		MyArrays.selectSort(arr);
		MyArrays.printArr(arr);
		
		
	}

}
