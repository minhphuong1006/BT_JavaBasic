package BT1_Variables;

//Class SinhVien: khai báo 3 loại biến (local, instance, static)
public class SinhVien {
    //Biến instance toàn cục
    public String place = "Nhơn An, An Nhơn, Bình Định";
    //Biến static
    public static int age = 28;
    public static String birthday="10/06/1995";
    public static void infor(){
        String name = "Trần Thị Minh Phương"; //Biến local cục bộ
        System.out.println("Họ & Tên: " + name);
        System.out.println("Sinh ngày: " + birthday);
        System.out.println("Tuổi: " + age);
    }
    public void Femalegender() {
        boolean Femalegender = true; //Biến local cục bộ
        if (Femalegender){
            System.out.println("Giới tính: Nữ");
        }
        else
            System.out.println("Giới tính:Nam");
    }
    public void inforplace(){
        System.out.println("Nơi ở: " + place);
    }

    public static void main(String[] args) {

        //gọi lại thông tin ở hàm main
        SinhVien sv = new SinhVien();
        infor();
        sv.Femalegender();
        sv.inforplace();
        //Class ThongTin: gọi lại ở class SinhVien và in ra thông tin
        System.out.println("Nghề nghiệp: " + ThongTin.job);
        System.out.println("Số năm kinh nghiệm: " + ThongTin.Experience);

    }
}
//BÀI TẬP JAVABASIC 1
//- Tạo project mới dành cho bài tập
//- Tạo class: SinhVien, ThongTin
//- Class SinhVien: khai báo 3 loại biến (local, instance, static) gọi lại in ra ở 3 hàm trong class sau đó gọi nó ở hàm main
//- Class ThongTin: khai báo các biến static để gọi lại ở class SinhVien và in ra thông tin