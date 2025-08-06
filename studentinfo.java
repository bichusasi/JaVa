package java_lab;
 
class Stud{
    static int studentcount = 0;
    String name;

    
    Stud(String name) {
        this.name = name;
        studentcount++;
    }

   
    public static int getStudentCount() {
        return studentcount;
    }
}

public class studentinfo {
    public static void main(String[] args) {
        
        Stud student1 = new Stud("Alice");
        Stud student2 = new Stud("Bob");

        
        System.out.println("Total students: " + Stud.getStudentCount());
    }
}

