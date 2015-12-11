package chapter14.two.one;

public class Initable {

	static final int staticFinal = 47;
	
	static final int staticFinal2 = ClassInitialization.rand.nextInt(1000);
	
	static{
		System.out.println("Initializing Initable");
	}
	
}
