public class bai193ciaosoft {
    public static void lietKe(int[] a) {
        boolean found = false;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 3 == 0) {
                System.out.print(a[i] + " ");
                found = true;
            }
        }
        if (!found) {
            System.out.print("0");
        }
    }

    public static void main(String[] args) {
        int[] a = {4, 6, 7, 9, 10, 12};
        lietKe(a);
    }
}
