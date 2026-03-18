//Example 1: Java program to differentiate == and equals()
class Differentiate{
	public static void main(String[] args){
		String str1="program";
		String str2="program";
		
		String name1 = new String("Programiz");
		String name2 = new String("Programiz");
		
		boolean res1=(str1==str2);
		System.out.println("using == operator: "+res1);
		
		//equals() checks if the content of the string object are equal. Here, the content of both the objects name1 and name2 is the same Programiz. Hence, it returns true.

		boolean res2=(str1.equals(str2));
		System.out.println("using equals(): "+res2);
		
		//== checks if the reference to string objects are equal or not. Here, name1 and name2 are two different references. Hence, it returns false.

		boolean res3=(name1==name2); 
		System.out.println("using == operator: "+res3);
	}
}