public class bai151ciaosoft {
    public static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
    public static int nguyentolonnhat(int[] a) {
        int max = 0;
        boolean found = false;
        for (int i = 0; i < a.length; i++) {
            if (isPrime(a[i])) {
                if (!found || a[i] > max) {
                    max = a[i];
                    found = true;
                }
            }
        }
        if (!found) return 0;
        return max;
    }
    public static void main(String[] args) {
        int[] a = {4, 6, 7, 11, 9, 5};
        int kq = nguyentolonnhat(a);
        System.out.println("Số nguyên tố lớn nhất là: " + kq);
    }
}
