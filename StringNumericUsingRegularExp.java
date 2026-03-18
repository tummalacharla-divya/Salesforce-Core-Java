//Example 2: Check if a string is numeric or not using regular expressions (regex)
class StringNumericUsingRegularExp{
	public static void main(String[] args){
		String str="-12673.8";
		boolean numeric=str.matches("-?\\d+(\\.\\d+)?");
		 
		if(numeric){
			System.out.println(str+" is numeric");
		}
		else{
			System.out.println(str+" is not numeric");
		}
	}
}