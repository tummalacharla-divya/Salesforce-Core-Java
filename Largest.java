class Largest{
	public static void main(String[] args){
		int[] arr=new int[]{56,3,45,34,26};
		int largest=arr[0];
		for(int i:arr){
			if(i>largest){
				largest=i;
			}
		}
		System.out.println("largest number in an array: "+largest);
	}
}