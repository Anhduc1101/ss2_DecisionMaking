import java.util.Scanner;

public class TinhTongCacSoChanTrongKhoangChoTruoc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        Bước 1: Khai báo 2 biến giá trị đầu và giá trị cuối cho phép người dùng nhập vào từ bàn phím
//        và 1 biến để tính tổng các số chẵn trong khoảng vừa nhập(giá trị tổng mặc định ban đầu là 0).
        System.out.println("Nhập vào số đầu: ");
        int soDau = sc.nextInt();
        System.out.println("Nhập vào số cuối: ");
        int soCuoi = sc.nextInt();
        int tong = 0;
//        Bước 2: Sử dụng vòng lặp for i để tìm ra các số chẵn nằm trong khoảng người dùng vừa nhập
//         và thực hiện tính tổng các số tìm được.
        if(soDau<soCuoi){
        for (int i = soDau; i <= soCuoi; i++) {
            if (i % 2 == 0) {
                tong += i;
            }
        }
//        Bước 3: Kết thúc vòng lặp hiển thị tổng ra màn hình và đối chiếu :
                System.out.println("Tổng các số chẵn là: "+tong);
        }
        System.out.println("Số đầu phải bé hơn số cuối");
    }
}
