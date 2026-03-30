import java.util.Scanner;

public class bai48ciaosoft {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập n: ");
        int n = sc.nextInt();
        int temp = n;
        int tich =1;
        boolean cochusole = false;
        while (temp > 0){
            int chusocuoi = temp%10;
            if (chusocuoi%2!=0){
                tich *= chusocuoi;
                cochusole = true;
            } temp /=10;
        }if (cochusole){
            System.out.println("tích các chu số lẻ của " + n + " là: " + tich);
        }else {
            System.out.println(n+ " không có chữ số lẻ ");
        }
    }
}
