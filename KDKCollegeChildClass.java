package multiInheritance;

public class KDKCollegeChildClass  extends EducationParentClass implements UKUnivChildInterface,CanadaUnivChildInterface {

	@Override
	public void numberoffaculty()
	{
		System.out.println("Number of Faculty in KDKCollegeChildClass ");
	}
	@Override
	public void Universityname()
	{
		System.out.println("University name of KDKCollegeChildClass");
	}
	public void entrygatecount()
	{
		System.out.println("Number of Entry gate count in KDKCollegeChildClass");
	}
	@Override
	public void universityname() {
		System.out.println("univ name");
		
	}
	@Override
	public void univdept() {
		System.out.println("univ dept name");
		
	}
	@Override
	public void campus() {
		System.out.println("univ campus name");
		
	}
	@Override
	public void totalstudents() {
		System.out.println("totalstudents");
		
	}
	@Override
	public void univfac() {
		System.out.println("university fac");
		
	}
	@Override
	public void univqual() {
		System.out.println("univ qualifications");
		
	}
	@Override
	public void univclasses() {
		System.out.println("univ classes");
		
	}
	@Override
	public void playgrounds() {
		System.out.println("Playgrounds");
		
	}

    










}
