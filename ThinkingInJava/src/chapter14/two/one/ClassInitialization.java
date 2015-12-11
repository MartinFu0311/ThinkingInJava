package chapter14.two.one;

import java.util.*;

public class ClassInitialization {
	
	public static Random rand = new Random(47);

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Class<?> initable = Initable.class;  //此种方式不会引发Class初始化
		System.out.println("After creating Initable ref");
		System.out.println(Initable.staticFinal);  //编译期常量才能不需对Class对象进行初始化就可以使用
		System.out.println(Initable.staticFinal2);
		
		System.out.println(Initable2.staticNonFinal);  //static final值是编译期常量，但这个只是static不是final，所以需要引发初始化，需要分配空间
		
		Class<?> initable3 = Class.forName("chapter14.two.one.Initable3");  //引发初始化
		System.out.println("After creating Initable3 ref");
		System.out.println(Initable3.staticNonFinal);
	}

}
