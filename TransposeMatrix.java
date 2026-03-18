//Example: Program to Find Transpose of a Matrix
class TransposeMatrix{
	public static void main(String[] args){
		int[][] a=new int[][]{{1,2,3},{4,5,6}};
		display(a);
		
		//Transpose
		int[][] transpose=new int[a[0].length][a.length];
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a[0].length;j++){
				transpose[j][i]=a[i][j];
			}
		}
		
		display(transpose);
	}
	public static void display(int[][] a){
		for(int[] row:a){
			for(int column:row){
				System.out.print(column+" ");
			}
			System.out.println();
		}
	}
}