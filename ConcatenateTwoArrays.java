//Example 1: Concatenate Two Arrays using arraycopy
import java.util.Arrays;
class ConcatenateTwoArrays{
	public static void main(String[] args){
		int[] array1=new int[]{1,2,3};
		int[] array2=new int[]{4,5,6};
		
		int alen=array1.length;
		int blen=array2.length;
		
		int[] result=new int[alen+blen];
		
		System.arraycopy(array1,0,result,0,alen);
		System.arraycopy(array2,0,result,alen,blen);
		
		System.out.println(Arrays.toString(result));
	}
}