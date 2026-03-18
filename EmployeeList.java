import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
class EmployeeList{
	public static void main(String[] args){
		List<Employee> employee=new ArrayList<>();
		//System.out.println(emp1.setId(105));
		//System.out.println(emp1.getId());
		addEmployees(employee);
		//Collections.sort(employee); //using comparable
		
		//for sorting the employee id with comparator method.
		SortById sortById=new SortById();
		//Collections.sort(employee,sortById);
		//Collections.sort(employee,new SortByName());
		
		Collections.sort(employee,new SortByPhone());
		for(Employee emp:employee){
			System.out.println(emp);
		}
		
	}
	public static void addEmployees(List<Employee> employee){
		
		Employee emp1=new Employee(101,"divya","DCX","Salesforce",30000,1234567890L,"tdivya23@gmail.com");
		Employee emp3=new Employee(103,"sravani","DCX","Salesforce",30000,1234728378L,"sravani23@gmail.com");
		Employee emp4=new Employee(104,"lavanya","DCX","Salesforce",30000,1228391790L,"lavanya23@gmail.com");
		Employee emp2=new Employee(102,"mounika","DCX","Salesforce",30000,7489320832L,"mounika23@gmail.com");
		
		employee.add(emp1);
		employee.add(emp2);
		employee.add(emp3);
		employee.add(emp4);
		
	}
}