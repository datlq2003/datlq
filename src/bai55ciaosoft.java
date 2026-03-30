import java.util.Scanner;

public class bai55ciaosoft {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhâp n: ");
        int n = sc.nextInt();
        int temp = n;
        while (temp>=10){
            temp /=10;
        }int chusodau = temp;
        System.out.println("chữ số đầu tiên là: " + chusodau);
    }
}
