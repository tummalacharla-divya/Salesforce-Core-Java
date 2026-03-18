//final class Directions{
class Directions{
	public final int DIRECTIONS=4;
	
	//public final int DIRECTIONS;
	//DIRECTIONS=4; //it is not allowed.
	public final void display(){
		System.out.println("The directions: "+DIRECTIONS);
	}
}

class Shape extends Directions{ //final class can not be inherited
	public void show(){
		System.out.println("Rectangle");
	}
	
	/*public void display(){ //we can not override final method in child class.
		System.out.println("shape has 4 sides");
	}*/
}
class FinalDemo1{
	public static void main(String[] args)
	{
		Shape s=new Shape();
		//s.display();
		//Directions d=Directions();
		s.display();
	}
}