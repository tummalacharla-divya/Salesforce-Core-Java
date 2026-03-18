class StandardDeviation{
	public static void main(String[] args){
		double[] arr=new double[]{1,2,3,4,5,6,7,8,9,10};
		double sd=standardDeviation(arr);
		System.out.format("standard deviation= %.6f",sd);
	}
	public static double standardDeviation(double arr[]){
		int length=arr.length;
		double sd=0;
		double sum=0.0;
		for(double i:arr){
			sum+=i;
		}
		double mean=sum/length;
		for(double i:arr){
			sd+=Math.pow(i-mean,2);
		}
		return Math.sqrt(sd/length);
	}
}