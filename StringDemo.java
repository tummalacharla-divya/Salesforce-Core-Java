import java.util.Arrays;
class StringDemo{
	public static void main(String[] args){
		String message="Wel3come5 to ca4pgemi4ni";
		
		int len=message.length();
		System.out.println("Message length: "+len);
		
		//index of a char/char sequence
		
		int index=message.indexOf("m");
		System.out.println("Index of m: "+index);
		
		int Lastindex=message.lastIndexOf("m");
		System.out.println("last Index of m: "+Lastindex);
		
		//char on an index
		char c=message.charAt(9);
		System.out.println("Char on index 9: "+c);
		
		//Substring method with 1 argument
		int startIndex=9;
		String sub=message.substring(startIndex);
		System.out.println("Substring from 9 th index: "+sub);
		
		//Substring method with 2 argument
		int startIndex1=3;
		int endIndex=15;
		String sub1=message.substring(startIndex1,endIndex);
		System.out.println("Substring from 3 to 15 index: "+sub1);
		
		message=message.concat(" India");
		System.out.println("Concatenated string: "+message);
		System.out.println("Message contains India: "+message.contains("India"));
		
		//String[] messageArray=message.split("e");
		String[] messageArray=message.split("\\d"); //regular expression
		System.out.println(messageArray[3]);
		for(String s3:messageArray){
			System.out.println(s3);
		}
		
	}
}