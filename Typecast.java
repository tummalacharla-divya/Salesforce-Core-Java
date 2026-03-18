class Typecast{
	public static void main(String[] args){
		//Implicit
		int num=10;
		long l=num; //long l=(long)num;
		
		System.out.println("Implicit conversion: "+l);
		
		long val=30;
		//int x=val; // error: incompatible types: possible lossy conversion from long to int
                //int x=val;
		int x=(int)val; //explicit conversion
		System.out.println("explicit conversion: "+x);
	}
}