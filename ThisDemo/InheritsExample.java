package ThisDemo;

public class InheritsExample {

	public static void main(String[] args) {
		
//		Frontend devop=new Frontend();
//		devop.ownmet();
//		devop.met();
//		System.out.println(devop.age);
		
		Recruit manager=new Recruit();
		manager.devop=new Frontend();
		manager.devop.met();
		manager.devop.met();
		
	}
}
/*by creating devop  variable in Recruit class .So that Recruit obj has become reuseable known as obj reuse.*/
class Recruit{
Developer devop;	
}
class Developer{
	//int age=25;
	public void met() {
		System.out.println("im a  developer");
	}
}
class  Frontend extends Developer{
	public void ownmet() {
		System.out.println("Frontend devop ....");
	}
	
}
class Backend extends Developer{
	public void ownmet() {
		System.out.println("backend devop");
	}
	
}
class Testing extends Developer{
	public void ownmet() {
		System.out.println("testing devop");
	}
	
}
