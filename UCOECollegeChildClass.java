package multiInheritance;

public class UCOECollegeChildClass extends EducationParentClass implements USUnivChildInterface {
	
	@Override
	public void numberofdept()
	{
		System.out.println(" Number of  Dept in UCOECollegeChildClass");
	}
	
	@Override
	public void numberofqual()
	{
		System.out.println("Number of Quals in UCOECollegeChildClass");
	}
	
	
	public void teachersname()
	{
		System.out.println("Name of teachers in  UCOECollegeChildClass");
	}
	
	public void universityname()
	{
		System.out.println("University name of USUnivChildInterface");
	}
	public void univdept()
	{
		System.out.println("University dept name of USUnivChildInterface ");
	}

	@Override
	public void univfac() 
	{
		System.out.println("University fac name");
		}

	@Override
	public void univqual() {
		System.out.println("Unic qual name");
		}

	@Override
	public void campus() {
		System.out.println("Campus name");
		}

	@Override
	public void totalstudents() {
		System.out.println("Count of Total students");
		
	}

	@Override
	public void univsections() {
		System.out.println("University sections");
		}


}
