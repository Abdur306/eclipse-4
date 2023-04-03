package ThisDemo;

public class Overide {
public static void main(String[] args) {
//	Developer2 obj=new Developer2();
//			obj.doWork();
//			Backend2 obj1=new Backend2();
//			obj1.doWork();
//			obj1.work();
	//Frontend fe=new Developer2()
	 Developer2 dev=new Frontend2();
	 dev.doWork();
	Recruit2 manager=new Recruit2();
	manager.developer=new Backend2();
	manager.developer.work();
	manager.developer.doWork();
	
	 
			
}
}
/*code reuseability
 * to if_else
 * part/whole 
 * obeject reuseability
 * to achives polymoprhy*/

class  Recruit2{
	Backend2 developer;
}
class Developer2{
	public void doWork() {
		System.out.println("work");
	}
}
class Backend2 extends Developer2{
	public void work() {
		System.out.println("backend work");
	}
}
class Frontend2 extends Developer2{
	public void work() {
		System.out.println("Fornt work");
	}	
}
class Testing2 extends Developer2{
	public void work() {
		System.out.println("Tester work");
	}
}
