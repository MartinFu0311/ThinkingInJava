package chapter8;

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
