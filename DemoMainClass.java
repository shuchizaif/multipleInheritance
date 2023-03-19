package multiInheritance;

public class DemoMainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EducationParentClass obj1 = new UCOECollegeChildClass();
         obj1.numberofdept();
         obj1.numberoffaculty();
         obj1.numberofqual();
         obj1.Universityname();
         
     	EducationParentClass obj2 = new KDKCollegeChildClass();
     	obj2.numberofdept();
     	obj2.numberoffaculty();
     	obj2.numberofqual();
     	obj2.Universityname();
         
	
	
	
	}

}
