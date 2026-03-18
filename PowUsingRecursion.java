//Java Program to calculate the power using recursion

class PowUsingRecursion{
	public static void main(String[] args){
		int base=3,pow=4;
		int result=power(base,pow);
		System.out.printf("power of %d is: %d",base,result);
	}
	public static int power(int base,int pow){
		if(pow!=0)
			return base*power(base,pow-1);
		else
			return 1;
	}
}