// Exercise 3: Write a Java program that prompts the user for an integer and then prints out all the prime numbers up to that Integer?
import java.util.Scanner;
class PrimeNumbersUptoNumber{

	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n=sc.nextInt();
		System.out.println("prime numbers upto given number are: ");
		primes(n);
	}


	public static void primes(int num){
		for(int i=0;i<=num;i++){
			if(i==0||i==1)
				continue;
			if(isPrime(i)){
				System.out.print(i+" ");
			}
			
		}
	}
	public static boolean isPrime(int num){
		boolean flag=true;
		for(int i=2;i<=Math.sqrt(num);i++){ 
			if(num%i==0){
				flag=false;
				break;
			}
		}
		return flag;
	}



}
		
		