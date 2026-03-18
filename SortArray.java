//write a program to sort an array of 0's, 1's and 2's without extra space.
//input: {0,1,2,1,0,2,1,0}
//output: {0,0,0,1,1,1,2,2}
import java.util.*;
class SortArray{
	public static void main(String[] args){
		int[] arr={0,1,2,1,0,2,1,0};
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
	}
	
	public static void sortarray ( int [] A , int n )  
	{  
    int low = 0 ;  
    int mid = 0 ;  
    int high = n - 1 ;  
    while ( mid <= high )  
    {  
        if ( A [ mid ] == 0 )  
        {  
            int temp = A [ mid ] ;  
            A [ mid ] = A [ low ];  
            A [ low ] = temp ;  
            low = low + 1 ;  
            mid = mid + 1 ;  
          
        }  
        else if ( A [ mid ] == 1 )  
        {  
            mid = mid + 1 ;  
        }  
        else   
        {  
            int temp = A [ mid ] ;  
            A [ mid ] = A [ high ] ;  
            A [ high ] = temp ;  
            high = high - 1 ;  
              
        }  
    }     
	
}