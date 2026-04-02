import java.util.Scanner;

public class bai47ciaosoft {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("mời nhập x:");
        int x = sc.nextInt();
        int tich = 0;
        while (x > 0) {
            int chuso = x % 10;
            if (chuso % 2 != 0) {
                if (tich == 0) {
                    tich = chuso;
                } else {
                    tich = tich * chuso;
                }
                System.out.println("Số lẻ là " + chuso);
            }
            x = x / 10;
        }
        System.out.println("tich se la " + tich);
    }
}



