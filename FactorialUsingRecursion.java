//Java Program to Find Factorial of a Number Using Recursion

class FactorialUsingRecursion{
	public static void main(String[] args){
		int num=5;
		int fact=factorial(num);
		System.out.printf("factorial of %d is %d",num,fact);
	}
	public static int factorial(int n){
		if(n>=1)
			return n*factorial(n-1);
		else
			return 1;
	}
}