//Exercise 2: Write a Java program that prompts the user for an integer and then prints true if the Number is Prime otherwise false.
import java.util.Scanner;
class PrimeNumber{

	public static boolean isPrime(int num){
		boolean flag=true;
		for(int i=2;i<Math.sqrt(num);i++){ // or we can use num/2 nut using math is efficient.
			if(num%i==0)
				flag=false;
				break;
		}
		return flag;
	}

	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number: ");
		int num=sc.nextInt();
		boolean flag=isPrime(num);
		if(flag){
			System.out.println("given number is prime");
		}
		else{
			System.out.println("given number is not prime");
		}
	}
}
