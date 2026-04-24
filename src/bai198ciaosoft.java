public class bai198ciaosoft {
    public static void lietKe(double[] a) {
        if (a.length == 0) {
            System.out.println("Mang rong");
            return;
        }
        double max = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        System.out.print("Cac vi tri: ");
        for (int i = 0; i < a.length; i++) {
            if (a[i] == max) {
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String[] args) {
        double[] a = {3.5, 7.2, 1.1, 7.2, 5.0};
        lietKe(a);
    }
}
