import java.util.ArrayList;
import java.util.Arrays;
import java.io.*;
public class StudentTechFest implements Serializable {
	private Student std;
	private TechFest[] techFest;

	public StudentTechFest(Student std, TechFest[] techFest) {
		this.std = std;
		this.techFest = techFest;
	}
	
	
	public String toString() {
		return "StudentTechFest [std=" + std + ", techFest=" + Arrays.toString(techFest) + "]";
	}


	public Student getStd() {
		return std;
	}
	public void setStd(Student std) {
		this.std = std;
	}
	public TechFest[] getTechFest() {
		return techFest;
	}
	public void setTechFest(TechFest[] techFest) {
		this.techFest = techFest;
	}
}