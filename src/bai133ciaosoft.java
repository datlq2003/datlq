public class bai133ciaosoft {
    public static void lietKeViTriAm(double[] a) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] < 0) {
                System.out.print(i + " ");
            }
        }
    }
    public static void main(String[] args) {
        double[] a = {2.5, -3.1, 4.2, -5.6};
        System.out.print("Vị trí số âm: ");
        lietKeViTriAm(a);
    }
}
