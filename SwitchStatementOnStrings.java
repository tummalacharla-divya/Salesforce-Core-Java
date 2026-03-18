//Example: Implement the switch statement on Strings
class SwitchStatementOnStrings{
	public static void main(String[] args){
		String name="java";
		switch(name){
			case "python":
					System.out.println("given string is python");
					break;
			case "java":
					System.out.println("given string is java");
					break;
			case "c":
					System.out.println("given string is c");
					break;
			default:
				System.out.println("string not found");
				break;
		}
	}
}