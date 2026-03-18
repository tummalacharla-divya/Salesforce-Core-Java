//Example 3: Check if an array contains a given value for non-primitive types
import java.util.Arrays;
class CheckElementInNonPrimitive{
	public static void main(String[] args){
		String[] str={"divya","Noida","delhi"};
		String s="Noida";
		boolean b=Arrays.stream(str).anyMatch(string->s.equals(string));
		if(b){
			System.out.println(s+" is found");
		} 
		else{
			System.out.println(s+" is not found");
		}
	}
}