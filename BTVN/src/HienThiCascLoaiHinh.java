import java.util.Scanner;

public class HienThiCascLoaiHinh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("==Menu==");
        System.out.println("1. Hình chữ nhật");
        System.out.println("2. Hình tam giác vuông góc dưới bên trái");
        System.out.println("3. Hình tam giác vuông góc trên bên trái");
        System.out.println("4. Hình tam giác vuông góc trên bên phải");
        System.out.println("5. Hình tam giác vuông góc dưới bên phải");
        System.out.println("0. Dừng vòng lặp");
        System.out.println("Nhập vào lựa chọn của bạn:");
        int choice = sc.nextInt();
        int a, b;
        switch (choice) {
            case 1:
                System.out.println("Nhập vào số dòng a:");
                a = sc.nextInt();
                System.out.println("Nhập vào số cột b:");
                b = sc.nextInt();
//                if (a < b) {
                for (int i = 0; i < a; i++) {
                    for (int j = 0; j < b; j++) {
                        System.out.print(" * ");
                    }
                    System.out.println("");
                }
//                } else {
//                    System.out.println("Chiều dài không được nhỏ hơn chiều rộng!");
//                }
                break;
            case 2:
                System.out.println("Hình tam giác vuông góc dưới bên trái");
                System.out.println("Nhập vào chiều cao h:");
                a = sc.nextInt();
                for (int i = 0; i < a; i++) {
                    for (int j = 0; j <= i; j++) {
                        System.out.print(" * ");
                    }
                    System.out.println("");
                }
                break;
            case 3:
                System.out.println("Hình tam giác vuông góc trên bên trái");
                System.out.println("Nhập vào chiều cao h:");
                a = sc.nextInt();
                for (int i = 0; i < a; i++) {
                    for (int j = 0; j < a - i; j++) {
                        System.out.print(" * ");
                    }
                    System.out.println("");
                }
                break;
            case 4:
                System.out.println("Hình tam giác vuông góc trên bên phải");
                System.out.println("Nhập vào chiều cao h:");
                a = sc.nextInt();
                for (int i = a; i >=0; i--) {
                    for (int j = 0; j < a - i; j++) {
                        System.out.print("   ");
                    }
                    for (int k = 0; k <= i; k++) {
                        System.out.print(" * ");
                    }
                    System.out.println("");
                }
                break;
            case 5:
                System.out.println("Hình tam giác vuông góc dưới bên phải");
                System.out.println("Nhập vào chiều cao h:");
                a = sc.nextInt();
                for (int i = 0; i < a; i++) {
                    for (int j = 0; j < a - i; j++) {
                        System.out.print("   ");
                    }
                    for (int k = 0; k <= i; k++) {
                        System.out.print(" * ");
                    }
                    System.out.println("");
                }
                break;
            case 0:
                System.out.println("Kết thúc chương trình.");
                break;
            default:
                System.out.println("Lựa chọn không hợp lệ.");
                break;
        }
    }
}