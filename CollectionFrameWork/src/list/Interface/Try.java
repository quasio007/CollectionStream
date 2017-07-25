package list.Interface;

public class Try {

	public static void main(String[] args) {
		A x =new C();
		B y =new D();

	}

}


interface A{
	void m1();
}
interface B extends A{
	void m2();
}
class C implements A{

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		
	}


	
}

class D implements B{

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void m2() {
		// TODO Auto-generated method stub
		
	}
	
}