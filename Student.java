import java.io.Serializable;

public class Student implements Serializable {
	private int rollNo;
	private String name;
	private String address;
	private String father;
	private String localGuardian;
	private Branch branch;
	private String currentSem;
	
	
	public Student() {
		this.rollNo = 0;
		this.name = null;
		this.address = null;
		this.father = null;
		this.localGuardian = null;
		this.currentSem=null;
	}

	public Student(int rollNo, String name, String address, String father, String localGuardian,String branch,String sem) {

		this.rollNo = rollNo;
		this.name = name;
		this.address = address;
		this.father = father;
		this.localGuardian = localGuardian;
		this.branch=new Branch(branch);
		this.currentSem=sem;

	}


	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", address=" + address + ", father=" + father
				+ ", localGuardian=" + localGuardian + ", branch=" + branch + ", currentSem=" + currentSem + "]";
	}

	public int getRollNo() {
		return rollNo;
	}
	
	public String getCurrentSem() {
		return currentSem;
	}
	public void setCurrentSem(String sem) {
		this.currentSem = sem;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}
	
	public Branch getBranch() {
		return branch;
	}
	
	public void setBranch(Branch branch) {
		this.branch = branch;
	}

	

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getFather() {
		return father;
	}

	public void setFather(String father) {
		this.father = father;
	}

	public String getLocalGuardian() {
		return localGuardian;
	}

	public void setLocalGuardian(String localGuardian) {
		this.localGuardian = localGuardian;
	}
}