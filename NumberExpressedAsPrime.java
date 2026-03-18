//Java Program to Check Whether a Number can be Expressed as Sum of Two Prime Numbers

class NumberExpressedAsPrime{
	public static void main(String[] args){
		int number=34;
		boolean flag=false;
		for(int i=2;i<=number/2;i++){
			if(isPrime(i)){
				if(isPrime(number-i)){
					System.out.printf("%d = %d+%d\n",number,i,number-i);
					flag=true;
				}
			}
		}
		if(!flag){
			System.out.println("Number can not be Expressed as Sum of Two Prime Numbers");
		}
	}
	public static boolean isPrime(int n){
		boolean flag=true;
		for(int i=2;i<=n/2;i++){
			if(n%i==0){
				flag=false;
				break;
			}
		}
		return flag;
	}
}
		