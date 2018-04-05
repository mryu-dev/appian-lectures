
public class Employee  implements Comparable{

	private int age;
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}



	public int compareTo(Object otherEmployee){
	    	   
	        int otherEmployeeAge = ((Employee) otherEmployee).getAge();
	       
	        if(this.getAge() > otherEmployeeAge)    
	            return 1;
	        else if ( this.getAge() < otherEmployeeAge )
	            return -1;
	        else
	            return 0;
	   
	    }
}
