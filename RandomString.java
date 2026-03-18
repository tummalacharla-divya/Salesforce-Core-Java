//Example 1: Java program to generate a random string
import java.util.Random;

class RandomString{
	public static void main(String[] args){
		String alphabet="abcdefghijklmnopqrstuvwxyz";
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
			