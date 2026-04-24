public class bai184ciaosoft {
    public static boolean laSoNguyenTo(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void lietKe(int[] a) {
        boolean found = false;
        System.out.print("Cac vi tri co gia tri la so nguyen to: ");
        for (int i = 0; i < a.length; i++) {
            if (laSoNguyenTo(a[i])) {
                System.out.print(i + " ");
                found = true;
            }
        }
        if (!found) {
            System.out.print("Khong co");
        }
    }

    public static void main(String[] args) {
        int[] a = {4, 7, 10, 13, 6, 2};

        lietKe(a);
    }
}
