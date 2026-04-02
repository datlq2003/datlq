import java.util.Scanner;

public class bai63ciaosoft {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap a: ");
        int a = sc.nextInt();
        System.out.print("Nhap b: ");
        int b = sc.nextInt();
        int x = a, y = b;
        while (y != 0) {
            int r = x % y;
            x = y;
            y = r;
        }
        int ucln = x;
        int bcnn = (a * b) / ucln;
        System.out.println("BCNN = " + bcnn);
    }
}
