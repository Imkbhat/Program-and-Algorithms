
public class IlleagalStateException {

	public static void main(String[] args) {
		
		try {
			Thread t = new Thread();
			t.setPriority(10);
			t.setPriority(100);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

}
