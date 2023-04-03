package ThisDemo;

public class OverideDemo {

	public static void main(String[] args) {
		Human2 abu=new Haroon();
		abu.dowork();
//Abdur1 abu =new Abdur1();
//abu.dowork();
	}

}
class Human2{
	public void dowork() {
		System.out.println("work...");
	}
}
class Abdur1 extends Human2{
	@Override
	public void dowork() {
		System.out.println("abdur work");
		super.dowork();
	}
}
class Haroon extends Human2{
	@Override
	public void dowork() {
		System.out.println("Haroon work");
		super.dowork();
	}
}