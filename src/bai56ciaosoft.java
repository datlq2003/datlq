import java.util.Scanner;

public class bai56ciaosoft {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp = n;
        boolean toansole = true;
        while (temp>0){
            int chuso = temp%10;
            if (chuso%2==0){
               toansole=false;
               break;
            }temp/=10;
        }if (toansole){
            System.out.println(n+"toàn số lẻ");
        }else {
            System.out.println(n+ "không phải toàn số lẻ");
        }
    }
}
