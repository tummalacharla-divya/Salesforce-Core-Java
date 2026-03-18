//Example 2: Program to Convert Octal to Binary

class OctalToBinary{
	public static void main(String[] args){
		int octal=67;
		long binary=octalToBinary(octal);
		System.out.println(octal + " in octal = " + binary + " in binary");
	}
	public static long octalToBinary(int octal){
		int decimal=0,i=0;
		while(octal!=0){
			decimal+=(octal%10)*Math.pow(8,i);
			++i;
			octal/=10;
		}
		
		int j=1;
		long binary=0;
		while(decimal!=0){
			binary+=(decimal%2)*j;
			decimal/=2;
			j*=10;
		}
		return binary;
	}
}