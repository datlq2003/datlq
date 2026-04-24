public class bai171ciaosoft {
    public static int gcd(int a, int b) {
        while (b != 0) {
            int r = a % b;
            a = b;
            b = r;
        }
        return a;
    }
    public static int gcdArray(int[] a) {
        int result = a[0];

        for (int i = 1; i < a.length; i++) {
            result = gcd(result, a[i]);
        }
        return result;
    }
    public static void main(String[] args) {
        int[] a = {24, 36, 60};
        int kq = gcdArray(a);
        System.out.println("UCLN cua mang: " + kq);
    }
}
