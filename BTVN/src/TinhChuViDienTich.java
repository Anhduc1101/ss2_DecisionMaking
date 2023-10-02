import java.util.Scanner;

public class TinhChuViDienTich {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
//        while (true){
            System.out.println("---nhap lua chon:");
            System.out.println("1.hinh chu nhat");
            System.out.println("2.hinh tam giac");
            System.out.println("3.hinh tron");
            int option= sc.nextInt();
            switch (option){
                case 1:
                    System.out.println("tinh chu vi dien tich hcn");
                    System.out.println("nhap chieu dai cua hcn");
                    double a= sc.nextDouble();
                    System.out.println("nhap chieu rong cua hcn");
                    double b= sc.nextDouble();
                    if (a>0&&b>0){
                        System.out.println("chu vi hinh chu nhat: " +2*(a+b));
                        System.out.println("chu vi hinh chu nhat: " +a*b);
                    }else {
                        System.out.println("k phai hcn");
                    }
                    break;
                case 2:
                    System.out.println("tinh chu vi dien tich hinh tam giac");
                    System.out.println("nhap canh a cua tam giac");
                    double e=sc.nextDouble();
                    System.out.println("nhap canh b cua tam giac");
                    double g=sc.nextDouble();
                    System.out.println("nhap canh c cua tam giac");
                    double h= sc.nextDouble();
                    if (e>0&&g>0&&h>0){
                        if (e+g>h && e+h>g && g+h>e){
                            double p=(e+g+h)/2;
                            System.out.println("chu vi hinh tam giac la: " + p*2);
                            System.out.println("dien tich hinh tam giac la: " +Math.sqrt(p*(p-e)*(p-g)*(p-h)));
                        }else {
                            System.out.println("k phai tam giac");
                        }
                    }else {
                        System.out.println("k phai tam giac");
                    }
                    break;
                case 3:
                    System.out.println("tinh chu vi dien tich hinh tron");
                    System.out.println("nhap ban kinh cua hinh tron");
                    double r= sc.nextDouble();
                    double PI=3.14;
                    if (r>0){
                        System.out.println("chu vi hinh tron la: " +(2*PI*r));
                        System.out.println("dien tich hinh tron la: " +(PI*(r*r)));
                    }
                    break;
                case 4:
                    System.out.println("Bye");
                    System.exit(0);
                    break;
            }
        }
    }
//}
