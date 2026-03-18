//Example 1: Java program to make the first letter of a String capital
 
class FirstLetterToCapital{
	public static void main(String[] args){
		String str="programming";
		System.out.println(str.substring(0,1).toUpperCase()+str.substring(1));
	}
}