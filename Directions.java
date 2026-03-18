//final class Directions{
class Directions{
	public final void display(){
		System.out.println("There are only 4 directions");
	}
}

class Shape extends Directions{ //final class can not be inherited
	public void show(){
		System.out.println("Rectangle");
	}
	
	public void display(){ //we can not override final method in child class.
		System.out.println("shape has 4 sides");
	}
}
class FinalDemo{
	public static void main(String[] args)
	{
		Shape s=new Shape();
		s.display();
	}
}