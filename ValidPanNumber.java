// WAP to check if the PAN Number is valid or Not, if Not valid throw a InvalidPANException.
// length should be 10 digits.

class ValidPanNumber{
	public static void main(String[] args){
		String PAN="24s5d6365";
		
		try{
			isValidPan(PAN);
		}
		catch(InvalidPANException e)
		{
			System.out.println(e.getMessage());
		}
				
	}
	public static boolean isValidPan(String PAN) throws InvalidPANException{
		if(PAN.length()!=10){
			throw new InvalidPANException("PAN Number should be 10 digits");
		}
		return true;
	}
}

class InvalidPANException extends Exception{
	public InvalidPANException(String msg){
		super(msg);
	}
}
		
		