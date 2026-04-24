public class bai202ciaosoft {
    public static int chuSoDau(int n) {
        n = Math.abs(n);
        while (n >= 10) {
            n /= 10;
        }
        return n;
    }
    public static int tongDauLe(int[] a) {
        int sum = 0;

        for (int i = 0; i < a.length; i++) {
            int firstDigit = chuSoDau(a[i]);
            if (firstDigit % 2 != 0) {
                sum += a[i];
            }
        }
        return sum;
    }
}
