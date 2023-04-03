package Threads;

public class SetPriorityDemo {
public static void main(String[] args) {
	X x=new X();
	Y y=new Y();
	Z z=new Z();
	Thread t1=new Thread(x);
	Thread t2=new Thread(y);
	Thread t3=new Thread(z);
	
	t1.setPriority(7);
	t2.setPriority(7);
	t3.setPriority(9);
	
	t1.start();t2.start();t3.start();
}
}
class X implements Runnable{
	@Override
	public void run() {
	System.out.println("X start");
	for(int i=1;i<=4;i++) {
		System.out.println("X :"+i);
	}
	System.out.println("X end");
		
	}
}
class Y implements Runnable{
	@Override
	public void run() {
		System.out.println("Y start");
		for(int i=1;i<=4;i++) {
			System.out.println("Y :"+i);
		}
		System.out.println("Y end");
					
	}
}
class Z implements Runnable{
	@Override
	public void run() {
		System.out.println("Z start");
		for(int i=1;i<=4;i++) {
			System.out.println("Z :"+i);
		}
		System.out.println("Z end");
			
	}
}