//Write a Java Program to validate the full name of an employee. Create and throw a user defined exception if firstName and lastName 
is blank.

import java.util.Scanner;
class ValidateFullName{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		String firstName=sc.nextLine();
		String lastName=sc.nextLine();
		try{
			if(validate(firstName,lastName)){
				System.out.printf("valid full name: "+firstName+" "+lastName);
			}
		}catch(InvalidNameException e){
			System.out.println(e.getMessage());
		}
	}
	public static boolean validate(String firstName,String lastName) throws InvalidNameException{
		if(firstName.equals("") && lastName.equals("")){
			throw new InvalidNameException("First name and last names are blank. please enter full name");
		}
		return true;
	}
}
class InvalidNameException extends Exception{
	public InvalidNameException(String msg){
		super(msg);
	}
}