
import java.io.*;
import java.util.*;
public class ViewAttendance {
	int roll;
	Scanner s=new Scanner(System.in);
	ViewAttendance()
	{
		System.out.println("1.Display all Students Attendance");
		System.out.println("2.Display CSE Students Attendance");
		System.out.println("3.Display ECE Students Attendance");
		System.out.println("4.Display EEE Students Attendance");
		System.out.println("5.Enter the Roll no");
		int n =s.nextInt();
		switch(n)
		{
			case 1: viewAttendance();
					break;
			case 2: cseAttendance();
					break;
			case 3: eceAttendance();
					break;
			case 4: eeeAttendance();
					break;
			case 5: System.out.println("Enter the Roll:");
					roll=s.nextInt();
					viewRollAttendance();
					break;
			default :break;
		}
	}
	public void viewAttendance()
	{
		try
		{	ArrayList<Object> retriving=new ArrayList<Object>();
			FileInputStream dis=new FileInputStream("details.txt");
			ObjectInputStream ois=new ObjectInputStream(dis);
			retriving=(ArrayList<Object>)ois.readObject();
			ArrayList<Student> ss=(ArrayList<Student>)retriving.get(0);
		
			ois.close();
			for(Student st:ss)
			{
						System.out.println("The Attendance of "+st.getName()+":");
						Branch b=st.getBranch();
						String csem=st.getCurrentSem();
						System.out.println("The attendance for :"+ csem);
						if(csem.equals("sem1"))
						{
							ArrayList<Courses> sem1=b.getSem1();
							for(Courses c:sem1)
							{
								System.out.print(c.course_Name+": ");
								System.out.println(c.at);
							}
						}else if(csem.equals("sem2"))
						{
							ArrayList<Courses> sem2=b.getSem2();
							for(Courses c:sem2)
							{
								System.out.print(c.course_Name+": ");
								System.out.println(c.at);
							}
						}
						else if(csem.equals("sem3"))
						{
							ArrayList<Courses> sem3=b.getSem3();
							for(Courses c:sem3)
							{
								System.out.print(c.course_Name+": ");
								System.out.println(c.at);
							}
						}else if(csem.equals("sem4"))
						{
							ArrayList<Courses> sem4=b.getSem4();
							for(Courses c:sem4)
							{
								System.out.print(c.course_Name+": ");
								System.out.println(c.at);
							}
						}
						System.out.println();
			}
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public void cseAttendance()
	{
		try
		{	ArrayList<Object> retriving=new ArrayList<Object>();
			FileInputStream dis=new FileInputStream("details.txt");
			ObjectInputStream ois=new ObjectInputStream(dis);
			retriving=(ArrayList<Object>)ois.readObject();
			ArrayList<Student> ss=(ArrayList<Student>)retriving.get(0);
		
			ois.close();
			for(Student st:ss)
			{
				if(st.getBranch().branchName.equals("CSE"))
				{
						System.out.println("The Attendance of "+st.getName()+":");
						Branch b=st.getBranch();
						String csem=st.getCurrentSem();
						System.out.println("The attendance for :"+ csem);
						if(csem.equals("sem1"))
						{
							ArrayList<Courses> sem1=b.getSem1();
							for(Courses c:sem1)
							{
								System.out.print(c.course_Name+": ");
								System.out.println(c.at);
							}
						}else if(csem.equals("sem2"))
						{
							ArrayList<Courses> sem2=b.getSem2();
							for(Courses c:sem2)
							{
								System.out.print(c.course_Name+": ");
								System.out.println(c.at);
							}
						}
						else if(csem.equals("sem3"))
						{
							ArrayList<Courses> sem3=b.getSem3();
							for(Courses c:sem3)
							{
								System.out.print(c.course_Name+": ");
								System.out.println(c.at);
							}
						}else if(csem.equals("sem4"))
						{
							ArrayList<Courses> sem4=b.getSem4();
							for(Courses c:sem4)
							{
								System.out.print(c.course_Name+": ");
								System.out.println(c.at);
							}
						}
						System.out.println();
				}
			}
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public void eceAttendance()
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
				if(st.getBranch().branchName.equals("ECE"))
				{
						System.out.println("The Attendance of "+st.getName()+":");
						Branch b=st.getBranch();
						String csem=st.getCurrentSem();
						System.out.println("The attendance for :"+ csem);
						if(csem.equals("sem1"))
						{
							ArrayList<Courses> sem1=b.getSem1();
							for(Courses c:sem1)
							{
								System.out.print(c.course_Name+": ");
								System.out.println(c.at);
							}
						}else if(csem.equals("sem2"))
						{
							ArrayList<Courses> sem2=b.getSem2();
							for(Courses c:sem2)
							{
								System.out.print(c.course_Name+": ");
								System.out.println(c.at);
							}
						}
						else if(csem.equals("sem3"))
						{
							ArrayList<Courses> sem3=b.getSem3();
							for(Courses c:sem3)
							{
								System.out.print(c.course_Name+": ");
								System.out.println(c.at);
							}
						}else if(csem.equals("sem4"))
						{
							ArrayList<Courses> sem4=b.getSem4();
							for(Courses c:sem4)
							{
								System.out.print(c.course_Name+": ");
								System.out.println(c.at);
							}
						}
						System.out.println();
				}
			}
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
	public void eeeAttendance()
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
				if(st.getBranch().branchName.equals("EEE"))
				{
						System.out.println("The Attendance of "+st.getName()+":");
						Branch b=st.getBranch();
						String csem=st.getCurrentSem();
						System.out.println("The attendance for :"+ csem);
						if(csem.equals("sem1"))
						{
							ArrayList<Courses> sem1=b.getSem1();
							for(Courses c:sem1)
							{
								System.out.print(c.course_Name+": ");
								System.out.println(c.at);
							}
						}else if(csem.equals("sem2"))
						{
							ArrayList<Courses> sem2=b.getSem2();
							for(Courses c:sem2)
							{
								System.out.print(c.course_Name+": ");
								System.out.println(c.at);
							}
						}
						else if(csem.equals("sem3"))
						{
							ArrayList<Courses> sem3=b.getSem3();
							for(Courses c:sem3)
							{
								System.out.print(c.course_Name+": ");
								System.out.println(c.at);
							}
						}else if(csem.equals("sem4"))
						{
							ArrayList<Courses> sem4=b.getSem4();
							for(Courses c:sem4)
							{
								System.out.print(c.course_Name+": ");
								System.out.println(c.at);
							}
						}
						System.out.println();
				}
			}
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
	public void viewRollAttendance()
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
							System.out.print(c.course_Name+": ");
							System.out.println(c.at);
						}
					}else if(csem.equals("sem2"))
					{
						ArrayList<Courses> sem2=b.getSem2();
						for(Courses c:sem2)
						{
							System.out.print(c.course_Name+": ");
							System.out.println(c.at);
						}
					}
					else if(csem.equals("sem3"))
					{
						ArrayList<Courses> sem3=b.getSem3();
						for(Courses c:sem3)
						{
							System.out.print(c.course_Name+": ");
							System.out.println(c.at);
						}
					}else if(csem.equals("sem4"))
					{
						ArrayList<Courses> sem4=b.getSem4();
						for(Courses c:sem4)
						{
							System.out.print(c.course_Name+": ");
							System.out.println(c.at);
						}
					}
				}
			}
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}

}