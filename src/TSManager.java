import java.util.ArrayList;
import java.util.Scanner;

public class TSManager{
   private ArrayList<Student> students;

    public ArrayList<Student> getStudents() {
        return students;
    }

    public TSManager() {
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    public TSManager(ArrayList<Student> students) {
        this.students = students;
    }
    public void addSV(Student student){
        students.add(student);
    }
    public void showInforSV(){
        for (Student student:students) {
            System.out.println(student.toString());
        }
    }


}
