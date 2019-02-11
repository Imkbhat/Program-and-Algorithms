
public class BinarySearchJavaImpl {

	
	public int binarySearch(int arr[], int l, int h, int x) {
		
		if (h>=l) {
			int mid = (l+h)/2;
			if (arr[mid] == x)
				return mid;
			
			if (arr[mid] > x)
				return binarySearch(arr, l, mid-1, x);
			
			return binarySearch(arr, mid+1, h, x);
		}
		
		return -1;
		
	}
	
	
	public static void main(String[] args) {

		int[] arr = {1,3,4,5,6,7,8,10,11,12,13,14,15,16,17,18,19,20};
		BinarySearchJavaImpl impl = new BinarySearchJavaImpl();
		int l =0;
		int h = arr.length-1;
		int x = 20;
		
		int element = impl.binarySearch(arr, l, h, x);
		
		if (element == -1) 
            System.out.println("Element not present"); 
        else
            System.out.println("Element found at index " + element); 
		
		
	}

}
