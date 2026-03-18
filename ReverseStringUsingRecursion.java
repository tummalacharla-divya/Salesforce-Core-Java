//Java Program to Reverse a Sentence Using Recursion

class ReverseStringUsingRecursion{
	public static void main(String[] args){
		String str="java programming";
		String reversed=reverse(str);
		System.out.println("reversed string: "+reversed);
	}
	public static String reverse(String str){
		if(str.isEmpty())
			return str;
		else
			return reverse(str.substring(1))+str.charAt(0);
	}
}