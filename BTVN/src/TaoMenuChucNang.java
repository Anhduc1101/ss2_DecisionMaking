import java.util.Scanner;

public class TaoMenuChucNang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("--- Menu ---");
        System.out.println("0. Exit");
        System.out.println("1. Kiểm tra tính chẵn lẻ");
        System.out.println("2. Kiểm tra số nguyên tố");
        System.out.println("3. Kiểm tra số chia hết cho 3");
        System.out.println("Mời lựa chọn:");
//        int number= sc.nextInt();
        int choice = sc.nextInt();
        switch (choice) {
            case 0:
                System.exit(0);
                break;
            case 1:
                System.out.println("Nhập vào 1 số:");
                int number1 = sc.nextInt();
                if (number1 % 2 == 0) {
                    System.out.println(number1 + " là số chẵn");
                } else {
                    System.out.println(number1 + " là số lẻ");
                }
                break;
            case 2:
                System.out.println("Nhập vào 1 số từ 2 trở lên:");
                int number2 = sc.nextInt();
                if (number2 < 2) {
                    System.out.println("Nhập không đúng yêu cầu");
                } else {
                    boolean check = true;
                    for (int i = 2; i < number2; i++) {
                        if (number2 % i == 0) {
                            System.out.println(number2 + " không là số nguyên tố");
                            check = false;
                            break;
                        }
                    }
                    if (check) {
                        System.out.println(number2 + " là số nguyên tố");
                    }
                }
                break;
            case 3:
                System.out.println("Nhập vào 1 số:");
                int number3 = sc.nextInt();
                if (number3 % 3 == 0) {
                    System.out.println(number3 + " chia hết cho 3");
                } else {
                    System.out.println(number3 + " không chia hết cho 3");
                }
                break;
            default:
                System.out.println("Bạn chưa chọn gì");
        }
    }
}
