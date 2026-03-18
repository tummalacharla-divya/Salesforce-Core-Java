//if there is an implementation gap between the declaration and implementation of a method in java then that method should be declared as an abstract method. use "abstract" keyword to make the method abstract. 
// if the method is abstract, then the class should be declared as an abstract.


abstract class Human{
	public void walk(){
		System.out.println("All human walk");
	}
	
	//declaration of method
	abstract public void eats();
	
}

/*if a class is abstract, then:
1. we can not create an object of the class.
	Human h=new Human();// it is not applicable.
2. In order to use the abstract class members, we must inherit the abstract class in another class.
3. Override or give definition to all the abstract methods of the abstract class in the child class.
4.If any of the super class abstract method is not overrided/defined in the child class, then the child class also should be declared as an abstract class.

*/

abstract class Vegitarian extends Human{ //point 4
//class Vegitarian extends Human{
	public void sleeps(){
		System.out.println("sleeps");
	}
	/*public void eats(){ //point 4
		 System.out.println("veg");
	}*/
}

class Employee extends Vegitarian{
	public void eats(){
		System.out.println("employee is vegitarian");
	}
}

// 5. if a class is not having any abstract method i.e all the methods are defined, then also we can make the class as an abstract class. i.e those methods are concrete methods

abstract class Person{
	public int getAge(){
		return 30;
	}
	//not inherited
	private double getSalary(){
		return 78900;
	}
}

class ThisPerson extends Person{
	
	
}