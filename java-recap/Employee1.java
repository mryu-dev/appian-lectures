import java.util.Comparator;


public class Employee1 implements Comparator{

	private int age;
	 public void setAge(int age){    
	        this.age=age;
	    }
	   
	    public int getAge(){    
	        return this.age;    
	    }

		public int compare(Object o1, Object o2) {
			int emp1Age = ((Employee1)o1).getAge();        
	        int emp2Age = ((Employee1)o2).getAge();
	       
	        if(emp1Age > emp2Age)
	            return 1;
	        else if(emp1Age < emp2Age)
	            return -1;
	        else
	            return 0;
	     
		}
}
