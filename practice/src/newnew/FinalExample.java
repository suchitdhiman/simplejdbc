package newnew;

public class FinalExample {
	
	String name;
	final int x;
	static final int y ;
	
	static{
		y = 12;
	}
	
	{
		x=123;
	}
	
	
	

	public static void main(String[] args) {
		
		FinalExample fe = new FinalExample();
		
		System.out.println(fe.x);
		
	
		

	}

}
