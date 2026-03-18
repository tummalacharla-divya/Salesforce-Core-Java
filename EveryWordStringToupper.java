//Example 2: Convert every word of a String to uppercase
class EveryWordStringToupper{
	public static void main(String[] args){
		String str="java is oop";
		boolean foundSpace=true;
		char[] c=str.toCharArray();
		
		for(int i=0;i<c.length;i++){
			if(Character.isLetter(c[i])){
				if(foundSpace){
					c[i]=Character.toUpperCase(c[i]);
					foundSpace=false;
				}
			}
			else{
				foundSpace=true;
			}
		}
		str=String.valueOf(c);
		System.out.println(str);
	}
}