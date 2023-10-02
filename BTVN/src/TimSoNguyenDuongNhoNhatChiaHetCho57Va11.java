import java.util.Scanner;

public class TimSoNguyenDuongNhoNhatChiaHetCho57Va11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        Bước 1: Khai báo biến N là giá trị bắt đầu kiểm tra ,có giá trị là 1.
        int N = 1;
//int count=0;
//        Bước 2: Sử dụng vòng lặp while để bắt đầu lặp .
        while (true) {
            //        Kiểm tra giá trị N hiện tại có chia hết cho 5,7 và 11 hay không.
            if (N % 5 == 0 && N % 7 == 0 & N % 11 == 0) {
                //        Nếu đúng đó chính là giá trị cần tìm và dừng vòng lặp.
                System.out.println(N + " chia hết cho cả 5, 7 và 11");
                break;
            }
            //        Nếu sai thì tăng giá trị N thêm 1 và tiến hành kiểm tra lại.
            N++;
        }
//        Bước 3: Kết thúc vòng lặp , hiển thị số tìm được ra màn hình.
    }
}
