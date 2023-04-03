package Threads;

public class ThreadDemo2 {
	public ThreadDemo2() {
		Myrunnable my=new Myrunnable();
	Thread t=new Thread(new Myrunnable());
	t.start();
	}
public static void main(String[] args) {
	new ThreadDemo2();
	for(int i=1;i<=5;i++) {
		System.out.println(i);	
		try {Thread.sleep(5000);}catch(Exception e) {}
		
	}
}
}

class Myrunnable implements Runnable {
	@Override
	public  void run() {
	System.out.println("myrun is running");
		try {Thread.sleep(2000);}catch(Exception e) {}
	}
}
