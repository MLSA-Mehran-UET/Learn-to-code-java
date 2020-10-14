public class Example1 {
	
	public static void main(String[] args) {
		long result = calculateFactorial(4);
		System.out.println(result); // returns 24 (1 x 2 x 3 x 4) 
	}
	
	public static long calculateFactorial(int n) {
		if (n > 0) {
			return n * calculateFactorial(n - 1);
		} else {
			return 1;
		}
	}
}