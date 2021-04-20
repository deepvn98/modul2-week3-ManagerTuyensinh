import java.util.ArrayList;
import java.util.Scanner;

public class Runner {
    private static final ExamBlock khoiA = new ExamBlock("KhốiA","Toán","Lý","Hoá");
    private static final ExamBlock khoiB = new ExamBlock("KhốiB","Sinh","Toán","Hoá");
    private static final ExamBlock khoiC = new ExamBlock("KhốiC","Văn","Sử","Địa");
    private static ArrayList<Student> students = new ArrayList<>();
    private static TSManager manager = new TSManager();

    public static void main(String[] args) {
        Student student1 = new Student("01","A" ,"Hà Nội","0");
        student1.setElement(khoiA);
        students.add(student1);
        manager.setStudents(students);
        addSinhVien();
        manager.showInforSV();
        searchSV();
    }
//Thêm sinh viên
    public static void addSinhVien(){
        System.out.println("Nhập ID: ");
        Scanner scanner = new Scanner(System.in);
        String id = scanner.nextLine();
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Nhập Name: ");
        String name = scanner1.nextLine();
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Nhập Address: ");
        String address = scanner2.nextLine();
        Scanner scanner3 = new Scanner(System.in);
        System.out.println("Nhập Prioritize: ");
        String Prioritize = scanner3.nextLine();
        Student student =new Student(id,name,address,Prioritize,null);
        Scanner scanner4 = new Scanner(System.in);
        System.out.println("Nhập ExamBlock: ");
        String ExamBlock = scanner4.nextLine();
        switch (ExamBlock){
            case "A":
                student.setElement(khoiA);
                break;
            case "B":
                student.setElement(khoiB);
                break;
            case "C":
                student.setElement(khoiC);
                break;
            default:
                break;
        }
        manager.addSV(student);
    }
//Tìm kiếm sinh viên
    public static void searchSV(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập ID Tìm kiếm: ");
        String id = scanner.nextLine();
        int check = checkSV(id,students);
        if (check==-1){
            System.out.println("không có trong danh sách!");
        }else {
            System.out.println("Thông tin của ssinh viên là : "+ check);
        }
    }
//Xây dựng tìm kiếm tính tuyến
    public static int checkSV(String id,ArrayList<Student>students){
        for (int i = 0; i < students.size();i++ ){
            if (students.get(i).getId().equals(id)){
                System.out.println(students.get(i).toString());
            }
        }return -1;
    }
}
