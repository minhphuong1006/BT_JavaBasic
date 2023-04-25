package BT2_Method_DataType;

public class Calculator {
    // Ham tinh tong 2 so nguyen
    public int tong2songuyen(int a , int b){
        return (a + b);
    }
    //Ham tinh tich 2 so thuc
    public double tich2sothuc(double  c, double  d)
    {
        return (c*d);
    }
    public static void main(String[] args) {
        Calculator obj = new Calculator();
        int tong = obj.tong2songuyen(10,20);
        System.out.println("Tổng 2 số nguyên a,b: " + tong);

        double tich = obj.tich2sothuc(3.2, 6.6);
        System.out.println("Tích 2 số thuc c,d:" + tich);


    }
}

// BÀI TẬP PHẦN METHOD (PHƯƠNG THỨC) VÀ DATA TYPE (KIỂU DỮ LIỆU)
// *** Tại class Calculator:
// - Tạo hàm tính tổng 2 số nguyên
// - Tạo hàm tính tích 2 số thực
// *** Gọi lại 2 hàm trên và truyền tham số vào dưới hàm main để chạy
