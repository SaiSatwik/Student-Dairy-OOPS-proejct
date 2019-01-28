import java.util.*;
import java.io.*;
public class Marks implements Serializable {
	private int  periodical_1_marks;
	private int periodical_2_marks;
	private int endSemester_marks;
	private int continuous_evaluation;
	private int attendance_marks;
	public Marks()
	{
		periodical_1_marks=5;
		periodical_2_marks=5;
		endSemester_marks=10;
		continuous_evaluation=20;
		attendance_marks=0;
	}
	public Marks(int periodical_1_marks,int periodical_2_marks,int endSemester_marks,int continuous_evaluation,int attendance_marks ) {
		this.periodical_1_marks=periodical_1_marks;
		this.periodical_2_marks=periodical_2_marks;
		this.endSemester_marks=endSemester_marks;
		this.continuous_evaluation=continuous_evaluation;
		this.attendance_marks=attendance_marks;
	}
	protected int getPeriodical_1_marks() {
		return periodical_1_marks;
	}
	protected void setPeriodical_1_marks(int periodical_1_marks) {
		this.periodical_1_marks = periodical_1_marks;
	}
	protected int getPeriodical_2_marks() {
		return periodical_2_marks;
	}
	protected void setPeriodical_2_marks(int periodical_2_marks) {
		this.periodical_2_marks = periodical_2_marks;
	}
	protected int getEndSemester_marks() {
		return endSemester_marks;
	}
	protected void setEndSemester_marks(int endSemester_marks) {
		this.endSemester_marks = endSemester_marks;
	}
	protected int getContinuous_evaluation() {
		return continuous_evaluation;
	}
	protected void setContinuous_evaluation(int  continuous_evaluation) {
		this.continuous_evaluation = continuous_evaluation;
	}
	protected int getAttendance_marks() {
		return attendance_marks;
	}
	protected void setAttendance_marks(int attendance_marks) {
		this.attendance_marks = attendance_marks;
	}
	
	public String toString()
	{
		return periodical_1_marks+" "+periodical_2_marks+" "+endSemester_marks+" "+continuous_evaluation+" "+attendance_marks;
	}
	

}