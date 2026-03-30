import java.util.Scanner;

public class bai64ciaosoft {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập a : ");
        double a = sc.nextDouble();
        System.out.println("nhập b: ");
        double b = sc.nextDouble();
        if (a==0) {
         if (b==0) {
                System.out.println("phương trình vô số n ");
            }else {
                System.out.println("phương trình vô n ");
            }
        } else {
            double x = -b/a;
            System.out.println("phương trình có nghiệm = " + x);
        }
    }
}
