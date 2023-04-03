package ThisDemo;

public class Demo2 {

	public static void main(String[] args) {
	
		A t1=new A();
		t1.display();
		
	}
}
class A{
	void display() {
		this.show();
		System.out.println("display meth..");
		
	}
	void show() {
		System.out.println("show met..");
	}
}
