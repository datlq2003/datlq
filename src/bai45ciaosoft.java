import java.util.Scanner;

public class bai45ciaosoft {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập n: ");
        int n = sc.nextInt();
        int chuso = n;
        int tich =1;
        while (chuso>0){
            int chusocuoi = chuso%10;
            tich *= chusocuoi;
            chuso/=10;
        }
        System.out.println(" tích các chữ số của " + n+ " là " + tich);
    }
}
