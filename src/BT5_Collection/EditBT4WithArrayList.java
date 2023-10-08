package BT5_Collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EditBT4WithArrayList {

    // Tạo hàm riêng để thêm thông tin cơ bản của một nhân viên vào collection đã học phù hợp

    public static Map<String,String> NhanVienInfor ()
    {
        //Khai báo và khởi tạo đối tượng nhân viên
        Map<String, String> arrNhanvien = new HashMap<>();
        arrNhanvien.put("Mã sv","35837");
        arrNhanvien.put("Tên"," Minh Phương");
        arrNhanvien.put("Năm sinh","1995");
        arrNhanvien.put("Công Việc","QC");
        arrNhanvien.put("Kinh Nghiệm","3 năm");
        arrNhanvien.put("Quê quán", "Bình Định");
        arrNhanvien.put("Địa chỉ hiện tại"," Bình Định ");
        return arrNhanvien;
    }
    public static void main(String[] args) {
        //Chỉnh sửa bài tập Java Basic 4 với ArrayList
        //Khai báo và khởi tạo mảng
        ArrayList<Integer> arrsochan = new ArrayList<Integer>();

        //- Tạo vòng lặp FOR để in ra các số chẵn từ 0 đến 50
        System.out.println("Các số chẵn trong dãy trên:");
        for (int i = 0; i <= 50 ; i++) {
            //Kiểm tra số chẵn
            if (i % 2 == 0)
            {
                System.out.println(i); // In mang ra
                arrsochan.add(i); //- lưu những số chẵn vào mảng
            }

        }
        //- Duyệt mảng để in ra kết quả sau khi nạp vào mảng
        System.out.println("Duyệt mảng in ra kết quả của arrsochan lưu trước đó");
        for (int i : arrsochan) {
            System.out.print(i+ ", ");
        }

        System.out.println();
        //- Trong hàm main gọi lại hàm trên để in ra thông tin nhân viên đó với vòng lặp for CƠ BẢN
       //NhanVienInfor();
        List<String> arrNhanvien = new ArrayList();
        arrNhanvien.add(NhanVienInfor().toString());
        for (int i = 0; i <arrNhanvien.size() ; i++)
            System.out.println(arrNhanvien.get(i));



    }
}

//BT5 : BÀI TẬP PHẦN COLLECTION KẾT HỢP TẠO HÀM RIÊNG
//        - Chỉnh sửa bài tập Java Basic 4 với ArrayList
//        - Tạo hàm riêng để thêm thông tin cơ bản của một nhân viên vào collection đã học phù hợp
//        - Trong hàm main gọi lại hàm trên để in ra thông tin nhân viên đó với vòng lặp for CƠ BẢN
