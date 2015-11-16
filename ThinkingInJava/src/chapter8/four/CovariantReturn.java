package chapter8.four;

public class CovariantReturn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Mill m = new Mill();
		Grain g = m.process();
		System.out.println(g);
		
		/*
		 * Wheat类的process()方法覆盖父类Mill类的同名方法，但返回类型不一样，前者是后者
		 * 的子类，称为协变
		 */
		m = new WheatMill();
		g = m.process();
		System.out.println(g);
		
	}

}
