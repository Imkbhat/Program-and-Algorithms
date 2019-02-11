import java.util.Arrays;
import java.util.Collections;


public class BinarSearch {

	public static void main(String[] args) {
		
		int[] arrays = {10,22,33,2,16,5};
		
		Arrays.sort(arrays);
		int key = 33;
		int result = Arrays.binarySearch(arrays, key);
		if(result > 0) {
			System.out.println("Element found at Position"+ result);
		} else  {
			System.out.println("Not Found");
		}
		
	}
}
