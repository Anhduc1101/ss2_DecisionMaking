import java.util.Scanner;

public class HienThiSoNguyenToNhoHon100 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào 1 số lớn hơn 2 và nhỏ hơn 100:");
        int number = sc.nextInt();

        // Biến để lưu trữ các số nguyên tố
        String primeNumbers = "";

        for (int i = 2; i <= number; i++) {
            boolean isPrime = true;

            // Kiểm tra số nguyên tố
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }

            // Nếu là số nguyên tố, thêm vào biến primeNumbers
            if (isPrime) {
                primeNumbers += i + " ";

            }
        }

        // In các số nguyên tố trên cùng một dòng
        System.out.println("Các số nguyên tố nhỏ hơn 100 là: " + primeNumbers);
    }
}