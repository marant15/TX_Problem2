package functions;

import java.util.ArrayList;
import java.util.List;

import models.Classroom;
import models.Student;

public class VerificationFunctions {
	
	/**
	 * Receive the list of students and the list of classes
	 * and retrieve the list of students in classes. 
	 * @param studentList List of Student type objects
	 * @param classroomList List of Class type objects
	 * @return studentFoundList List of Student type objects
	 */
	public static List<Student> studentsInClasses(List<Student> studentList, List<Classroom> classroomList){
		List<Student> studentFoundList = new ArrayList<Student>();
		for(Student student : studentList) {
			for(Classroom classroom : classroomList) {
				if(studentInClass(student, classroom)) {
					studentFoundList.add(student);
					break;
				}
			}
		}
		return studentFoundList;
	}

	private static boolean studentInClass(Student student, Classroom classroom) {
		double midLatitude = (student.getLatitude()+classroom.getLatitude())/2.0;
		double latitudeMetersPerDegree = 111132.954-559.822*Math.cos(2.0*midLatitude)+1.175*Math.cos(4.0*midLatitude);
		double longitudeMetersPerDegree = (3.14159265359/180)*6367449*Math.cos(midLatitude);
		double latitudeDistance = (student.getLatitude()-classroom.getLatitude())*latitudeMetersPerDegree;
		double longitudeDistance = (student.getLongitude()-classroom.getLongitude())*longitudeMetersPerDegree;
		if(Math.abs(longitudeDistance) <= 10 && Math.abs(latitudeDistance) <= 10)
			return true;
		else
			return false;
	}
	
}
