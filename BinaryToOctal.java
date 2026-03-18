//Example 1: Program to Convert Binary to Octal
class BinaryToOctal{
	public static void main(String[] args){
		long binary=101001;
		int octal=binaryToOctal(binary);
		System.out.println(binary+" in binary= "+octal+" in octal");
	}
	public static int binaryToOctal(long binary){
		int decimal=0,j=0;
		while(binary!=0){
			decimal+=(binary%10)*Math.pow(2,j);
			++j;
			binary/=10;
		}
		
		int octal=0,i=1;
		while(decimal!=0){
			octal+=(decimal%8)*i;
			i*=10;
			decimal/=8;
		}
		return octal;
	}
}