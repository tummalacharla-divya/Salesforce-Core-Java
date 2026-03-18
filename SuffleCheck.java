//Example: Check if a string is a valid shuffle of two other strings
import java.util.Arrays;
class SuffleCheck{
	public static void main(String[] args){
		String first="XY";
		String second="12";
		String[] results={"1XY2","X12Y","2XY1","df23","XY"};
		
		for(String result:results){
			if(checkLength(first,second,result)==true && suffleCheck(first,second,result)==true){
				System.out.println(result+" is suffle of "+first+" and "+second);
			}
			else{
				System.out.println(result+" is not a suffle of "+first+" and "+second);
			}
		}
	}
	
	public static boolean checkLength(String first,String second, String result){
		if(first.length()+second.length()==result.length())
			return true;
		else
			return false;
	}
	
	public static boolean suffleCheck(String first,String second,String result){
		first=sortString(first);
		second=sortString(second);
		result=sortString(result);
		
		int i=0,j=0,k=0;
		
		while(k!=result.length()){
			if(i<first.length() && first.charAt(i)==result.charAt(k)){
				i++;
			}
			else if(j<second.length() && second.charAt(j)==result.charAt(k)){
				j++;
			}
			else{
				return false;
			}
			k++;
		}
		if(i<first.length() || j<second.length()
			return false;
		return true;
		
	}
	public static String sortString(String str){
		char[] s=str.toCharArray();
		Arrays.sort(s);
		str=String.valueOf(s);
		return str;
	}
}

