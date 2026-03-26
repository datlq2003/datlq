import java.util.Scanner;

public class bai64 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập a : ");
        double a = sc.nextDouble();
        System.out.println("nhập b: ");
        double b = sc.nextDouble();
        double x = -b/a;
        if (a==0)
            System.out.println("phương trình vô số n ");
        else if (b!=0) {
            System.out.println("phương trình vô n");
        }
        else {
            System.out.println("phương trình có nghiệm = " + x);
        }
    }
}
