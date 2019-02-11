package com.pra.Searching;

public class LinearSearch {
	
	public int searchIndex(int arr[],  int a ) {
	int index = -1;
	for (int i=0; i<arr.length; i++) {
		if (arr[i] == a) {
			index = i;
		}
	}
	return index;	
	}
	
	public static void main(String[] args) {
		
		int[] arr =  new int[5]{100,200,300,400,500};
		LinearSearch search = new LinearSearch();
		search.searchIndex(arr, a);
	}

}
