//Example 3: Decimal to Binary Conversion using Custom Method

class DecimalToBinary{
	public static void main(String[] args){
		int decimal=10;
		long binary=DecimaltoBinary(decimal);
		System.out.println(" decimal to binary convertion: "+binary);
	}
	public static long DecimaltoBinary(int decimal){
		long binary=0;
		int reminder,i=1;
		while(decimal!=0){
			reminder=decimal%2;
			decimal/=2;
			binary+=reminder*i;
			i*=10;
		}
		return binary;
	}
}

/*//Example 4: Decimal to Binary Conversion using toBinaryString()
class Main {
  public static void main(String[] args) {
    
    // decimal number 
    int decimal = 91;
    
    // convert decimal to binary
    String binary = Integer.toBinaryString(decimal);
    System.out.println(decimal + " in decimal = " + binary + " in binary.");
  }
}*/