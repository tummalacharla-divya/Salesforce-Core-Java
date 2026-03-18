//Example 2: Loop through each character of a string using for-each loop

class IterateString{
	public static void main(String[] args){
		String str="programming";
		for(char c:str.toCharArray()){
			System.out.print(c+",");
		}
	}
}