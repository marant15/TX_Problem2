package functionsTests;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import functions.VerificationFunctions;
import models.Classroom;
import models.Student;

public class VerificationFunctionTest {
	@Test
	public void testExample1() {
		List<Student> studentList = new ArrayList<Student>();
		List<Classroom> classroomList = new ArrayList<Classroom>();
		Student john_student = new Student("John Wilson", 34.069149, -118.442639);
		Student jane_student = new Student("Jane Graham", 34.069601, -118.441862);
		Student pam_student = new Student("Pam Bam", 34.071513, -118.441181);
		classroomList.add(new Classroom("Principles of computational geo-location analysis", 34.069140, -118.442689));
		classroomList.add(new Classroom("Sedimentary Petrology", 34.069585, -118.441878));
		classroomList.add(new Classroom("Introductory Psychobiology", 34.069742, -118.441312));
		classroomList.add(new Classroom("Art of Listening", 34.070223, -118.440193));
		classroomList.add(new Classroom("Art Hitory", 34.071528, -118.441211));
		studentList.add(john_student);
		studentList.add(jane_student);
		studentList.add(pam_student);
		List<Student> studentFoundList = VerificationFunctions.studentsInClasses(studentList, classroomList);
		List<Student> expectedStudentFoundList = new ArrayList<Student>();
		expectedStudentFoundList.add(john_student);
		expectedStudentFoundList.add(jane_student);
		expectedStudentFoundList.add(pam_student);
		assertEquals(studentFoundList,expectedStudentFoundList);
	}
	
	@Test
	public void testExample2() {
		List<Student> studentList = new ArrayList<Student>();
		List<Classroom> classroomList = new ArrayList<Classroom>();
		Student john_student = new Student("John Wilson", 34.069849, -118.443539);
		Student jane_student = new Student("Jane Graham", 34.069901, -118.441562);
		Student pam_student = new Student("Pam Bam", 34.071523, -118.441171);
		classroomList.add(new Classroom("Principles of computational geo-location analysis", 34.069140, -118.442689));
		classroomList.add(new Classroom("Sedimentary Petrology", 34.069585, -118.441878));
		classroomList.add(new Classroom("Introductory Psychobiology", 34.069742, -118.441312));
		classroomList.add(new Classroom("Art of Listening", 34.070223, -118.440193));
		classroomList.add(new Classroom("Art Hitory", 34.071528, -118.441211));
		studentList.add(john_student);
		studentList.add(jane_student);
		studentList.add(pam_student);
		List<Student> studentFoundList = VerificationFunctions.studentsInClasses(studentList, classroomList);
		List<Student> expectedStudentFoundList = new ArrayList<Student>();
		expectedStudentFoundList.add(pam_student);
		assertEquals(studentFoundList,expectedStudentFoundList);
	}
	
	@Test
	public void testAllStudentsOutOfClasses() {
		List<Student> studentList = new ArrayList<Student>();
		List<Classroom> classroomList = new ArrayList<Classroom>();
		Student john_student = new Student("John Wilson", 34.069849, -118.443539);
		Student jane_student = new Student("Jane Graham", 34.069901, -118.441562);
		Student pam_student = new Student("Pam Bam", 34.071633, -118.441171);
		classroomList.add(new Classroom("Principles of computational geo-location analysis", 34.069140, -118.442689));
		classroomList.add(new Classroom("Sedimentary Petrology", 34.069585, -118.441878));
		classroomList.add(new Classroom("Introductory Psychobiology", 34.069742, -118.441312));
		classroomList.add(new Classroom("Art of Listening", 34.070223, -118.440193));
		classroomList.add(new Classroom("Art Hitory", 34.071528, -118.441211));
		studentList.add(john_student);
		studentList.add(jane_student);
		studentList.add(pam_student);
		List<Student> studentFoundList = VerificationFunctions.studentsInClasses(studentList, classroomList);
		List<Student> expectedStudentFoundList = new ArrayList<Student>();
		assertEquals(studentFoundList,expectedStudentFoundList);
	}
}
