//HashMap Example...
import java.util.*;
class Employee
  {
    int empId;
    String empName;
    String empDesignation;
    double empSal;
       public Employee(int empId,String empName,String empDesignation,double empSal)  {
	this.empId = empId ;
	this.empName = empName;
	this.empDesignation = empDesignation ;
	this.empSal = empSal;
      }
     }

 public class DemoHashset {
	public static void main(String... args){
  	      HashMap<Integer,Employee>  hm = new HashMap<Integer,Employee>();
		Employee e1 = new Employee(123701 , "Hosu ", " General Manager ", 207000.0 ); 
		Employee e2 = new Employee(123703 , "Cein", "  CEO ", 552000.0 ); 
		Employee e3 = new Employee(123706 , "Jooan ", " Visual Creator ", 157000.0 ); 
		Employee e4 = new Employee(123709 , "Zeha ", " Assistant Manager ", 172000.0 ); 
		Employee e5 = new Employee(123711 , "Hwan", " Director ", 352000.0 );	
		 
		hm.put(123701 , e1);	
		hm.put(123703 , e2);	
		hm.put(123706 , e3);	
		hm.put(123709 , e4);	
		hm.put(123711 , e5);	
		
	        Iterator<Map.Entry<Integer , Employee>> itr = hm.entrySet().iterator();
	         while(itr.hasNext())  {
		Map.Entry<Integer , Employee>  entry = itr.next();
		 System.out.println("Key is  : " + entry.getKey()); 
		Employee  t = entry.getValue();
		System.out.println(t.empId + "  " + t.empName + "  " +t.empDesignation + "  "+ t.empSal ); 
	        }
    }
    
}
/*   Output :

Key is  : 123701
123701  Hosu    General Manager   207000.0
Key is  : 123703
123703  Cein    CEO   552000.0
Key is  : 123706
123706  Jooan    Visual Creator   157000.0
Key is  : 123709
123709  Zeha    Assistant Manager   172000.0
Key is  : 123711
123711  Hwan   Director   352000.0

*/
