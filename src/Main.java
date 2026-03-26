import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
   /*     Scanner sc = new Scanner(System.in);
        System.out.println("nhập dtb: ");
        double dtb = sc.nextDouble();
        String traloi = (dtb > 9 && dtb < 10)? "Gioi" :
                ((dtb >= 6 && dtb < 8) ?"Khá":
ta        System.out.println(traloi);
    }*/
        Scanner sc = new Scanner(System.in);
        System.out.println("mới nhập số thứ tự n từ 1-99: ");
        int n = sc.nextInt();
        while (n < 1 || n > 99) ;
        System.out.println("số bạn chọn không đúng xin mời chọn lại");
        n = sc.nextInt();
        System.out.println("bạn đã nhập xong n: " + n);
    }


}