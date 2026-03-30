import java.util.Scanner;

public class bai54ciaosoft {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập n: ");
        int n = sc.nextInt();
        int temp = n;
        int min = 9;
        while (temp>0){
            int chuso = temp%10;
            if (chuso<min){
                min = chuso;
            }temp /=10;
        }temp = n;
        int dem = 0;
        while (temp>0){
            int chuso = temp%10;
            if (chuso==min){
                dem++;
            }temp /=10;
        }
        System.out.println("chữ số bé nhất là" + min);
        System.out.println("số lần xuất hiện là " + dem);
    }
}
