package vijay.com.interview;

public class SwitchDefault1 {

	public static void main(String[] args) {
		int a = 80;
		
		switch(a)
		{
		case 20:
			System.err.println("It's 20....");
		default:
			System.err.println("No Value.....");
		case 10:
			System.err.println("It's 90....");
		}
		System.err.println(testFinallyReturn());
		
	}

	private static int testFinallyReturn() {
		int x;
		try {
			x = 100;
			return x;
		}
		catch(Exception e) {
			return 20;
		}
		finally {
			x = 200;
			System.err.println("x is "+x);
		}
	}

}
