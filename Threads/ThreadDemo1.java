package Threads;

public class ThreadDemo1 extends Thread{
	   boolean res;
	public  void run() {
		if(res) {
		System.out.println("thread is running");
		for(int i=1;i<=5;i++) {
			System.out.println(i);
			res=false;
		}
		
		}
		else {
			System.out.println("Death");
		}
	}
		
	public static void main(String[] args) {
	ThreadDemo1 thread=new ThreadDemo1();
	Thread t1=new Thread(thread);
	t1.start();thread.res=true;	
    }
}


