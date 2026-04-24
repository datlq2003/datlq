public class bai165ciaosoft {
    public static int chuSoDau(int n) {
        n = Math.abs(n);
        while (n >= 10) {
            n /= 10;
        }
        return n;
    }

    public static int timGiaTri(int[] a) {
        for (int i = 0; i < a.length; i++) {
            int firstDigit = chuSoDau(a[i]);
            if (firstDigit % 2 != 0) {
                return a[i];
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] a = {246, 482, 135, 864, 579};
        int kq = timGiaTri(a);
        System.out.println("Ket qua: " + kq);
    }
}
