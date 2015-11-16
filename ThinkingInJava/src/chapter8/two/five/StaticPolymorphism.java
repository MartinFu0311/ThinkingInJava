package chapter8.two.five;

public class StaticPolymorphism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StaticSuper sup = new StaticSub();
		System.out.println(sup.staticGet());  //静态方法没有多态机制
		System.out.println(sup.dynamicGet());
		
	}

}
