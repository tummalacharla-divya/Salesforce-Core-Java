//WAP to store username and password of 10 users in a map.
//Accept Username and Password and display any of the below messages accordingly
//Display Login Successful if Username and Password matches with any of the 10 users.
//Display Incorrect Password if Password doesn’t match
//Display User not registered if Username does not match.
import java.util.*;
class UsernamePassword{
	public static void main(String[] args){
		Map<String,String> map=new HashMap<>();
		
		map.put("tdivya","divya@123");
		map.put("sravani","sravani@123");
		map.put("lavanya","lavanya@123");
		map.put("mounika","mounika@123");
		map.put("pranathi","pranathi@123");
		map.put("shyam","shyam@123");
		map.put("sravanti","sravanti@123");
		map.put("lakshmi","lakshmi@123");
		map.put("lav","lav@123");
		map.put("riya","riya@123");
		
		Scanner sc=new Scanner(System.in);
		String Username=sc.next();
		String Password=sc.next();
		
		if(map.containsKey(Username)&&map.containsValue(Password)){
				System.out.println("Login Successful");
		}
		else if(map.containsKey(Username)&&!map.containsValue(Password)){
			System.out.println("Incorrect Password");
		}else if(!map.containsKey(Username)){
			System.out.println("User not registered");
		}
		
	}
}