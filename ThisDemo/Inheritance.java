package ThisDemo;

public class Inheritance {

	public static void main(String[] args) {
//       PrayerHall ph=new PrayerHall();
//       ph.action();
//       ph.dowork();
       Hall h=new PrayerHall();
       h.action();
       h.dowork();
       
	}
}
class Hall{
	public void dowork() {
		System.out.println("eat..");
		System.out.println("sleep...");
	}
	public void action() {
		System.out.println("hall..hall");
	}
}
class PrayerHall extends Hall{
	@Override
	public void action() {
	System.out.println("Prayer...");
	//	super.action();
	}
}
class TrainingHall extends Hall{
	
	
}
class PartyHall extends Hall{
	
}