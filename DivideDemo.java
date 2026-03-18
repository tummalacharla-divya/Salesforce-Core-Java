/*unchecked exception
class DivideDemo{
	public static void main(String[] args){
		try{
			divide(4,0);
		}catch(ArithmeticException e){
			System.out.println(e.getMessage());
		}
	}
	public static int divide(int a, int b) {
		if(b==0){
			throw new ArithmeticException("ypu are dividing a number by zero");
		}
		
			return a/b;
		
	}
}*/

//checked exception

import java.io.*;
class DivideDemo{
	public static void main(String[] args){
		try{
			divide(4,0);
		}catch(IOException e){
			System.out.println(e.getMessage());
		}
	}
	
	//explicitly throw the checked exception from the method signature by using throws keyword.
	public static int divide(int a, int b) throws IOException {
		if(b==0){
			throw new IOException("ypu are dividing a number by zero");
		}
		
			return a/b;
		
	}
	public static void openFile() throws FileNotFoundException{
		File f=new File("C://d/e/eans.txt");
	}
}