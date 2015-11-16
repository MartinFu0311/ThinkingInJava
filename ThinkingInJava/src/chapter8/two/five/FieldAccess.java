package chapter8.two.five;

public class FieldAccess {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * 子类的getField()方法覆盖了父类的同名方法，父类和子类都有一个field字段，
		 * 向上转型后调用的仍然是子类的方法，因为域的访问是由编译器解析的，所以访问的是
		 * 子类的field字段
		 */
		Super sup = new Sub();
		System.out.println("sup.field = " + sup.field +   // 0
				", sup.getField() = " + sup.getField());  // 1  
		
		Sub sub = new Sub();
		System.out.println("sub.field = " + sub.field +
				", sub.getField() = " + sub.getField() +
				", sub.getSuperField() = " + sub.getSuperField());
		
	}

}
