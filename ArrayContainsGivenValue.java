import java.util.stream.IntStream;
class ArrayContainsGivenValue{
	public static void main(String[] args){
		int[] arr=new int[]{2,3,1,5,7,8};
		int ele=3;
		boolean found=IntStream.of(arr).anyMatch(n->n==ele);
		if(found){
			System.out.println(ele+" is found");
		}
		else{
			System.out.println(ele+" not found");
		}
	}
}