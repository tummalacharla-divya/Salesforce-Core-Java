//Example 1: Java Program to calculate the method execution time

class MethodExecutionTime{
	public static void display(){
		System.out.println("Method is executed");
	}
	public static void main(String[] args){
		long start=System.nanoTime();
		display();
		long end=System.nanoTime();
		long time=end-start;
		System.out.println("Execution time: "+time+" nanoseconds");
	}
}