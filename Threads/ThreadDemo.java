package Threads;

public class ThreadDemo {

	public static void main(String[] args) {
		
		Counter c1=new Counter();
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				synchronized(Counter.class) {
				c1.Setcash(2000);
				try {c1.wait();}catch(Exception e) {}
				System.out.println("Change of c1= "+c1.ChangeSet());
				}
			}
		}).start();
		
		Counter c2=new Counter();
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				synchronized(Counter.class) {
			c2.Setcash(1000);
			//try {Thread.sleep(3000);}catch(Exception e) {}
			System.out.println("Change of c2= "+c2.ChangeSet());
				}
				
			}
		}).start();
	}
}
class Counter{
	static int change=0;
	
	public static void Setcash(int c) {
		change=c;
	}
	public static int ChangeSet() {
		return change-400;
	}
}
