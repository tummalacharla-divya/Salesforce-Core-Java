//Example 2: Java Program to generate a random alphanumeric string

import java.util.Random;

class AlphanumericString{
	public static void main(String[] args){
		String lowercase="abcdefghijklmnopqrstuvwxyz";
		String numbers="0123456789";
		String uppercase="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String alphabet=lowercase+uppercase+numbers;
		
		Random random=new Random();
		
		StringBuilder sb=new StringBuilder();
		int length=7;
		for(int i=0;i<length;i++){
			int index=random.nextInt(alphabet.length());
			sb.append(alphabet.charAt(index));
		}
		System.out.println("Random string: "+sb.toString());
	}
}
			