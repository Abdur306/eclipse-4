package ThisDemo;

public class ObjReuse {

	public static void main(String[] args) {
		FoodMenu fm=new FoodMenu();
		fm.food=new VegFood();
		fm.food.menu();
//		Food fd=new NonvegFood();
//		fd.menu();

	}
}
class FoodMenu{
	Food food;
}
abstract class Food{
	public abstract void menu();
}
class VegFood extends Food{
	@Override
	public void menu() {
		System.out.println("veg meth call");
		
	}
}
class NonvegFood extends Food{
	@Override
	public void menu() {
		System.out.println("Nonveg meth call");		
	}
}

