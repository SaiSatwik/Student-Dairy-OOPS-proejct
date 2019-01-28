
import java.util.*;
import java.io.*;
public class ViewMarks {
	Scanner s= new Scanner(System.in);
	int roll;
	ViewMarks()
	{
		
		System.out.println("1.Display all Students Marks");
		System.out.println("2.Display CSE Students Marks");
		System.out.println("3.Display ECE Students Marks");
		System.out.println("4.Display EEE Students Marks");
		System.out.println("5.Enter the Roll no");
		int n =s.nextInt();
		switch(n)
		{
			case 1: viewMarks();
					break;
			case 2: cseMarks();
					break;
			case 3: eceMarks();
					break;
			case 4: eeeMarks();
					break;
			case 5: System.out.println("Enter the Roll:");
					roll=s.nextInt();
					viewRollMarks();
					break;
			default :break;
		}
		
		
	}
	public void viewMarks()
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
						System.out.println("The marks of "+st.getName()+":");
						Branch b=st.getBranch();
						String csem=st.getCurrentSem();
						System.out.println(csem);
						if(csem.equals("sem1"))
						{
							ArrayList<Courses> sem1=b.getSem1();
							for(Courses c:sem1)
							{
								System.out.print(c.course_Name+": ");
								System.out.println(c.m);
							}
						}else if(csem.equals("sem2"))
						{
							ArrayList<Courses> sem2=b.getSem2();
							for(Courses c:sem2)
							{
								System.out.print(c.course_Name+": ");
								System.out.println(c.m);
							}
						}
						else if(csem.equals("sem3"))
						{
							ArrayList<Courses> sem3=b.getSem3();
							for(Courses c:sem3)
							{
								System.out.print(c.course_Name+": ");
								System.out.println(c.m);
							}
						}else if(csem.equals("sem4"))
						{
							ArrayList<Courses> sem4=b.getSem4();
							for(Courses c:sem4)
							{
								System.out.print(c.course_Name+": ");
								System.out.println(c.m);
							}
						}
						System.out.println();
			}
		}catch(Exception e)
		{
			e.printStackTrace();
		}

	}
	public void viewRollMarks()
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
							System.out.println(c.m);
						}
					}else if(csem.equals("sem2"))
					{
						ArrayList<Courses> sem2=b.getSem2();
						for(Courses c:sem2)
						{
							System.out.print(c.course_Name+": ");
							System.out.println(c.m);
						}
					}
					else if(csem.equals("sem3"))
					{
						ArrayList<Courses> sem3=b.getSem3();
						for(Courses c:sem3)
						{
							System.out.print(c.course_Name+": ");
							System.out.println(c.m);
						}
					}else if(csem.equals("sem4"))
					{
						ArrayList<Courses> sem4=b.getSem4();
						for(Courses c:sem4)
						{
							System.out.print(c.course_Name+": ");
							System.out.println(c.m);
						}
					}
				}
			}
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public void cseMarks()
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
					if(st.getBranch().getBranchName().equals("CSE"))
					{
						System.out.println("The marks of "+st.getName()+":");
						Branch b=st.getBranch();
						String csem=st.getCurrentSem();
						System.out.println(csem);
						if(csem.equals("sem1"))
						{
							ArrayList<Courses> sem1=b.getSem1();
							for(Courses c:sem1)
							{
								System.out.print(c.course_Name+": ");
								System.out.println(c.m);
							}
						}else if(csem.equals("sem2"))
						{
							ArrayList<Courses> sem2=b.getSem2();
							for(Courses c:sem2)
							{
								System.out.print(c.course_Name+": ");
								System.out.println(c.m);
							}
						}
						else if(csem.equals("sem3"))
						{
							ArrayList<Courses> sem3=b.getSem3();
							for(Courses c:sem3)
							{
								System.out.print(c.course_Name+": ");
								System.out.println(c.m);
							}
						}else if(csem.equals("sem4"))
						{
							ArrayList<Courses> sem4=b.getSem4();
							for(Courses c:sem4)
							{
								System.out.print(c.course_Name+": ");
								System.out.println(c.m);
							}
						}
					}
			}
		}catch(Exception e)
		{
			e.printStackTrace();
		}

	}
	public void eceMarks()
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
					if(st.getBranch().getBranchName().equals("ECE"))
					{
						System.out.println("The marks of "+st.getName()+":");
						Branch b=st.getBranch();
						String csem=st.getCurrentSem();
						System.out.println(csem);
						if(csem.equals("sem1"))
						{
							ArrayList<Courses> sem1=b.getSem1();
							for(Courses c:sem1)
							{
								System.out.print(c.course_Name+": ");
								System.out.println(c.m);
							}
						}else if(csem.equals("sem2"))
						{
							ArrayList<Courses> sem2=b.getSem2();
							for(Courses c:sem2)
							{
								System.out.print(c.course_Name+": ");
								System.out.println(c.m);
							}
						}
						else if(csem.equals("sem3"))
						{
							ArrayList<Courses> sem3=b.getSem3();
							for(Courses c:sem3)
							{
								System.out.print(c.course_Name+": ");
								System.out.println(c.m);
							}
						}else if(csem.equals("sem4"))
						{
							ArrayList<Courses> sem4=b.getSem4();
							for(Courses c:sem4)
							{
								System.out.print(c.course_Name+": ");
								System.out.println(c.m);
							}
						}
					}
			}
		}catch(Exception e)
		{
			e.printStackTrace();
		}

	}
	public void eeeMarks()
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
					if(st.getBranch().getBranchName().equals("EEE"))
					{
						System.out.println("The marks of "+st.getName()+":");
						Branch b=st.getBranch();
						String csem=st.getCurrentSem();
						System.out.println(csem);
						if(csem.equals("sem1"))
						{
							ArrayList<Courses> sem1=b.getSem1();
							for(Courses c:sem1)
							{
								System.out.print(c.course_Name+": ");
								System.out.println(c.m);
							}
						}else if(csem.equals("sem2"))
						{
							ArrayList<Courses> sem2=b.getSem2();
							for(Courses c:sem2)
							{
								System.out.print(c.course_Name+": ");
								System.out.println(c.m);
							}
						}
						else if(csem.equals("sem3"))
						{
							ArrayList<Courses> sem3=b.getSem3();
							for(Courses c:sem3)
							{
								System.out.print(c.course_Name+": ");
								System.out.println(c.m);
							}
						}else if(csem.equals("sem4"))
						{
							ArrayList<Courses> sem4=b.getSem4();
							for(Courses c:sem4)
							{
								System.out.print(c.course_Name+": ");
								System.out.println(c.m);
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