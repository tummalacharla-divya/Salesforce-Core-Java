//Java Program to Find the Sum of Natural Numbers using Recursion

class SumUsingRecursion{
	public static void main(String[] args){
		int num=5;
		int sum=addRecursion(num);
		System.out.println(sum);
	}
	public static int addRecursion(int num){
		if(num!=0)
			return num+addRecursion(num-1);
		else
			return num;
	}
}