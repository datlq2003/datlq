public class bai195ciaosoft {
    public static void lietKe(double[] a) {
        int n = a.length;
        boolean found = false;
        for (int i = 0; i < n; i++) { // a
            for (int j = 0; j < n - 1; j++) { // b
                if (j == i) continue;
                for (int k = j + 1; k < n; k++) { // c
                    if (k == i) continue;
                    if (a[i] == a[j] + a[k]) {
                        System.out.println("(" + a[i] + ", " + a[j] + ", " + a[k] + ")");
                        found = true;
                    }
                }
            }
        }
        if (!found) {
            System.out.println("Khong co bo ba thoa dieu kien");
        }
    }

    public static void main(String[] args) {
        double[] a = {2, 4, 6, 1, 5};
        lietKe(a);
    }
}
