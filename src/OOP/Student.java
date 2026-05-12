package OOP;

import java.util.Scanner;

public class Student {
    //1. Fields | Proprties | Attributes: Mô tả đặc điểm của đối tượng
    //private + datatype + attName
    // Bổ từ truy cập private đảm bảo tính bao đóng của oop
    private String studentId;
    private String studentName;
    private int age;
    private boolean sex;
    private String address;
    private boolean status;
    //2. Constructors: Khởi tạo đối tượng từ lớp
    // Default Constructor: Không tham số
    public Student() {
    }
    // Constructor 2 tham số: khởi tạo mã sv và tên sv

    public Student(String studentName, String studentId) {
        // this: đại diện cho đối tượng đang làm việc
        this.studentName = studentName;
        this.studentId = studentId;
    }
    // Constructor đầy đủ tham số: khởi tạo tất cả thông tin

    public Student(String studentId, String studentName, int age, boolean sex, String address, boolean status) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.age = age;
        this.sex = sex;
        this.address = address;
        this.status = status;
    }

    public Student(String studentId, String studentName, int age) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.age = age;
    }

    //3. Method: Mô tả hành vi của đối tượng
    // Access modifier + return datatype + methodname(params)
    //3.1 Getter/Setter: public API cho phép truy câho các thyoosjc tính từ bên ngoiaf
    // -- Getter: ;ấy dữ liệu các thuộc tính
    // -- Setter: gán giá trị cho các thuộc tính

    public String getStudentId() {
//        if (studentId.equals("SV001") || studentId.equals("SV002") || studentId.equals("SV003")) {
//            return studentId;
//        }
//        return null;
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    //3.2 Behaviour methods: thể hiện hành vi của đối tượng
    // Phương thức có nhiều tham số
    public int addNumbers(int first, int second) {
        return first + second;
        //return: kết thúc phương thức và trả về nơi gọi nó
    }
    // Phương thức có 1 tham số
    protected void helloTeacher(String name) {
        System.out.println("Hello Teacher " + name);
    }
    public void inputData(Scanner scanner){
        System.out.println("Nhập vào mã sinh viên: ");
        this.studentId = scanner.nextLine();
        System.out.println("Nhập vào tên sinh viên: ");
        this.studentName = scanner.nextLine();
        System.out.println("Nhập vào tuổi: ");
        this.age = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập vào địa chỉ: ");
        this.address = scanner.nextLine();
        System.out.println("Nhập vào giới tính: ");
        this.sex = Boolean.parseBoolean(scanner.nextLine());
        System.out.println("Nhập vào trạng thái: ");
        this.status = Boolean.parseBoolean(scanner.nextLine());
    }

    // Phương thức kh có tham số
    public void displayData(){
        System.out.printf("Mã sv: %s - Tên sv: %s - Tuổi: %d - Giới tính: %s\n",
                this.studentId, this.studentName, this.age, this.sex ? "Nam" : "Nữ");

    }

}
