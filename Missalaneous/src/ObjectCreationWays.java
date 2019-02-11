
public class ObjectCreationWays {

	public static void main(String[] args) throws ClassNotFoundException, 
	InstantiationException, IllegalAccessException {
		
		ObjectCreationWays ways = new ObjectCreationWays();
		System.out.println("11111111111"+ways);
		
		ObjectCreationWays obj = (ObjectCreationWays)Class.forName("ObjectCreationWays").newInstance();
		
		System.out.println("22222222222222"+obj);
	}

}
