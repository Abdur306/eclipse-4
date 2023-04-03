package ThisDemo;

public class Demo3 {
        /*invoke current class*/
	public static void main(String[] args) {
		B t1=new B();

	}
}
class B{
	public B() {
		this(10,20);
		System.out.println("default cons..");
	}
	public B(int c,int d) {
	         a=c;
		     b=d;
		System.out.println("para cons.."+a+b);
		
	}
	int a,b;
}