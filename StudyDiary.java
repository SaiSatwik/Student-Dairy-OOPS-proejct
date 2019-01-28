import java.util.ArrayList;
import java.util.*;
import java.io.*;
public class StudyDiary {
	ArrayList<TechFest> techfest=new ArrayList<TechFest> ();
	ArrayList<CulturalEventTechFest> culturaltechfest=new ArrayList<CulturalEventTechFest> ();
	ArrayList<Student> students=new ArrayList<Student> ();
	ArrayList<StudentTechFest> std= new ArrayList<StudentTechFest> ();
	ArrayList<StudentCulturalEventDetails> std1= new ArrayList<StudentCulturalEventDetails> ();
	Scanner in=new Scanner(System.in); 
	File n=new File("details.txt");
	File f=new File("Student.txt");
	
	public void createData() {
		
		System.out.println("	1.Enter Student Details");
		System.out.println("	2.Enter TechFest Details");
		System.out.println("	3.Enter Cultural Event Details");
		int c=in.nextInt();
		if(c==1) {
			System.out.println("		1.Enter Students List");
			System.out.println("		2.Modify Students List");
			int c2=in.nextInt();
			if(c2==1) {
				inputStudentDetails();
				try {
					ArrayList<Object> details=new ArrayList<Object>();
					details.add(students);
					FileOutputStream dos=new FileOutputStream(n);
					ObjectOutputStream oos=new ObjectOutputStream(dos);
					oos.writeObject(details);
					oos.close();	
				}catch(Exception m) {
					m.printStackTrace();
				}
			}
			if(c2==2) {
				try {
					System.out.println("Enter Student Details: ");
					System.out.println("Enter Roll No: ");
					int r=in.nextInt();
					System.out.println("Enter Name: ");
					String na=in.next();
					System.out.println("Enter City: ");
					String ci=in.next();
					System.out.println("Enter Fathername: ");
					String f=in.next();
					System.out.println("Enter LocalGuardian: ");
					String l=in.next();
					System.out.println("Enter Branch: ");
					String b=in.next();
					System.out.println("Enter Current Sem: ");
					String s=in.next();
					
					ArrayList<Object> retriving=new ArrayList<Object>();
					FileInputStream dis=new FileInputStream("details.txt");
					ObjectInputStream ois=new ObjectInputStream(dis);
					retriving=(ArrayList<Object>)ois.readObject();
					ArrayList<Student> ss=(ArrayList<Student>)retriving.get(0);
					ss.add(new Student(r,na,ci,f,l,b,s));
					FileOutputStream dos=new FileOutputStream(n);
					ObjectOutputStream oos=new ObjectOutputStream(dos);
					oos.writeObject(retriving);
					oos.close();	
				}
				catch(Exception m) {
					m.printStackTrace();
				}
	
			}
		}
		if(c==2) {
			System.out.println("		1.Enter TechFest List");
			System.out.println("		2.Modify TechFest List");
			int c2=in.nextInt();
			if(c2==1) {
				inputTechDetails();
				try {
					ArrayList<Object> retriving=new ArrayList<Object>();
					FileInputStream dis=new FileInputStream("details.txt");
					ObjectInputStream ois=new ObjectInputStream(dis);
					retriving=(ArrayList<Object>)ois.readObject();
					//details.add(students);
					retriving.add(techfest);
					//details.add(culturaltechfest);
					FileOutputStream dos=new FileOutputStream(n);
					ObjectOutputStream oos=new ObjectOutputStream(dos);
					oos.writeObject(retriving);
					oos.close();	
				}catch(Exception m) {
					m.printStackTrace();
				}
			}
			if(c2==2) {
				try {
					System.out.println("Enter TechFest Details: ");
					System.out.println("Enter Event Name: ");
					String e=in.next();
					System.out.println("Enter Event Date: ");
					String d=in.next();
					ArrayList<Object> retriving=new ArrayList<Object>();
					FileInputStream dis=new FileInputStream("details.txt");
					ObjectInputStream ois=new ObjectInputStream(dis);
					retriving=(ArrayList<Object>)ois.readObject();
					ArrayList<TechFest> ss=(ArrayList<TechFest>)retriving.get(1);
					ss.add(new TechFest(e,d));
					FileOutputStream dos=new FileOutputStream(n);
					ObjectOutputStream oos=new ObjectOutputStream(dos);
					oos.writeObject(retriving);
					oos.close();		
				}
				catch(Exception m) {
					m.printStackTrace();
				}
				
				
			}
		}
		if(c==3) {
			System.out.println("		1.Enter TechFest List");
			System.out.println("		2.Modify TechFest List");
			int c2=in.nextInt();
			if(c2==1) {
					inputCulturalEventTechDetails();
					try {
						ArrayList<Object> retriving=new ArrayList<Object>();
						FileInputStream dis=new FileInputStream("details.txt");
						ObjectInputStream ois=new ObjectInputStream(dis);
						retriving=(ArrayList<Object>)ois.readObject();
						//details.add(students);
						//details.add(techfest);
						retriving.add(2,culturaltechfest);
						FileOutputStream dos=new FileOutputStream(n);
						ObjectOutputStream oos=new ObjectOutputStream(dos);
						oos.writeObject(retriving);
						oos.close();	
					}catch(Exception m) {
						m.printStackTrace();
					}
			}
			if(c2==2) {
				try {
					System.out.println("Enter CulturaEvent Details: ");
					System.out.println("Enter Event Name: ");
					String e=in.next();
					System.out.println("Enter Event Date: ");
					String d=in.next();
					ArrayList<Object> retriving=new ArrayList<Object>();
					FileInputStream dis=new FileInputStream("details.txt");
					ObjectInputStream ois=new ObjectInputStream(dis);
					retriving=(ArrayList<Object>)ois.readObject();
					ArrayList<CulturalEventTechFest> ss=(ArrayList<CulturalEventTechFest>)retriving.get(1);
					ss.add(new CulturalEventTechFest(e,d));
					FileOutputStream dos=new FileOutputStream(n);
					ObjectOutputStream oos=new ObjectOutputStream(dos);
					oos.writeObject(retriving);
					oos.close();		
				}
				catch(Exception m) {
					m.printStackTrace();
				}
			}
		}
		
	}
	private void inputStudentDetails() {
		System.out.println("Enter Student Details: ");
		System.out.println("Input number of Students: ");
		int n=in.nextInt();

		for(int i=0;i<n;i++) {
			System.out.println("Enter Roll No: ");
			int r=in.nextInt();
			System.out.println("Enter Name: ");
			String na=in.next();
			System.out.println("Enter City: ");
			String c=in.next();
			System.out.println("Enter Fathername: ");
			String f=in.next();
			System.out.println("Enter LocalGuardian: ");
			String l=in.next();
			System.out.println("Enter Branch: ");
			String b=in.next();
			System.out.println("Enter Current Sem: ");
			String s=in.next();
			students.add(new Student(r,na,c,f,l,b,s));
		}
		try
		{
			ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("Students.txt"));
			oos.writeObject(students);
			oos.close();
			
		}catch(Exception e)
		{
			System.out.println("error");
		}
	
	}
	
	private void inputCulturalEventTechDetails() {
		System.out.println("Enter CulturalEvent Details: ");
		System.out.println("Enter no of Events: ");
		int n=in.nextInt();
		for(int i=0;i<n;i++) {
			System.out.println("Enter Event Name: ");
			String e=in.next();
			System.out.println("Enter Event Date: ");
			String d=in.next();
			culturaltechfest.add(new CulturalEventTechFest(e,d));
		}
	
	}
	
	private void inputTechDetails() {
		System.out.println("Enter TechFest Details: ");
		System.out.println("Enter no of Events: ");
		int n=in.nextInt();
		for(int i=0;i<n;i++) {
			System.out.println("Enter Event Name: ");
			String e=in.next();
			System.out.println("Enter Event Date: ");
			String d=in.next();
			techfest.add(new TechFest(e,d));
		}
	}
	/*private void inputCulturalEventDetails() {
		culturaltechfest.add(new TechFest("Anokha","01-01-2017"));
		culturaltechfest.add(new TechFest("Python workshop","05-10-2017"));
	}*/
	//Serializing Objects
	//File k=new File("data.txt");
	ArrayList<Object> data=new ArrayList<Object>(); 
	public void saveData() {
		ArrayList<Object> retriving=new ArrayList<Object>();
		
		
		try {
			FileInputStream dis=new FileInputStream("details.txt");
			ObjectInputStream ois=new ObjectInputStream(dis);
			retriving=(ArrayList<Object>)ois.readObject();
			ois.close();
			dis.close();
			System.out.println("Enter Student RollNo: ");
			int r=in.nextInt();
			try {
			ArrayList<Student> ss=(ArrayList<Student>)retriving.get(0);
			Student s=(Student)ss.get(r-1);
			System.out.println("Enter "+s.getName()+" involved techFests: ") ;
			System.out.println("Enter no of techfests he involved: ");
			int n=in.nextInt();
			ArrayList<TechFest> sp=(ArrayList<TechFest>)retriving.get(1);
			TechFest[] tf=new TechFest[n];
			for(int i=0;i<n;i++) {
					System.out.println("Enter techFests numbers");
					int h=in.nextInt();	
					tf[i]=(TechFest)sp.get(h-1);
					System.out.println(tf[i]);
			}
			System.out.println("Enter "+s.getName()+" involved culturalFests: ") ;
			System.out.println("Enter no of culturalfests he involved: ");
			int c=in.nextInt();
			ArrayList<CulturalEventTechFest> csp=(ArrayList<CulturalEventTechFest>)retriving.get(2);
			CulturalEventTechFest[] cetf=new CulturalEventTechFest[c];
			for(int i=0;i<c;i++) {
					System.out.println("Enter culturalFests numbers");
					int h=in.nextInt();	
					cetf[i]=(CulturalEventTechFest)csp.get(h-1);
					System.out.println(cetf[i]);
			}
			File f=new File("data.txt");
			if(r==1) {
				data.add(new StudentTechFest(s,tf).getStd());
				data.add(new StudentTechFest(s,tf).getTechFest());
				data.add(new StudentCulturalEventDetails(s,cetf).getCulturalTechFest());
				FileOutputStream dos=new FileOutputStream("data.txt");
				ObjectOutputStream oos=new ObjectOutputStream(dos);
				oos.writeObject(data);
				oos.close();
			}
			else {
				ArrayList<Object> outdata=new ArrayList<Object>();
				FileInputStream dis2=new FileInputStream("data.txt");
				ObjectInputStream oos2=new ObjectInputStream(dis2);
				outdata=(ArrayList<Object>)oos2.readObject();
				outdata.add(new StudentTechFest(s,tf).getStd());
				outdata.add(new StudentTechFest(s,tf).getTechFest());
				outdata.add(new StudentCulturalEventDetails(s,cetf).getCulturalTechFest());
				dis2.close();
				oos2.close();
				FileOutputStream dos=new FileOutputStream("data.txt");
				ObjectOutputStream oos=new ObjectOutputStream(dos);
				oos.writeObject(outdata);
				oos.close();	
			}
	
			
			System.out.println("Serialiazable data is saved");
			}catch(ClassCastException o) {
				o.printStackTrace();
				return;
			}
			
		}
		catch(IOException j) {
			j.printStackTrace();
			return;
		}
		catch(Exception l) {
			l.printStackTrace();
			return;
		}
	}
	//Deserializing objects
	public void loadData() {
		ArrayList<Object> outdata=new ArrayList<Object>();
		
		try {
			FileInputStream dis=new FileInputStream("data.txt");
			ObjectInputStream oos=new ObjectInputStream(dis);
			outdata=(ArrayList<Object>)oos.readObject();
			oos.close();
			dis.close();
			
		}
		catch(IOException j) {
			j.printStackTrace();
			return;
		}
		catch(Exception l) {
			l.printStackTrace();
			return;
		}
		for(int i=0;i<outdata.size();i=i+3) {
			Student s=(Student)outdata.get(i);
			TechFest[] k=(TechFest[])outdata.get(i+1);
			CulturalEventTechFest[] m=(CulturalEventTechFest[])outdata.get(i+2);
			System.out.println(s);
			for(TechFest t:k)
					System.out.println(t);
			for(CulturalEventTechFest g:m) {
				System.out.println(g);
			}
		}
		
		}
}