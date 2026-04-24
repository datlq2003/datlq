public class bai180ciaosoft {
    public static void lietKe(double[] a) {
        boolean found = false;

        for (int i = 1; i < a.length - 1; i++) {
            if (a[i] > a[i - 1] && a[i] < Math.abs(a[i + 1])) {
                System.out.print(a[i] + " ");
                found = true;
            }
        }
        if (!found) {
            System.out.println("Khong co gia tri thoa dieu kien");
        }
    }
    public static void main(String[] args) {
        double[] a = {2, 5, -10, 6, 3, -8, 4};
        lietKe(a);
    }
}
