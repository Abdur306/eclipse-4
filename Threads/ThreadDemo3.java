package Threads;

public class ThreadDemo3 {
public static void main(String[] args) {
	
	Thread t=new Thread(new Demo());
	t.start();
	System.out.println("main thread......");
}
}
class  Demo implements Runnable{
	@Override
	public void run() {
   go();
	}
	public void go() {
		doMore();
	}
	public void doMore() {
		System.out.println("top to stack");
	}
}
