public class bai191ciaosoft {
    public static void lietKe(double[] a) {
        boolean found = false;
        for (int i = 1; i < a.length - 1; i++) {
            if (a[i] > a[i - 1] && a[i] > a[i + 1]) {
                System.out.print(a[i] + " ");
                found = true;
            }
        }
        if (!found) {
            System.out.print("Khong co gia tri cuc dai");
        }
    }

    public static void main(String[] args) {
        double[] a = {2, 5, 3, 7, 6, 8, 4};
        lietKe(a);
    }
}
