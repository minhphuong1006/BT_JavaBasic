package BT3_ToanTu_DieuKienIFELSE;

public class OnTap
{
    static int a = 3;
    static int b = a+2;
    static  int c = a;
    static String d = "Tổng";

    //Toán tử quan he
    public  static  void toantuquanhe()
    {
        //so sanh bang
        System.out.println("A có bằng B không: " + (a==b));
        //so sanh khac
        System.out.println("A có khác B không: " + (a!=b));
        //Lớn hon
        System.out.println("A lớn hơn B: " + (a>b));
        //Nhỏ hon
        System.out.println("A nhỏ hơn B: " + (a<b));
        //Lớn hơn hoặc bằng
        System.out.println("A lớn hơn hoặc = B: " + (a>=b));
        //Nhỏ hơn hoặc bằng
        System.out.println("A nhỏ hơn hoặc = C: " + (a<=c));
    }

    //Toán tử logic
    public  static  void toantulogic()
    {

        //Toán tử và (AND)
        System.out.println("A = B và D = Tổng: " + ((a==b)&& d.equals("Tổng")));
        //Toán tử hoặc (OR)
        System.out.println("A khác B hoặc D = Hieu: " + ((a!=c) || d=="Tổng"));
        //Toán tử phủ định (NOT)
        System.out.println("A lớn hơn B: " + (!(a<b)));
        //Toan tu có điều kiện
        System.out.println((a > b ) ? "A lớn hơn B" : "A nhỏ hơn B");
        //Toán tử gán
        int d, f ;
        d=f = a;
        System.out.println("D:" + d + " F:" + f);

    }
    public void kiemtradieukien(int n) {
        int number = 100;
        if (n == number) {
            System.out.println("N và number hai số bằng nhau"); //TH1:  n == number
        } else if (n < number) {
            System.out.println("N=" + n + " nhỏ hơn " + number); // TH2:  n < number
        } else System.out.println("N=" + n  + " lớn hơn " + number); // TH3:  n > number
    }

    public static void main(String[] args) {
        System.out.println("A:" + a + " - B:" + b + " - C:" + c + " - D:" + d);
        OnTap obj = new OnTap();
        toantuquanhe();
        toantulogic();
        obj.kiemtradieukien(120);
    }
}

//BÀI TẬP PHẦN TOÁN TỬ VÀ ĐIỀU KIỆN IF ELSE

//- Tạo class ôn tập các loại toán tử: quan hệ, logic
//- Tạo ra ít nhất 3 biến bất kỳ lưu giá trị trong class đó
//- Thực hiện các loại toán tử trên các biến trên: &&, ||, >, <, ==
//
//- Tạo biến cố định number = 100
//- Tạo hàm truyền tham số int ""n"" và Dùng câu lệnh IF Else để đặt điều kiện cho tham số n truyền vào đó:
//  + TH1:  n == number
//  + TH2:  n < number
//  + TH3:  n > number
//- Gọi lại hàm trên xuống main để truyền giá trị vào và chạy hàm để kiểm tra
