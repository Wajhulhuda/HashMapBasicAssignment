package hashmapoctober13;
import java.util.HashMap;

public class CreateAStudentListWithId {
	
	public static void main(String []args) {
		HashMap <Integer, String> student =new HashMap<>();
		student.put(1,"Sanjay");
		student.put(2,"Ashutosh");
		student.put(3,"Nipun");
		student.put(4,"Rabish");
		student.put(5,"Akansha");
		
		for(Integer i : student.keySet()) {
			
			System.out.println("Key-"+ i+" value-"+student.get(i));
			
		}
		
	}

}
