package BT4For_Mang;

public class BTFor_Mang {
    public static void main(String[] args) {

        //Khai báo và khởi tạo mảng để lưu các số chẵn vào mảng
        int sochan[] = new int[30];
        int index = 0; // biến để gán vị trí cho mảng

        //- Tạo vòng lặp FOR để in ra các số chẵn từ 0 đến 50
        System.out.println("Các số chẵn trong dãy từ 0 đến 50 là:");
        for (int i = 0; i <= 50; i++) {
            //Kiểm tra số chẵn
            if (i % 2 == 0) {
                System.out.print(i + " "); // In ra các số chẵn
                sochan[index]= i; //- lưu những số chẵn vào mảng
                index ++;  // Tăng biến đếm số phần tử trong mảng
            }
        }
        //- Duyệt mảng để in ra kết quả sau khi nạp vào mảng
        System.out.println("\n"+ "Duyệt mảng in ra kết quả của mảng lưu trước đó: ");
        for (int i : sochan) {
            System.out.println(i); // In ra các số chẵn trong mảng
        }
    }

}

//    BÀI TẬP PHẦN VÒNG LẶP FOR VÀ MẢNG
//- Tạo vòng lặp FOR để in ra các số chẵn từ 0 đến 50
//- Tạo mảng để lưu những số chẵn đó vào
//- Duyệt mảng để in ra kết quả sau khi nạp vào
