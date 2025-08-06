//Use of staic variables and methods

package lab1;

class Student{
	String name;
	static int studentCount=0;
	Student(String name){
		this.name=name;
		studentCount++;
	}
	public static int getStudentCount(){
		return studentCount;
}
}

public class Main {
	public static void main(String[] args) {
         Student s1=new Student("Annu");
         System.out.println(Student.getStudentCount());
         Student s2=new Student("Sona");
         System.out.println(Student.getStudentCount());
         Student s3=new Student("Rahul"); 
         System.out.println(Student.getStudentCount());
    }
}
