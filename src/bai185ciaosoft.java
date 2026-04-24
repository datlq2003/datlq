public class bai185ciaosoft {
    public static boolean laSoChinhPhuong(int n) {
        if (n < 0) return false;
        int sqrt = (int) Math.sqrt(n);
        return sqrt * sqrt == n;
    }

    public static void lietKe(int[] a) {
        boolean found = false;
        for (int i = 0; i < a.length; i++) {
            if (laSoChinhPhuong(a[i])) {
                System.out.print(i + " ");
                found = true;
            }
        }
        if (!found) {
            System.out.print("Khong co");
        }
    }

    public static void main(String[] args) {
        int[] a = {3, 4, 7, 9, 10, 16};

        lietKe(a);
    }
}
