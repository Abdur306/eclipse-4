package Threads;

public class ThreadDemo6 {

	public static void main(String[] args) {
        Thread t1=new Thread(new TRunnable());
        Thread t2=new Thread(new T2Runnable());
        t1.start();
        t2.start();
	}
}

class TRunnable implements Runnable{
	@Override
	public void run() {
		for(int i=1;i<=5;i++) {
			Thread.yield();
			System.out.println("T1 thread"+i);
		}	
		
	}
}
class T2Runnable implements Runnable{
	@Override
	public void run() {
		for(int i=1;i<=5;i++) {
			
			System.out.println("T2 thread"+i);
		}	
	}
}

