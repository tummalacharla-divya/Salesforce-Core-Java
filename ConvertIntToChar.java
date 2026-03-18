//Example 1: Java Program to Convert int to char

class ConvertIntToChar{
	public static void main(String[] args){
		int a=65;
		int b=66;
		
		/*char i=(char)a;
		char j=(char)b;*/
		
		/*//Example 2: int to char by using forDigit()
		int num1=1;
		int num2=15;
		
		char i=Character.forDigit(num1,10);
		char j=Character.forDigit(num2,16);*/
		
		//Example 3: int to char by adding '0'
		int num1=4;
		int num2=6;
		
		char i=(char)(num1+'0'); //0 ASCII value is 48
		char j=(char)(num2+'0');
		
		System.out.println(i);
		System.out.println(j);
	}
}