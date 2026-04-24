public class bai190ciaosoft {
    public static boolean toanChuSoLe(int n) {
        n = Math.abs(n);
        if (n == 0) return false; // 0 là số chẵn
        while (n > 0) {
            int digit = n % 10;
            if (digit % 2 == 0) {
                return false;
            }
            n /= 10;
        }
        return true;
    }

    public static void lietKe(int[] a) {
        boolean found = false;
        for (int i = 0; i < a.length; i++) {
            if (toanChuSoLe(a[i])) {
                System.out.print(a[i] + " ");
                found = true;
            }
        }
        if (!found) {
            System.out.print("Khong co");
        }
    }

    public static void main(String[] args) {
        int[] a = {135, 246, 777, 123, 579, 802};

        lietKe(a);
    }
}
