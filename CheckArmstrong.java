//Example: Armstrong Numbers Between Two Integers

class CheckArmstrong{
	public static void main(String[] args){
		int low=999,high=99999;
		CheckArmstrong obj=new CheckArmstrong();
		for(int n=low+1;n<high;++n){
			if(obj.isArmStrong(n)){
				System.out.println(n+" ");
			}
		}
	}
	public boolean isArmStrong(int n){
		int digits=0;
		int result=0;
		int number=n;
		while(number!=0){
			digits+=1;
			number/=10;
		}
		
		number=n;
		while(n!=0){
			int r=n%10;
			result+=Math.pow(r,digits);
			n/=10;
		}
		
		if(result==number){
			return true;
		}
		return false;
	}
}