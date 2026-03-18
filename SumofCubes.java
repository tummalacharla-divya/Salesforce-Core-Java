// Exercise 1: Create a method to find the sum of the cubes of the digits of an n digit number.
import java.util.Scanner;
class SumofCubes{
	public static int sumofCubesofdigit(int n){
		int cubeSum=0;
		while(n>0){
			int i=n%10;
			cubeSum+=i*i*i;
			n/=10;
		}
		return cubeSum;
	}
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number: ");
		int n=sc.nextInt();
		System.out.println(sumofCubesofdigit(n));
	}
}

		