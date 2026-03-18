//Example 2: Concatenate Two Arrays without using arraycopy
import java.util.Arrays;
class ConcatenateTwoArrays1{
	public static void main(String[] args){
		int[] a=new int[]{1,2,3};
		int[] b=new int[]{4,5,6};
		
		int[] result=new int[a.length+b.length];
		int pos=0;
		
		for(int ele:a){
			result[pos]=ele;
			pos++;
		}
		
		for(int ele:b){
			result[pos]=ele;
			pos++;
		}
		
		System.out.println(Arrays.toString(result));
	}
}