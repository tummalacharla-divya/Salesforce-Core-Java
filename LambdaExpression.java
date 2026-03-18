//Java Program to pass lambda expression as a method argument
//Example 1: Define lambda expressions as method parameters
/*import java.util.ArrayList;
class LambdaExpression{
	public static void main(String[] args){
		ArrayList<String> languages=new ArrayList<>();
		languages.add("java");
		languages.add("python");
		languages.add("perl");
		
		System.out.println("Languages: "+languages);
		
		languages.replaceAll(e->e.toUpperCase());
		
		System.out.println("Updated languages: "+languages);
	}
}*/
	
//Example 2: Pass multiline lambda body as function arguments

import java.util.ArrayList;
import java.util.Arrays;
class LambdaExpression{
	public static void main(String[] args){
		ArrayList<String> languages=new ArrayList<>(Arrays.asList("java","python","perl"));
		
		System.out.println("Languages: "+languages);
		
		System.out.print("reversed languages: ");
		languages.forEach((e)->{
			String result=" ";
			for(int i=e.length()-1;i>=0;i--){
				result+=e.charAt(i);
			}
			System.out.print(result+" ");
		});
	
	}
}