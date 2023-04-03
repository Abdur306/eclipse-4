package ThisDemo;
class A2
{
	void greet()
	{
		System.out.println("hi by A");
	}
}

	class  B2 extends A2
	
	{
		@Override
		void greet() {
			System.out.println("hi by B");
		}
		void greet(A2 c)
		{
			super.greet();
		}
}
	class C extends B2
	{
		void greet(B2 o) {
			
		}
	}
public class InheritDemo2 {

	public static void main(String[] args) {
		B2 c = new C();
		c.greet(c);

	}

}
