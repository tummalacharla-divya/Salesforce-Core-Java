import java.util.*;
class Frequencyaverage{
    public static void main(String[] args){
        int[] Arr={-1,2,-1,2,-99};
		System.out.println(Arrays.toString(frequencyaverage(Arr,Arr.length)));
 
    }
	public static int[] frequencyaverage(int[] Arr,int N){
		Map<Integer,Integer>map=new HashMap<>();
       for(int i =0;i<N;i++){
			if(map.containsKey(Arr[i])){
				map.put(Arr[i],map.get(Arr[i])+1);
			}
			else{
				map.put(Arr[i],1);
			}
		}
       int[] unique=new int[map.size()];
       int c=0;
       for(Map.Entry<Integer,Integer>entrymap:map.entrySet()){
        unique[c++]=entrymap.getValue();
       }
       Arrays.sort(unique);
       
	   int[] result=new int[unique.length+2];
	   int index=0;
	   result[index++]=map.size();
	   for(int ele:unique){
		result[index++]=ele;
	   }
       double sum=0;
       for(int j=0;j<unique.length;j++){
        sum=sum+unique[j];
       }
       int avg= (int)Math.ceil(sum/map.size());
       result[index]=avg;
	   
	   return result;
	}
 
}