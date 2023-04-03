package Practice;

public class ThreadDemo {

	public static void main(String[] args) {
	System.out.println("1 sisout");
	met();
	System.out.println("2.sisout");

	}
	public static void met() {
		System.out.println("met meth called");
		try {Thread.sleep(2000);}catch(Throwable e) {}
		}
}
