//Java Program to Determine the class of an object

class Test1 {
// first class
}

class Test2 {
// second class
}


class DetermineClassOfAnObject{
  public static void main(String[] args) {
    // create objects
    Test1 obj1 = new Test1();
    Test2 obj2 = new Test2();

    // get the class of the object obj1
    System.out.print("The class of obj1 is: ");
    System.out.println(obj1.getClass());

    // get the class of the object obj2
    System.out.print("The class of obj2 is: ");
    System.out.println(obj2.getClass());
	
	if(obj1 instanceof Test1) {
      System.out.println("obj1 is an object of the Test1 class");
    }
    else {
      System.out.println("obj1 is not an object of the Test1 class");
    }
	
	// check if obj is an object of Test1
    if(Test1.class.isInstance(obj1)){
      System.out.println("obj1 is an object of the Test1 class");
    }
    else {
      System.out.println("obj1 is not an object of the Test1 class");
    }
  }
}