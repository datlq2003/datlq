import java.util.Scanner;

public class bai125ciaosoft {
    public static boolean lasonguyento (int n) {
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }            return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập số lượng phần tử của mảng: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i=0;i<n;i++){
            System.out.println("nhập arr [ " + i + " ] ");
            arr[i] = sc.nextInt();
        }int count = 0;
        for (int x : arr ){
            if (x<100 && lasonguyento(x))
                count++;
            }
            System.out.println("số nguyên tố nhỏ hơn 100 : " + count);
        }
    }

