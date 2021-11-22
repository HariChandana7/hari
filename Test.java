// Chaining Constructors ----> calling one constructor from another constructor
class Student
 {

	String name;				 										
	int rollNo;															
	String collegeName;													
	String collegeLocation;       										
	String dept;														
	String gender;	
	
	public Student(String dept, String gender, int rollNo)
                   {
		this.dept = dept;
		this.gender = gender;
		this.rollNo = rollNo;
	}

	public Student(String collegeName, String collegeLocation)
                    {
		this("CSE", "Female", 544);
		this.collegeName = collegeName;
		this.collegeLocation = collegeLocation;
	}

	public Student(String name)
                   {
		this("Ashoka Women's Engineering  College", "Dupadu");
		this.name = name;
	}
}

 public class Test
{
	public static void main(String[] args){   
		Student s1 = new Student("HariChandana");
		System.out.println(s1.name); 
		System.out.println(s1.collegeName); 
		System.out.println(s1.collegeLocation); 
		System.out.println(s1.rollNo);  
		System.out.println(s1.gender); 
		System.out.println(s1.dept); 

	}
}
   // OUTPUT : HariChandana
//Ashoka Women's Engineering  College
//Dupadu
//544
//Female
//CSE

