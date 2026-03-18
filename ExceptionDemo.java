class ExceptionDemo{
	public static void main(String[] args){
		System.out.println("Start of the program");
		try{
		int num=Integer.parseInt(args[0]); //if we don't give input in command prompt then it will give "java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0
        //at ExceptionDemo.main(ExceptionDemo.java:4)"
		System.out.println("Input value: "+num);
		int result=10/(10-num);// if we give num as 10 it will give " / by zero
        //at ExceptionDemo.main(ExceptionDemo.java:6) "
		System.out.println("Result= "+result);

		String name="Welcome";
		name=null; // name is rewritten as null in heap memory
		System.out.println("Name= "+name);
		System.out.println("Name length= "+name.length()); // now name be null so it will give "Exception in thread "main" java.lang.NullPointerException: Cannot invoke "String.length()" because "<local3>" is null
        //at ExceptionDemo.main(ExceptionDemo.java:12) "
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Please provide an argument on command prompt");
		}
		catch(NumberFormatException e){
			System.out.println("Please enter a number");
		}
		catch(ArithmeticException e){
			System.out.println("you are dividing a number by zero");
		}
		catch(NullPointerException e){
			System.out.println("Your object is null");
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}finally{
			System.out.println("I am used to cleanup the resources, closing the connections and files. i will always execute.");
		}
		System.out.println("End of the program");
	}
}