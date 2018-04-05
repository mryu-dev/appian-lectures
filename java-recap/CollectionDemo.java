
public class CollectionDemo {
	public static void main(String[] args) {
		
	 Employee one = new Employee();        
     one.setAge(30);
    
     Employee two = new Employee();        
     two.setAge(30);
     
     if(one.compareTo(two) > 0) {        
         System.out.println("Employee one is elder than employee two!");
    
     } else if(one.compareTo(two) < 0) {        
         System.out.println("Employee one is younger than employee two!");        
    
     } else if(one.compareTo(two) == 0) {        
         System.out.println("Both employees are same!");        
     }
	}
}
