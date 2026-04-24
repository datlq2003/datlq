public class bai197ciaosoft {
    public static int chuSoDau(int n) {
        n = Math.abs(n); // xử lý số âm
        while (n >= 10) {
            n /= 10;
        }
        return n;
    }

    public static void lietKe(int[] a) {
        boolean found = false;
        for (int i = 0; i < a.length; i++) {
            int firstDigit = chuSoDau(a[i]);
            if (firstDigit % 2 != 0) {
                System.out.print(a[i] + " ");
                found = true;
            }
        }
        if (!found) {
            System.out.print("Khong co");
        }
    }
    public static void main(String[] args) {
        int[] a = {246, 135, 482, 579, 802, 713};
        lietKe(a);
    }
}
