import java.util.Scanner;
class ArraySum{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		//size of the array
		System.out.print("Enter Array size: ");
		int size=sc.nextInt();
		int num[]= new int[size];
		int sum=0;

		//read array elements
		for(int i=0;i<size;i++){
			num[i]=sc.nextInt();
		}
		
		// print array elements
		for(int i=0;i<size;i++){
			sum+=num[i];
		}
		System.out.println("sum of array elements: "+sum);
	}
}