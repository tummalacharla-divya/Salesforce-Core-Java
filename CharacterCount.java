/*Write a program that accepts a string and a character from the user, then counts how many times the character appears in the string.
If character is not present then throw custom exception NoCharacterFoundException
Requirements:
Accept a string and a character from the user.
Count the number of times the character appears in the string.
Display the count.
 
 */
import java.util.Scanner;
class CharacterCount{
	public static void main(String[] args){
		try{
			Scanner sc=new Scanner(System.in);
			String str=sc.nextLine();
			char ch=sc.next().charAt(0);
			isCharPresent(ch,str);
			int count=0;
			for(char c:str.toCharArray()){
				if(c==ch){
					count+=1;
				}
			}
			System.out.printf("%c occurs %d in the given string %s",ch,count,str);
			
		}catch(NoCharacterFoundException e){
			System.out.println(e.getMessage());
		}
	}
	public static boolean isCharPresent(char c, String s) throws NoCharacterFoundException{
		if(s.indexOf(c)<0){
			
			throw new NoCharacterFoundException("character is not present in string");
		}
		return true;
	}
}
class NoCharacterFoundException extends Exception{
	public NoCharacterFoundException(String msg){
		super(msg);
	}
}