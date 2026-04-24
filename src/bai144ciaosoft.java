public class bai144ciaosoft {
    public static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
    public static int nguyentoDau(int[] a) {
        for (int i = 0; i < a.length; i++) {
            if (isPrime(a[i])) {
                return a[i];
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] a = {4, 6, 8, 9, 11, 15};
        int kq = nguyentoDau(a);
        if (kq== -1) {
            System.out.println("Không có số nguyên tố.");
        } else {
            System.out.println("Số nguyên tố đầu tiên là: " + kq);
        }
    }
}
