package chapter14.two;

public class ToyTest {

	static void printInfo(Class<?> cc){
		System.out.println("Class name: " + cc.getName() + 
				" is interface? [" + cc.isInterface() + "]");
		
		System.out.println("Simple name: " + cc.getSimpleName());
		
		System.out.println("Canonical name: " + cc.getCanonicalName());
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Class<?> c = null;
		
		try{
			c = Class.forName("chapter9.two.FancyToy");
		}catch(ClassNotFoundException e){
			System.out.println("Can't find FancyToy");
			System.exit(0);
		}
		
		printInfo(c);
		
		for(Class<?> face: c.getInterfaces()){
			printInfo(face);
		}
		
		Class<?> up = c.getSuperclass();
		Object obj = null;
		
		try{
			obj = up.newInstance();
		}catch(InstantiationException e){
			System.out.println("Can't instantiate");
			System.exit(0);
		}catch(IllegalAccessException e){
			System.out.println("Can't access");
			System.exit(0);
		}
		
		printInfo(obj.getClass());
	}

}
