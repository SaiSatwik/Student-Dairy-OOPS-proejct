
import java.io.*;
import java.util.*;
public class UpdateMarks {
	private int roll;
	Scanner s=new Scanner(System.in);
	UpdateMarks()
	{
		System.out.println("Enter the roll:");
		roll=s.nextInt();
		updateMarks();
	}
	public void updateMarks()
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
					String csem=st.getCurrentSem();
					System.out.println(csem);
					if(csem.equals("sem1"))
					{
						ArrayList<Courses> sem1=b.getSem1();
						for(Courses c:sem1)
						{
							System.out.println(c.course_Name);
							c.set_Marks();
						}
					}else if(csem.equals("sem2"))
					{
						ArrayList<Courses> sem2=b.getSem2();
						for(Courses c:sem2)
						{
							System.out.println(c.course_Name);
							c.set_Marks();
						}
					}
					else if(csem.equals("sem3"))
					{	System.out.println("Satwik");
						ArrayList<Courses> sem3=b.getSem3();
						for(Courses c:sem3)
						{
							System.out.println(c.course_Name);
							c.set_Marks();
						}
					}else if(csem.equals("sem4"))
					{
						ArrayList<Courses> sem4=b.getSem4();
						for(Courses c:sem4)
						{
							System.out.println(c.course_Name);
							c.set_Marks();
						}
					}
				}
			}
			ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("details.txt"));
			oos.writeObject(retriving);
			oos.close();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}