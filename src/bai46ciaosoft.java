import java.util.Scanner;

public class bai46ciaosoft {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập n: ");
        int n = sc.nextInt();
        int chuso = n;
        int chusole = 0;
        while (chuso>0){
            int chusocuoi = chuso%10;
            if (chusocuoi %2!=0){
                chusole++;
            }chuso/=10;
        } System.out.println("số lượng chữ số lẻ của " + n + " là " + chusole);
    }
}
