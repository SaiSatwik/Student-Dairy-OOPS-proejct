
import java.io.*;
import java.util.*;
public class Attendance implements Serializable{
	private int no_Classes;
	private int no_Classes_Attended;
	public Attendance()
	{
		no_Classes=50;
		no_Classes_Attended=0;
	}
	public Attendance(int no_Classes_Attended)
	{
		this.no_Classes_Attended=no_Classes_Attended;
	}
	protected int getNo_Classes() {
		return no_Classes;
	}
	protected void setNo_Classes(int no_Classes) {
		this.no_Classes = no_Classes;
	}
	protected int getNo_Classes_Attended() {
		return no_Classes_Attended;
	}
	protected void setNo_Classes_Attended(int no_Classes_Attended) {
		this.no_Classes_Attended = no_Classes_Attended;
	}
	public double get_attendance()
	{
		return (no_Classes_Attended/no_Classes)*100;
	}
	public void setAttendance()
	{
		Scanner s= new Scanner(System.in);
		System.out.println("Total  no of classes:");
		no_Classes=s.nextInt();
		System.out.println("Classes Attended:");
		no_Classes_Attended=s.nextInt();
	}
	@Override
	public String toString() {
		return "Attendance [no_Classes=" + no_Classes + ", no_Classes_Attended=" + no_Classes_Attended
				+ ", getNo_Classes()=" + getNo_Classes() + ", getNo_Classes_Attended()=" + getNo_Classes_Attended()
				+ ", get_attendance()=" + get_attendance() + "]";
	}
	
	

}