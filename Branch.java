
import java.io.Serializable;
import java.util.ArrayList;

public class Branch implements Serializable{
	String branchName;
	private ArrayList<Courses> sem1=new ArrayList<Courses>();
	private ArrayList<Courses> sem2=new ArrayList<Courses>();
	private ArrayList<Courses> sem3=new ArrayList<Courses>();	
	private ArrayList<Courses>	sem4=new ArrayList<Courses>();
	Branch(String BranchName)
	{
		branchName=BranchName;
		if(branchName.equals("CSE"))
		{
			sem1.add(new CTPS());
			sem1.add(new CommunicativeEnglish());
			sem1.add(new CalculusMatrixAlgebra());
			sem1.add(new CulturalEducation());
			sem1.add(new EngineeringDrawing());
			sem1.add(new Physics());
			sem1.add(new PhysicsLab());
			
			
			sem2.add(new ComputerProgramming());
			sem2.add(new ComputerScienceEssentials());
			sem2.add(new Chemistry());
			sem2.add(new ChemistryLab());
			sem2.add(new EEE());
			sem2.add(new VectorCalculus());
			
			sem3.add(new DataStructures());	
			sem3.add(new DigitalCircuits());
			sem3.add(new OOPS());
			sem3.add(new AVP());
		}
	}
	public void sem1_marks()
	{
		System.out.println(sem1.size());
		for(int i=0;i<sem1.size();i++)
		{
			System.out.println(sem1.get(i).course_Name+" :"+sem1.get(i).get_Marks());
		}
	}
	public void sem2_marks() {
		System.out.println(sem2.size());
		for(int i=0;i<sem2.size();i++)
		{
			System.out.println(sem2.get(i).course_Name+" :"+sem2.get(i).get_Marks());
		}
	}
	public void sem3_marks() {
		System.out.println(sem3.size());
		for(int i=0;i<sem3.size();i++)
		{
			System.out.println(sem3.get(i).course_Name+" :"+sem3.get(i).get_Marks());
		}
		
	}	
	protected String getBranchName() {
		return branchName;
	}
	protected void setBranchName(String branchName) {
		this.branchName = branchName;
	}
	protected ArrayList<Courses> getSem1() {
		return sem1;
	}
	protected void setSem1(ArrayList<Courses> sem1) {
		this.sem1 = sem1;
	}
	protected ArrayList<Courses> getSem2() {
		return sem2;
	}
	protected void setSem2(ArrayList<Courses> sem2) {
		this.sem2 = sem2;
	}
	protected ArrayList<Courses> getSem3() {
		return sem3;
	}
	protected void setSem3(ArrayList<Courses> sem3) {
		this.sem3 = sem3;
	}
	protected ArrayList<Courses> getSem4() {
		return sem4;
	}
	protected void setSem4(ArrayList<Courses> sem4) {
		this.sem4 = sem4;
	}
	public String toString() {
		return "["+this.branchName+ "]";
	}
	
	

}