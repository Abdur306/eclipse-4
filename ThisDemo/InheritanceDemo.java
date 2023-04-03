package ThisDemo;

public class InheritanceDemo {
  
		 public static void main(String[] args) 
		 {  
		  // Create an object of the derived class.           
			 Abdur abu = new Abdur(); 
			// abu.ownaction();
			 abu.action();
			// Human obj = new Abdur();
			// obj.action();
			 

		 // Call features() method from the derived class using object reference variable d.             
		       //abu.action(); // Call ownFeature() method using reference variable d.            
		        // abu.ownaction();
		       }
}

	class Human
	{    
	  void action()
	  {      
	    System.out.println("he will sleep");      
	    System.out.println("he will work");   
	  } 
	 } 
 class Abdur extends Human
	{  
	// @Override
//	void action() {
//		// System.out.println("im abudr");
//			super.action();
//	}
	  void ownaction()
	  {   
		 // super.action();
	     System.out.println("im abdur "); 
	    // super.action();
	  } 
	}

	
	
	
