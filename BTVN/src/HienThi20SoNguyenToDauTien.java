import java.util.Scanner;

public class HienThi20SoNguyenToDauTien {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        System.out.println("Nhập vào 1 số: ");
//        int number = input.nextInt();
        int number = 2;
        int count = 0;
        while (count < 20) {
            boolean check = true;
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    check = false;
                    break;
                }
            }
            if (check) {
                System.out.print(number + " ");
                count++;
            }
            number++;
        }
    }
}

