import java.util.Scanner;

public class bai65ciaosoft {
    // delta = b^2-4ac , delta <0 vo n, delta = 0 n kep, delta >0 co 2 n
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ta có phương trình ax^2+bx+c = 0");
        System.out.println("nhập a= ");
        double a = sc.nextDouble();
        System.out.println("nhập b= ");
        double b = sc.nextDouble();
        System.out.println("nhập c= ");
        double c = sc.nextDouble();
        if(a==0) {
            if (b==0){
                if (c==0){
                    System.out.println("phương trình vô số n");
                }else {
                    System.out.println("phương trình vô n ");
                }
            }else {
                double x = -c/b;
                System.out.println("phương trình có n ");
            }
        }else {
            double delta = (b*b)-(4*a*c);
            if (delta<0){
                System.out.println("phương trình vô n");
            }else if (delta==0){
                System.out.println("phương trình có n kép x1=x2= " + (-b)/(2*a));
            }else {
                double x1= ((-b)+Math.sqrt(delta))/(2*a);
                double x2= ((-b)-Math.sqrt(delta))/(2*a);
                System.out.println("phương trình có n x1 = " + x1);
                System.out.println("phương trình có n x2 = " + x2);
            }
        }
    }
}
