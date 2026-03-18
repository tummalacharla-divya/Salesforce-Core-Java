//Example: Sort ArrayList of Custom Objects By Property
import java.util.ArrayList;

class CustomObject{
	private String customeProperty;
	
	public CustomObject(String customeProperty){
		this.customeProperty=customeProperty;
	}
	public String getProperty(){
		return customeProperty;
	}
	
	public static void main(String[] args){
		ArrayList<CustomObject> l=new ArrayList<>();
		l.add(new CustomObject("a"));
		l.add(new CustomObject("Aa"));
		l.add(new CustomObject("x"));
		l.add(new CustomObject("g"));
		l.add(new CustomObject("s"));
		
		l.sort((o1,o2)-> o1.getProperty().compareTo(o2.getProperty()));
		for(CustomObject obj:l){
			System.out.print(obj.getProperty()+" ");
		}
		
	}
}