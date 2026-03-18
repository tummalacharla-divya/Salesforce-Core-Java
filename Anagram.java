//Example 1: Java program to check if two strings are anagrams
import java.util.Arrays;
import java.util.Scanner;
class Anagram{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter first string");
		String str1=sc.nextLine();
		System.out.println("enter second string");
		String str2=sc.nextLine();
		
		str1=str1.toLowerCase();
		str2=str2.toLowerCase();
		
		
		if(str1.length()==str2.length()){
			char[] s1=str1.toCharArray();
			char[] s2=str2.toCharArray();
			
			Arrays.sort(s1);
			Arrays.sort(s2);
			
			if(Arrays.equals(s1,s2)){
				System.out.println("two strings are anagrams");
			}
			else{
				System.out.println("two strings are not anagrams");
			}
				
		}
		else{
			System.out.println("two strings are not anagrams");
		}
	}
}