//Example 2: Check if a string contains a substring using indexOf()

class IndexOfmethod{
	public static void main(String[] args){
		String s="java is a oop ";
		
		int res=s.indexOf("java");
		
		if(res==-1){
			System.out.println("given string not found");
		}
		else{
			System.out.println("given string found");
		}
	}
}