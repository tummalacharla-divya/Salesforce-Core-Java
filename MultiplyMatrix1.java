//Example: Program to Multiply Two Matrices by passing arrays to methods
class MultiplyMatrix1{
	public static void main(String[] args){
		int r1=2,c1=3;
		int r2=3,c2=2;
		int[][] a= { {3, -2, 5}, {3, 0, 4} };
        int[][] b = { {2, 3}, {-9, 0}, {0, 4} };
		
		int[][] product=multiplyMatrix(a,b,r1,c2,c1);
		
		display(product);
	}
		
		
		public static int[][] multiplyMatrix(int[][] a,int[][] b,int r1,int c2,int c1){
			int[][] mul=new int[r1][c2];
			for(int i=0;i<r1;i++){
				for(int j=0;j<c2;j++){
					for(int k=0;k<c1;k++){
						mul[i][j]+=a[i][k]*b[k][j];
					}
				}
			}
			return mul;
		}
		
		public static void display(int[][] mul){
			//display
			for(int[] row:mul){
				for(int column:row){
					System.out.print(column+" ");
				}
				System.out.println();
			}
		}
	
}
	