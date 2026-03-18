//Example 1: Java Program to Convert char to int
class CharToInt{
	public static void main(String[] args){
		/*char a='5';
		char b='d';
		
		int i=a;
		int j=b;*/
		
		/*//Example 2: char to int using getNumericValue() method
		char a='5';
		char b='8';
		int i=Character.getNumericValue(a);
		int j=Character.getNumericValue(b);*/
		
		/*//Example 3: char to int using parseInt() method
		char a='9';
		char b='3';
		
		int i=Integer.parseInt(String.valueOf(a));
		int j=Integer.parseInt(String.valueOf(b));*/
		
		//Example 4: char to int by subtracting with '0'
		char a='9';
		char b='6';
		
		int i=a-'0';
		int j=b-'0';
		
		System.out.println(i);
		System.out.println(j);
	}
}