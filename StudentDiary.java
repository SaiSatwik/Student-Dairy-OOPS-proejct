
import java.io.*;
import java.util.Scanner;

public class StudentDiary {

	public static void main(String[] args) {
		Scanner s=  new Scanner(System.in);
		StudyDiary main=new StudyDiary();
		int i=0;
		displayMenu();
		i=s.nextInt();
		switch(i)
		{
			case 1: main.createData();
					break;
			
			case 2: main.saveData();
					break;
			case 3: main.loadData();
					break;
			case 4:
					System.out.println("1.Update Marks");
					System.out.println("2.ViewMarks");
					int n=s.nextInt();
					if(n==1)
					{
						UpdateMarks um=new UpdateMarks();
						break;
					}else
					{
						ViewMarks vm=new ViewMarks();
						break;
					}
					
			case 5:
					System.out.println("1.Update Attendance");
					System.out.println("2.View Attendace");
					n=s.nextInt();
					if(n==1)
					{
						UpdateAttendance um=new UpdateAttendance();
						break;
					}else
					{
						ViewAttendance vm=new ViewAttendance();
						break;
					}
	
			case 6: EraseData ed=new EraseData();
					break;
			case 7: 
					break;
			default:System.out.println("Invalid input:");
					break;
		}
		

	}
	public static void displayMenu()
	{
		System.out.println("1.Add all available Details");
		System.out.println("2.Enter each Student Details");
		System.out.println("3.View Each Student Details");
		System.out.println("4.Marks");
		System.out.println("5.Attendence");
		System.out.println("6.Erase Data");
		System.out.println("7.Exit");
	}
}