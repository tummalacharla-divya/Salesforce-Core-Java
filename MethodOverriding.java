
class MethodOverriding{
	public static void main(String[] args){
		Human human=new Human();
		human.eat();
		Human h=new Vegetarian();
		h.eat();
		//Vegetarian v=new Human();//parent class constructor can refer child class constructor. but child class constructor can not refer parent class constructor
		//v.eat();
	}
}

class Human{
	public void walk(){
		System.out.println("Humans walk");
	}
	public void eat(){
		System.out.println("Humans eats");
	}
}

class Vegetarian extends Human{
	public void eat(){
		System.out.println("we eat only veg food");
	}
}
