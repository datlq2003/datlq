public class bai167ciaosoft {
    public static boolean toanChuSoLe(int n) {
        n = Math.abs(n); // xử lý số âm
        if (n == 0) return false;
        while (n > 0) {
            int digit = n % 10;
            if (digit % 2 == 0) {
                return false;
            }
            n /= 10;
        }
        return true;
    }

    public static int timGiaTri(int[] a) {
        int max = 0;
        boolean found = false;
        for (int i = 0; i < a.length; i++) {
            if (toanChuSoLe(a[i])) {
                if (!found || a[i] > max) {
                    max = a[i];
                    found = true;
                }
            }
        }

        return found ? max : 0;
    }

    public static void main(String[] args) {
        int[] a = {135, 777, 246, 579, 888};
        int kq = timGiaTri(a);
        System.out.println("Ket qua: " + kq);
    }
}
