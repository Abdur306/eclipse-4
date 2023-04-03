package ThisDemo;
public class Demo1 {
            /*it refers the current object of the instance variables*/
	public static void main(String[] args) {
		Test t1=new Test(10,20);
		t1.display();
		Test t2=new Test(40, 50);
		t2.display();

	}

}
class Test{
	public Test(int a,int b) {
		this.a=a;
		this.b=b;
	}
	int a,b;
	void display() {
		System.out.println("a = "+a+" b = "+b);
	}
}
