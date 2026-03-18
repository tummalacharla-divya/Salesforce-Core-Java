//Example: Program to Add Two Matrices
class AddMatrix{
	public static void main(String[] args){
		int[][] m1=new int[][]{{1,2,3},{4,5,6}};
		int[][] m2=new int[][]{{2,3,4},{5,6,7}};
		
		int[][] sum=new int[m1.length][m1[0].length];
		for(int i=0;i<m1.length;i++){
			for(int j=0;j<m1[0].length;j++){
				sum[i][j]=m1[i][j]+m2[i][j];
			}
		}
		
		//display
		for(int[] row:sum){
			for(int column:row){
				System.out.print(column+" ");
			}
			System.out.println();
		}
	}
}