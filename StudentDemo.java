package java_lab;
class Student{
	int rollno;
	String name;
	int m1,m2,m3;
	float avg;
	Student(int rollno, String name, int m1, int m2, int m3){
		this.rollno = rollno;
		this.name = name;
		this.m1 = m1;
		this.m2 = m2;
		this.m3 = m3;
		
	}
	public void calculateaverage() {
		avg = (m1+m2+m3)/3;	
	}
	public void displaydetails() {
		System.out.println("Name :" +name);
		System.out.println("Roll Number :" +rollno);
		System.out.println("Mark 1:"+m1 +" Mark 2:"+m2 +" Mark 3:" +m3);
		System.out.println("Average :" +avg);
	
	}
}

public class StudentDemo {
	public static void main(String[] args) {
		Student student = new Student(22,"Anand",25,36,47);
		student.calculateaverage();
		student.displaydetails();
		Student student1 = new Student(26,"Anugrah",34,45,56);
		student1.calculateaverage();
		student1.displaydetails();
	}

}
