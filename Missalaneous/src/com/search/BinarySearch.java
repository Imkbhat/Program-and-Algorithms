package com.search;

public class BinarySearch {

	
	public int binarySearch(int[] arr, int low, int high, int key) {
		
		if(high >= low) {
		int mid = (low+high)/2;
		if (arr[mid] == key)
			return mid;
		
		if (arr[mid] > key)
			return binarySearch(arr, low, mid-1, key);

			return  binarySearch(arr, mid+1, high,  key);
		}
		return -1;
	}
	
	
	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5,6,7,8,9,10};
		int l = 0;
		int h = arr.length-1;
		int key = 3;
		BinarySearch bn = new BinarySearch();
		int element = bn.binarySearch(arr, l, h, key);
		if (element == -1) {
			System.out.println("Not Found");
		} else {
			System.out.println("Found at Position ==>"+element);
		}
		
	}

}
