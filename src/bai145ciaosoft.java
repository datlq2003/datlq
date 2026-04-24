public class bai145ciaosoft {
    public static boolean isPerfect(int n) {
        if (n <= 0) return false;
        int sum = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        return sum == n;
    }
    public static int hoanthiendau(int[] a) {
        for (int i = 0; i < a.length; i++) {
            if (isPerfect(a[i])) {
                return a[i];
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] a = {5, 10, 6, 8, 28};
        int kq = hoanthiendau(a);
        if (kq == -1) {
            System.out.println("Không có số hoàn thiện.");
        } else {
            System.out.println("Số hoàn thiện đầu tiên là: " + kq);
        }
    }
}
