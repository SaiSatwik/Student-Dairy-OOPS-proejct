import java.util.Scanner;

public class ComputerProgramming extends Courses {
	public  ComputerProgramming()
	{
		this.course_Name="ComputerProgramming";
	}
	public Marks get_Marks()
	{
		return this.m;
	}
	public void set_Marks()
	{
		System.out.println("Do you  want to enter the marks: 1.yes 2.no");		
		Scanner s= new Scanner(System.in);
		int n=s.nextInt();
		if(n==1)
		{
			System.out.println("Enter the marks of student:");
			System.out.println("Periodical1:");
			m.setPeriodical_1_marks(((int)(15)*s.nextInt())/(int)100);
			System.out.println("Periodiacl2");
			m.setPeriodical_2_marks(((int)(15)*s.nextInt())/(int)100);
			System.out.println("Endsemster");
			m.setEndSemester_marks(((int)(50)*s.nextInt())/(int)100);
			System.out.println("Continous evaluation");
			m.setContinuous_evaluation(s.nextInt());
		}else
		{
			m.setPeriodical_1_marks(5);
			m.setPeriodical_2_marks(5);
			m.setEndSemester_marks(10);
			m.setContinuous_evaluation(5);
			m.setAttendance_marks(0);
		}
	}

}
