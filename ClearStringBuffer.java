//Example 1: Java program to clear using StringBuffer using delete()

class ClearStringBuffer{
	public static void main(String[] args){
		StringBuffer sb=new StringBuffer();
		
		sb.append("java");
		sb.append(" is oop");
		System.out.println("string is: "+sb);
		//sb.delete(0,sb.length());
		
		//Example 2: Clear the StringBuffer using setLength()
		//sb.setLength(0);
		
		//Example 3: Clear the StringBuffer by creating a new object
		sb=new StringBuffer();
		System.out.println("updated string: "+sb);
	}
}