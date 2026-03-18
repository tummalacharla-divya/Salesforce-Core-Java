//Example 2: Calculate the execution time of Recursive method

class RecursiveMethodExecutionTime{
	public static int factorial(int n){
		if(n>=1)
			return n*factorial(n-1);
		else
			return 1;
	}
	public static void main(String[] args){
		long start=System.nanoTime();
		factorial(5);
		long end=System.nanoTime();
		long time=end-start;
		System.out.println("Recursive method execution time: "+time+" nanoseconds");
	}
}