import java.util.Scanner;

public class baitapbosung {
    /// nhập vào 1 số a, đếm số lượng chữ số a, tính tổng và tìm chữ số đảo ngược
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap số nguyên a: ");
        int a = sc.nextInt();
        int count = 0;
        if (a==0){
            count=1;
        }else {
            a = Math.abs(a);
            while (a>0){
                count++;
                a = a/10;
            }
        }
        System.out.println("số lượng chữ số là " + count);
    }
}
