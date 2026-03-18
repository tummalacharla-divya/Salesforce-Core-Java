// wrp to reverse a string
class ReverseString{
	public static void main(String[] args){
		
		//Using StringBuilder and reverse()
		StringBuilder s=new StringBuilder("Divya");
		System.out.println("Reverse of string Divya: "+s.reverse());
		
		String str="Divya";
		String res="";
		// using for loop and charAt()
		for(int i=str.length()-1;i>=0;i--){
			res+=str.charAt(i);
		}
		System.out.println("Reverse string: "+res);
		
		//using getBytes() method
		String s1="Capgemini";
		byte[] arr=s1.getBytes();
		byte[] a=new byte[arr.length];
		
		for(int i=0;i<arr.length;i++){
			a[i]=arr[arr.length-i-1];
		}
		System.out.println(new String(a));
		
		// using split() method
		String s2="java is object oriented";
		String[] sp=s2.split(" ");
		String res1="";
		for(String st:sp){
			for(int i=st.length()-1;i>=0;i--){
				res1+=st.charAt(i);
			}
			res1+=" ";
		}
		System.out.println(res1);
		
		
	}
}