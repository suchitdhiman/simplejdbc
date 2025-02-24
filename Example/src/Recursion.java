
public class Recursion {
	
	public int printNumbers(int n) {
		
		if(n == 1) {
			
			return n*n*n;
			
		}
		
		System.out.println(printNumbers(n-1));
		return n*n*n;
	}

	public static void main(String[] args) {
		Recursion re = new Recursion();
		System.out.println(re.printNumbers(20));
		

	}

}
