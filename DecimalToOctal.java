//Example 1: Program to Convert Decimal to Octal

class DecimalToOctal{
	public static void main(String[] args){
		int decimal=78;
		int octal=decimalToOctal(decimal);
		System.out.println("decimal to octal conversion: "+octal);
	}
	public static int decimalToOctal(int decimal){
		int octal=0,i=1;
		while(decimal!=0){
			octal+=(decimal%8)*i;
			decimal/=8;
			i*=10;
		}
		return octal;
	}
}
		