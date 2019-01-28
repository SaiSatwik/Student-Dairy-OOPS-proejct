

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class UpdateAttendance {
	private int roll;
	Scanner s=new Scanner(System.in);
	public UpdateAttendance()
	{
		System.out.println("Enter the roll:");
		roll=s.nextInt();
		updateAttendance();
	}
	public void updateAttendance()
	{
		try
		{
			ArrayList<Object> retriving=new ArrayList<Object>();
			FileInputStream dis=new FileInputStream("details.txt");
			ObjectInputStream ois=new ObjectInputStream(dis);
			retriving=(ArrayList<Object>)ois.readObject();
			ArrayList<Student> ss=(ArrayList<Student>)retriving.get(0);
			ois.close();
			for(Student st:ss)
			{
				if(st.getRollNo()==this.roll)
				{
					Branch b=st.getBranch();
					int i=0;
					String csem=st.getCurrentSem();
					System.out.println(csem);
					if(csem.equals("sem1"))
					{
						i=1;
						System.out.println("Enter the course number:");
						ArrayList<Courses> sem1=b.getSem1();
						for(Courses c:sem1)
						{
							System.out.println(i+"."+c.course_Name);
							i++;
						}
						int n=s.nextInt();
						sem1.get(n-1).at.setAttendance();
					}else if(csem.equals("sem2"))
					{
						i=1;
						System.out.println("Enter the course number:");
						ArrayList<Courses> sem2=b.getSem2();
						for(Courses c:sem2)
						{
							System.out.println(i+"."+c.course_Name);
							i++;
						}
						int n=s.nextInt();
						sem2.get(n-1).at.setAttendance();
					}
					else if(csem.equals("sem3"))
					{
						i=1;
						System.out.println("Enter the course number:");
						ArrayList<Courses> sem3=b.getSem3();
						for(Courses c:sem3)
						{
							System.out.println(i+"."+c.course_Name);
							i++;
						}
						int n=s.nextInt();
						sem3.get(n-1).at.setAttendance();
					}else if(csem.equals("sem4"))
					{
						i=1;
						System.out.println("Enter the course number:");
						ArrayList<Courses> sem4=b.getSem4();
						for(Courses c:sem4)
						{
							System.out.println(i+"."+c.course_Name);
							i++;
						}
						int n=s.nextInt();
						sem4.get(n-1).at.setAttendance();
					}
				}
			}
			ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("Students.txt"));
			oos.writeObject(retriving);
			oos.close();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}


}