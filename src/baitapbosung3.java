import java.util.Scanner;

public class baitapbosung3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập số nguyên a: ");
        int a = sc.nextInt();
        int temp = Math.abs(a);
        int reverse = 1;
        while (temp==0){
            int socuoi = temp %10;
            reverse = reverse*10 +socuoi;
            temp = temp/10;
        }if (a<0){
            reverse = -reverse;
        } System.out.println("chữ số đảo ngược của " + a+ "là" + reverse);
    }
}
