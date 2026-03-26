import java.util.Scanner;

public class bai12java {
    //viết pt nhập vào số nguyên n, in ra kết quả n
    //for
    /*public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("mời nhập số nguyên n:");
        int n = sc.nextInt();
        int gt = 1;
        for (int i=1;i<=n;i++){
            gt*=i;
            System.out.println("ta có kết quả : " + gt);
        }
    }*/
    //while
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n ;
        int gt = 1;
        int i = 1;
        System.out.println("mời nhập số nguyên n: ");
        n = sc.nextInt();
        while (i<=n){
            gt = gt*i;
            i++;
            System.out.println("ta có kết quả: " + n + " ! = " +gt);
        }
    }
}
