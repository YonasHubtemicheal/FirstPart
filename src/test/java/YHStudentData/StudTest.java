package YHStudentData;

import static org.junit.Assert.*;

import org.joda.time.LocalDate;
import org.junit.Test;

public class StudTest {
	
	LocalDate dob1 = new LocalDate(1997, 6, 17);
	Student stud = new Student("Paul", "Shane", dob1, 14101213);

	@Test
	public void test() {
		assertEquals("PaulShane20", stud.getUsername());
	}

}
