package org.tnsif.acc.c2tc.oops;

//parent class
class Course{
	String courseName="Java Programming";//Instance Variable
	void showCourse() {
		System.out.println("Courese :"+courseName);
	}
}
//sub class
class Student extends Course{  
	String Name="Shubda";
	void showStudent() {
		System.out.println("Student :"+Name);
	}
}

public class SingleLevelInheritanceDemo {

	public static void main(String[] args) {
		Student student=new Student();
		student.showCourse();
		student.showStudent();

	}

}
