import java.io.*;
public abstract class Courses implements Serializable {
	
	protected String course_Name;
	protected Marks m=new Marks();
	Attendance at;
	public Courses()
	{
		course_Name="NA";
	}
	public Courses(String course_Name,Marks m) {
		this.course_Name=course_Name;
		this.m=m;
	}
	public abstract Marks get_Marks();
	public abstract void set_Marks();
}