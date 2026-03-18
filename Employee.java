import java.util.Comparator;
//class Employee implements Comparable<Employee>{
class Employee{
	private int id;
	private String name;
	private String bu;
	private String stack;
	private double salary;
	private long phone;
	private String email;
	
	public Employee(int id,String name,String bu,String stack,double salary,long phone,String email){
		this.id=id;
		this.name=name;
		this.bu=bu;
		this.stack=stack;
		this.salary=salary;
		this.phone=phone;
		this.email=email;
	}
	
	//accessors/mutators
	
	public int getId(){
		return id;
	}
	public void setId(int id){
		this.id=id;
	}
	public String getName(){
		return name;
	}
	
	public long getPhone(){
		return phone;
	}
	
	@Override
	public String toString(){
		return id+", "+name+", "+bu+", "+stack+", "+salary+", "+phone+", "+email;
		
	}
	/*@Override
	public int compareTo(Employee emp){
		if(this.id>emp.id){
			return 1;
		}else if(this.id==emp.id){
			return 0;
		}else{
			return -1;
		}
	}*/
	
	/*//sort according to name
	@Override
	public int compareTo(Employee emp){
		return this.name.compareTo(emp.name);
	}*/
}

class SortByName implements Comparator<Employee>{
	@Override
	public int compare(Employee e1,Employee e2){
		return e1.getName().compareTo(e2.getName());
			
	}
}

class SortByPhone implements Comparator<Employee>{
	@Override
	public int compare(Employee emp1,Employee emp2){
		if(emp1.getPhone()>emp2.getPhone()){
			return 1;
		}else if(emp1.getPhone()==emp2.getPhone()){
			return 0;
		}
		else{
			return -1;
		}
	}
}