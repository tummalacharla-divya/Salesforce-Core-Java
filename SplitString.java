class SplitString{
	public static void main(String[] args){
		String str="this is java programming is";
		try{
			splitString(str);
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
	}
	public static void splitString(String str) throws newSplitException{
		String[] s=str.split(" ");
		for(int i=0;i<s.length;i++){
			try{
			if(s[i].length()%2==0){
				System.out.println(s[i]+" : "+s[i].length());
				
			}
			else{
				throw new newSplitException("Error : "+s[i]+" is odd length");
			}
			}catch(Exception e){
			System.out.println(e.getMessage());
		}
		}
	}
}
class newSplitException extends Exception{
	public newSplitException(String msg){
		super(msg);
	}
}