package net.javaguides.hibernate;

import net.javaguides.hibernate.dao.IStudentDao;
import net.javaguides.hibernate.dao.StudentDao;
import net.javaguides.hibernate.model.Student;

public class App {

	public static void main(String []args) {
		
		IStudentDao sd = new StudentDao();
		
		//test saveStudent
		Student student = new Student("ujina","parajuli","uj@hgf12.com");
		sd.saveStudent(student);
		
		Student student2 = new Student("jhjg","kharel","hfhgh12@gmail.com");
		sd.saveStudent(student2);
		
		Student st = new Student("ujina","hjhhj","kjh@gmail.com");
		sd.saveStudent(st);
		
		//test update student
		student.setFirstName("manu");
		sd.updateStudent(student);
		
		// getStudentById
		Student student3 = sd.getStudentById(student.getId());
		
		//getAllStudents
//		List<Student> students = sd.getAllStudents();
//		students.forEach(student1 -> System.out.println(student1.getId()));
		
		//deleteStudent
		sd.deleteStudent(student.getId());
	}
}
