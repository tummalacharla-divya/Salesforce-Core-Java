//Example 2: Convert every word of a String to uppercase
class EveryWordToUppercase{
	public static void main(String[] args){
		String st="java is oop";
		String[] c=st.split(" ");
		for(int i=0;i<c.length;i++){
			c[i]=c[i].substring(0,1).toUpperCase()+c[i].substring(1);
		}
		String s="";
		for(String str:c){
			s=s+str+" ";
		}
		System.out.println(s);
	}
}