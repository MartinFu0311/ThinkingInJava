package chapter8.two.five;

public class Sub extends Super {

	public int field = 1;
	
	public int getField(){
		System.out.println("sub get field");
		
		return field;
	}
	
	public int getSuperField(){
		return super.field;
	}
	
}
