class CustomException{
	public static void main(String[] args){
		try{ //this is exception handling .it is used for checked.
			isValidAge(17);
		}catch(InvalidAgeException e){
			System.out.println(e.getMessage());
		}
		
		//isValidAge(17); //used for unchecked exception.
	}
	public static boolean isValidAge(int age) throws InvalidAgeException{
	//public static boolean isValidAge(int age){ //for unchecked
		if(age<18){
			throw new InvalidAgeException("You are not eligible for vote, Age<18 years");
		}
		return true;
	}
}

class InvalidAgeException extends RuntimeException{ // for unchecked
//class InvalidAgeException extends Exception{// for checked
	public InvalidAgeException(String msg){
		super(msg); //it is intialize with super class (exception) constructor with one argument
	}
}

