import java.util.Scanner;

public class baitap1 {
/*    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập tổng hai số ");
        float tong = sc.nextFloat();
        System.out.println("nhập hiệu hai số ");
        float hieu = sc.nextFloat();
        float x= (tong+hieu)/2;
        float y = tong-x;
        System.out.println("giá trị của x:" +x);
        System.out.println("giá trị của y:"+ y);

    }
}*/
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("xin mời nhập chiều cao:");
    System.out.println("xin mời nhập cân nặng: ");
    double chieucao = sc.nextDouble();
    double cannang = sc.nextDouble();
    double bmi = cannang/(Math.pow(chieucao,2));
    if (bmi<15)
        System.out.println("thân hình quá gầy");
    else if (bmi>=15 && bmi<16) {
        System.out.println("thân hình gầy");
    }
    else if (bmi>=16 && bmi<18.5) {
        System.out.println("thân hình hơi gầy ");
    }
    else if (bmi>18.5 && bmi<25) {
        System.out.println("thân hình bình thường ");
    }
    else if (bmi>=25 && bmi<30) {
        System.out.println("thân hình hơi beo");
    }
    else if (bmi>=30 && bmi<35) {
        System.out.println("thân hình béo");
    }
    else {
        System.out.println("thân hình quá béo");
    }
    /*Scanner sc = new Scanner(System.in);
    System.out.println("nhap du lieu cua a: ");
    double a = sc.nextDouble();
    System.out.println("nhap du lieu cua b: ");
    double b = sc.nextDouble();
    System.out.println("nhap du lieu cua c: ");
    double c = sc.nextDouble();
   double delta = Math.pow(b,2)-(4*a*c);
   if (delta<0)
    System.out.println("phương trình vô nghiệm: ");
    else if (delta==0) {
        double x=-b/(2*a);
       System.out.println("phương trình có nghiệm kép x1= x2=" + x);
   }
    else {
       double x1 = (-b + Math.sqrt(delta)) / (2 * a);
       double x2 = (-b - Math.sqrt(delta)) / (2 * a);
       System.out.println("phương trình có 2 n phân biệt: ");
       System.out.println("x1= " + x1);
       System.out.println("x2= " + x2);
   }
    }
}*/
   /* Scanner sc = new Scanner(System.in);
    System.out.println("mời nhập tháng: ");
    int thang = sc.nextInt();
    if (thang == 1 || thang == 2 || thang ==3 )
        System.out.println("tháng thuộc quý 1");
    else if (thang == 4 || thang == 5 || thang == 6){
        System.out.println("tháng thuộc quý 2");
    }*/

}
}