import java.util.Scanner;

public class luyentap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("a :");
        double a = sc.nextDouble();
        System.out.println("b :");
        double b = sc.nextDouble();
        System.out.println("c :");
        double c = sc.nextDouble();
        double delta = (b * b) - (4 * a * c);
        if (delta < 0)
            System.out.println("phương trình vô nghiệm");
        else if (delta == 0) {
            double t = -b / (2 * a);
            System.out.println("phương trình có n kép t1=t2= " + t);
        } else {
            double t1 = (-b + Math.sqrt(delta)) / (2 * a);
            double t2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("phương trình có 2 n t1 = " + t1);
            System.out.println("phương trình có 2 n t2 = " + t2);
            if (t1 > 0) {
                System.out.println("x= " + Math.sqrt(t1));
                System.out.println("x = " + (-Math.sqrt(t1)));
            } else if (t1 == 0) {
                System.out.println("x = 0 ");
            }
                if (t2 > 0) {
                    System.out.println("x= " + Math.sqrt(t2));
                    System.out.println("x= " + (-Math.sqrt(t2)));
                }else if (t2 == 0) {
                System.out.println("x=0");
            }
        }
    }
}