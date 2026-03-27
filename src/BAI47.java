import java.util.Scanner;

public class BAI47 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("mời nhập x:");
        int x = sc.nextInt();
        int tich = 0;
        while (x > 0) {
            int chuso = x % 10; //  5
            if (chuso % 2 != 0) {
                //tich *= chuso;
                if (tich == 0) { //
                    tich = chuso; //

                } else {
                    tich = tich * chuso; //
                }
                System.out.println("Số lẻ là " + chuso);

            }
            x = x / 10; //
        }

        System.out.println("tich se la " + tich);
    }
}



