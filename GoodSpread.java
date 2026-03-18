//Write a method called goodSpread that returns 1 if no value in its array argument occurs more than 3 times in the array. For example:
//goodSpread(new int[]{2,1,2,5,2,1,5,9}) returns 1 because no value occurs more than 3 times.
//goodSpread(new int[]{3,1,3,1,3,5,5,3}) returns 0 because value 3 occurs 4 times.
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Collections;
import java.util.*;

class GoodSpread{
	public static void main(String[] args){
		int res=goodSpread(new int[]{3,1,3,1,3,5,5,3});
		System.out.println(res);
	}
	public static int goodSpread(int[] arr){
		int count=0;
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr.length;j++){
				if(arr[i]==arr[j]){
					count++;
				}
			}
			if(count>3){
				return 0;
			}
			count=0;
		}
		return 1;
		
	}
}