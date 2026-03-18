import java.util.Scanner;
class ArrayDemo{
	public void printArray(int arr[], int size){
		for(int i=0;i<size;i++){
			System.out.print(arr[i]+" ");
		}
	}

	public int ArraySum(int arr[], int size){
		int sum=0;
		for(int i=0;i<size;i++){
			sum+=arr[i];
		}
		return sum;
	}

	public void ReciprocalArraySum(int arr[], int size){
		float sum=0;
		for(int i=0;i<size;i++){
			sum+=(float)1/arr[i];
		}
		System.out.println("sum of reciprocal elements of array: "+sum);

	}


	public int ArrayAverage(int sum, int size){
		return sum/size;
	}



	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		ArrayDemo demo=new ArrayDemo();
		//size of the array
		System.out.print("Enter Array size: ");
		int size=sc.nextInt();
		int num[]= new int[size];
		
		//read array elements
		for(int i=0;i<size;i++){
			num[i]=sc.nextInt();
		}
		System.out.println("Array elements are: ");
		demo.printArray(num,size); //static method only access static methods. if we want to access non static methods then we call that by object or class name.
		int sum=demo.ArraySum(num,size);
		System.out.println("\nsum of array elements: "+sum);

		System.out.println("Average of Array Elemets: "+demo.ArrayAverage(sum,size));

		demo.ReciprocalArraySum(num,size);
	}
}