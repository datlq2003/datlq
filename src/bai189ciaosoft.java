public class bai189ciaosoft {
    public static boolean laSoNguyenTo(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
    public static int chuSoDau(int n) {
        n = Math.abs(n);
        while (n >= 10) {
            n /= 10;
        }
        return n;
    }
    public static void lietKe(int[] a) {
        boolean found = false;
        for (int i = 0; i < a.length; i++) {
            if (laSoNguyenTo(a[i]) && chuSoDau(a[i]) % 2 != 0) {
                System.out.print(a[i] + " ");
                found = true;
            }
        }
        if (!found) {
            System.out.print("Khong co");
        }
    }
    public static void main(String[] args) {
        int[] a = {23, 17, 29, 41, 58, 73, 88};
        lietKe(a);
    }
}
