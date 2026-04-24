import java.util.Scanner;

public class bai124ciaosoft {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập số lượng phần tử của mảng: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i=0;i<n;i++){
            System.out.println("nhập arr : [ " + i + "]");
            arr[i] = sc.nextInt();
        }
        boolean sochannhohon2004 = false;
        for (int x : arr){
            if (x%2==0 & x <2004){
                sochannhohon2004 = true;
                break;
            }
        }
        System.out.println(sochannhohon2004);
    }
}
