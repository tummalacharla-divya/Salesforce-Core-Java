//Example 1: Check if a string is numeric
class StringNumeric{
	public static void main(String[] args){
		String str="235";
		boolean numeric=true;
		try{
			//int l=Integer.parseInt(str); or
			Double i=Double.parseDouble(str);
		}
		catch(NumberFormatException e){
			numeric=false;
		}
		
		if(numeric){
			System.out.println(str+" is a numeric");
		}
		else{
			System.out.println(str+" is not a numeric");
		}
	}
}
			
