import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
class BufferedReader {
  public static void main(String args[]) throws IOException{
   
   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	int size = Integer.parseInt(br.readLine());
	//Scanner sc=new Scanner(System.in);
	//int size=sc.nextInt();
	String[] names = new String[size];
	
	for(int i=0;i<size;i++){
	 names[i] = br.readLine();
	 
	}
	System.out.println("Array Elements are : \n");
	for(int i=0;i<size;i++){
	 System.out.println(names[i]);
	}
	
	
  
  }
}