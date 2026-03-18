//Example: Prime Numbers Between Two Integers

class PrimeNumbersBtTwoIntegers{
	public static void main(String[] args){
		int a=20;
		int b=50;
		while(a<b){
			if(isPrime(a)){
				System.out.print(a+" ");
			}
			++a;
		}
	}
	public static boolean isPrime(int n){
		boolean flag=true;
		for(int i=2;i<n/2;i++){
			if(n%i==0){
				flag=false;
				break;
			}
		}
		return flag;
	}
}