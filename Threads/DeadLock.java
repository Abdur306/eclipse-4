package Threads;

public class DeadLock {

	public static void main(String[] args) {
     Crane cn=new Crane();
     Frog fog=new Frog();
     
     Thread cnethread=new Thread(new CraneJob(cn, fog));
     cnethread.start();
     Thread fogthread =new Thread(new FrogJob(cn, fog));
     fogthread.start();
		

	}
}
class Crane{
	public void eat(Frog frog) {
		System.out.println();
		frog.leaveCrane();
	}
	public void leaveFrog() {
		System.out.println();
	}
}
class Frog{
	public void escape(Crane crane) {
		
		crane.leaveFrog();
	}
	public void leaveCrane() {
		System.out.println();
	}
}
class CraneJob implements Runnable{
	Crane crane;Frog frog;
	public CraneJob(Crane crane,Frog frog) {
	this.crane=crane;
	this.frog=frog;
	}
	@Override
	public void run() {
	crane.eat(frog);
		
	}
}
class FrogJob implements Runnable{
	Crane crane;Frog frog;
	public FrogJob(Crane crane,Frog frog) {
	this.crane=crane;
	this.frog=frog;
	}
	@Override
	public void run() {
frog.escape(crane);	
		
	}
}

