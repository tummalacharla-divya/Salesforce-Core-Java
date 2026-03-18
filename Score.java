import java.util.*;
import java.lang.*;

public class Score{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        try{
			String str=String.format("%.2f",Invalid(a, n));
			System.out.print(str);
			
        }catch(InvalidScoreException e){
            System.out.println(e.getMessage());
        }
    }
    public static double Invalid(int[] a, int n)throws InvalidScoreException{
		double res=0;
		for(int i=0;i<n;i++){
			if(a[i]<0 || a[i]>100){
				throw new InvalidScoreException("Invalid Score");
			}
		else{
			res+=a[i];
		}
	}
	
	double ans=Math.round(((res/n)*100)/100);
	System.out.printf("%.2f",ans);
	return ans;
    }
}
class InvalidScoreException extends Exception{
    public InvalidScoreException(String s){
        super(s);
    }
}