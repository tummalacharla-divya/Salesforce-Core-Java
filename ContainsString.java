//Example 1: Check if a string contains a substring using contains()
class ContainsString{
	public static void main(String[] args){
		String s="java is a programming language";
		if(s.contains("java")){
			System.out.println("given string contains java");
		}
		else{
			System.out.println("given string not contains java");
		}
		
		if(s.contains("python")){
			System.out.println("given string contains python");
		}
		else{
			System.out.println("given string not contains python");
		}
	}
}
		