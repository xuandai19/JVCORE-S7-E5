package OOP;

import java.util.Scanner;

public class StudentManagement {
    public static void main(String[] args) {
        //ClassName objectName = new Constructor
        Student student1 = new Student();
        Student student2 = new Student("SV002", "Hà Xuân Đại");
        Student student3 = new Student("SV003","Ha Dai", 20, false, "HN", true);
        //khởi tạo đối tượng sv 4 và khởi tạo mã, tên, tuổi
        Student student4 = new Student("SV004", "Tran Linh", 21);
        //Nhập thông tin cho sv1
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập thông tin SINH VIÊN 1");
        student1.inputData(sc);
        // Nhập thông tin cho sv2: tuổi, địa chỉ, giới tính và trạng thái
        // - sử dụng phương thức setter
        System.out.println("***** THÔNG TIN SINH VIÊN 2 *****");
        System.out.println("Nhập vào tuổi sinh viên 2: ");
        student2.setAge(Integer.parseInt(sc.nextLine()));
        System.out.println("Nhập vào địa chỉ sinh viên 2: ");
        student2.setAddress(sc.nextLine());
        // Tính tuổi tb của 3 sv 1, 2, 3
        // sử dụng phương thức getter lấy trị tuổi của 3 sinh viên
        int avgAge = (student1.getAge() + student2.getAge() + student3.getAge()) /3 ;


        //truy cập phương thức của đối tượng: objectName.methodName(args)
        System.out.println("***** THÔNG TIN SINH VIÊN 1 *****");
        student1.displayData();
        System.out.println("***** THÔNG TIN SINH VIÊN 2 *****");
        student2.displayData();
        System.out.println("***** THÔNG TIN SINH VIÊN 3 *****");
        student3.displayData();
        System.out.println("***** THÔNG TIN SINH VIÊN 4 *****");
        student4.displayData();
    }
}
