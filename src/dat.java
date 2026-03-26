import java.util.Scanner;

public class dat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Chiều cao của bạn là: ");
        System.out.println("Cân nặng của bạn là: ");
        double chieucao = sc.nextDouble();
        double cannang = sc.nextDouble();
        double bmi = cannang/(Math.pow(chieucao,2));
        if (bmi<15)
            System.out.println("thân hình gầy");
        else if (bmi>15 && bmi <=20){
            System.out.println("thân hình vừa");
        }else if (bmi>20 && bmi <=25){
            System.out.println("thân hình hơi béo");
        }else if (bmi>25 && bmi <=30){
            System.out.println("thân hình béo");
        }else
            System.out.println("thân hình qua béo");
    }
}
