package Threads;

import java.time.LocalTime;

public class ThreadDemo5 {

	public static void main(String[] args) {
		
		Briyani abu=new Briyani();
		Thread t=new Thread(abu);
		t.start();
		
		
		FiredRice fr=new FiredRice();
		Thread t2=new Thread(fr);
		t2.start();
		
	}
}
class Briyani implements Runnable{
	@Override
	synchronized public  void run() {
		LocalTime t1=LocalTime.now();
		//VegCutting();
		//Boiling();
		//RiceCook();
		MuttonCook();
		Mixture();
		LocalTime t2=LocalTime.now();
		int sec=t2.getSecond()-t1.getSecond();
		System.out.println("Time Took for briyani "+sec);
		
	}
	
	public void VegCutting() {
		System.out.println("veg cutting.");
		try {Thread.sleep(5000);}catch(Exception e) {}
		System.out.println("veg cutted.");
	}
	public void Boiling() {
		System.out.println("water boiling.");
		try {Thread.sleep(5000);}catch(Exception e) {}
		System.out.println("water boiled.");
		
	}
	public void RiceCook() {
		System.out.println("Rice cook.");
		try {Thread.sleep(5000);}catch(Exception e) {}
		System.out.println("Rice cooked.");
		
	}
	 public void MuttonCook() {
		System.out.println("Mutton cook.");
		try {Thread.sleep(3000);}catch(Exception e) {}
		System.out.println("Mutton cooked.");
		
	}
	 public void Mixture() {
		System.out.println("Mixture processing.");
		try {Thread.sleep(3000);}catch(Exception e) {}
		System.out.println("Mixture processed.");
	}
}
class FiredRice implements Runnable{
	@Override
	synchronized public void run() {
		LocalTime t1=LocalTime.now();
		Chicken();
		Rice();
		//MixRice();
		LocalTime t2=LocalTime.now();
		int sec=t2.getSecond()-t1.getSecond();
		System.out.println("Time Took  friedRice "+sec);
		
	}
	 public void Chicken() {
		System.out.println("Chicken is preparing...");
		try {Thread.sleep(6000);}catch(Exception e) {}
		System.out.println("Chicken is prepared...");
	}
	 public void Rice() {
		System.out.println("Rice is preparing...");
		try {Thread.sleep(6000);}catch(Exception e) {}
		System.out.println("Rice is prepared...");
		}
	public void MixRice() {
		System.out.println("FriedRice is preparing...");
		try {Thread.sleep(5000);}catch(Exception e) {}
		System.out.println("FriedRice is prepared...");
	}
	
}
