package chapter8.two.four;

/*
 * 父类的f()方法是私有的，子类也定义了一个同名的方法，由于private方法被自动认为是final的，所有对子类
 * 不可见，那么子类中的f（）方法是一个全新的方法。
 * 如果将子类向上转型为父类，调用f()方法，那么调用的就是父类的方法，因为父类中自己有这样一个方法，而不是被
 * 子类的方法所覆盖。
 */
public class PrivateOverride {

	private void f(){
		System.out.println("private f()");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrivateOverride p = new PublicOverride();
		p.f();
		
		PublicOverride p1 = new PublicOverride();
		p1.f();
	}

}
