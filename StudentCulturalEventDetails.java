import java.util.ArrayList;
import java.util.Arrays;
import java.io.*;
public class StudentCulturalEventDetails implements Serializable {
	private Student std;
	private CulturalEventTechFest[] culturaltechFest;

	public StudentCulturalEventDetails(Student std, CulturalEventTechFest[] techFest) {
		this.std = std;
		this.culturaltechFest = techFest;
	}
	
	
	public String toString() {
		return "StudentCulturalEventDetails [std=" + std + ", techFest=" + Arrays.toString(culturaltechFest) + "]";
	}


	public Student getStd() {
		return std;
	}
	public void setStd(Student std) {
		this.std = std;
	}
	public CulturalEventTechFest[] getCulturalTechFest() {
		return culturaltechFest;
	}
	public void setCulturalTechFest(CulturalEventTechFest[] techFest) {
		this.culturaltechFest = techFest;
	}
}