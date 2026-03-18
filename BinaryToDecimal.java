//Example 1: Binary to Decimal Conversion Using Custom Method
class BinaryToDecimal{
	public static void main(String[] args){
		long binary=110110111;
		int decimal=decimalConvert(binary);
		System.out.println("binary to decimal number is: "+decimal);
		
	}
	public static int decimalConvert(long num){
		int decimal=0,i=0;
		long reminder=0;
		while(num!=0){
			reminder=num%10;
			num/=10;
			decimal+=reminder*Math.pow(2,i);
			++i;
		}
		return decimal;
	}
}


/*//Example 2: Binary to Decimal Conversion Using parseInt()
class Main {
  public static void main(String[] args) {
    
    // binary number
    String binary = "01011011";
    
    // convert to decimal
    int decimal = Integer.parseInt(binary, 2);
    System.out.println(binary + " in binary = " + decimal + " in decimal.");
  }
}*/