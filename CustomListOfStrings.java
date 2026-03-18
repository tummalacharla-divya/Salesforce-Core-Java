/*
Design and implement a Java class that represents a custom list of strings. This class should provide the following core functionalities:
 
Add String:
 
Method: void add(String element)
Functionality: Add a given string to the end of the list.
Remove String:
 
Method: boolean remove(String element)
Functionality: Remove the first occurrence of the given string from the list. Return true if the string was removed successfully, false otherwise.
Update String:
 
Method: void update(int index, String newElement)
Functionality: Update the string at the specified index with the newElement. Handle cases where the index is out of bounds.
Display List:
 
Method: void display()
Functionality: Print all the elements in the list to the console.
Constraints:
 
The implementation should use an underlying array to store the list elements.
The class should handle potential issues like array overflow (when adding elements) and index out-of-bounds exceptions.
*/
import java.util.*;
class CustomListOfStrings{
	public static List<String> list=new ArrayList<>();
	public static void add(String element){
		list.add(element);
		System.out.println("element added successfully");
	}
	public static boolean remove(String element){
		if(list.contains(element)){
			return list.remove(element);
		}
		return false;
	}
	public static void update(int index,String newElement){
		try{
			if(index<0 || index>list.size()){
				System.out.println("invalid index"); 
			}
			list.set(index,newElement);
			System.out.println("newElement is added at given index");
		}catch(IndexOutOfBoundsException e){
			System.out.println(e.getMessage());
		}
	}
	public static void display(){
		System.out.println("elements in the list are:  "+list);
	}
	
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int choice;
		do{
			System.out.println("1. Add element into list");
			System.out.println("2.remove element from a list");
			System.out.println("3. update element into a list");
			System.out.println("4. display element in the list");
			System.out.println("5. exit");
			choice=sc.nextInt();
			switch(choice){
				case 1:System.out.println("Enter the string that you want to enter in a list: ");
						String s=sc.next();
						add(s);
						break;
				case 2:System.out.println("Enter the string that you want to remove from a list: ");
						String r=sc.next();
						if(remove(r)){
							System.out.println("String "+r+" is removed successfully");
						}
						else{
							System.out.println("String not found in the list");
						}
						break;
				case 3:System.out.println("Enter the index: ");
						int index=sc.nextInt();
						System.out.println("Enter the string that you want to update: ");
						String str=sc.next();
						update(index,str);
						break;
				case 4:
						display();
						break;
				case 5:
						System.out.println("user exited");
						break;
				default:System.out.println("Invalid choice");
						break;
			}
			
		
		}while(choice!=5);
	}
}