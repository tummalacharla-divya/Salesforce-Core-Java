//Java Program to Pass the Result of One Method Call to Another Method

class MethodCall{
	public int sum(int a,int b){
		int sum=a+b;
		return sum;
	}
	public void square(int n){
		int s=n*n;
		System.out.println("square of a number is: "+s);
	}
	public static void main(String[] args){
		MethodCall obj=new MethodCall();
		obj.square(obj.sum(15,9));
	}
}