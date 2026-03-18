// write a program to find the longest substring without repeating characters.
//input : "abcabcbb"
//output: 3 (longest substring is "abc")
import java.util.*;
class LongestSubString{
	public static void main(String[] args){
		String str="abcabcbb";
		System.out.println(longest(str));
	}
	public static int longestSubstring(String str){
		Set<Character> s=new HashSet<>();
		int i=0,j=0;
		int max=0;
		while(j<str.length()){
			if(!s.contains(str.charAt(j))){
				
				s.add(str.charAt(j++));
				max=Math.max(max,s.size());
			}
			else{
				s.remove(str.charAt(i++));
			}
		}
		return max;
	}
	
	public static int longest(String str){
		Set<Character> s=new HashSet<>();
		String longestTillNow="";
		String longestOverall="";
		for(int i=0;i<str.length();i++){
			char c=str.charAt(i);
			if(s.contains(c)){
				longestTillNow="";
				s.clear();
			}
			s.add(c);
			longestTillNow+=c;
			if(longestTillNow.length()>longestOverall.length()){
				longestOverall=longestTillNow;
			}
		}
		return longestOverall.length();
	}
}