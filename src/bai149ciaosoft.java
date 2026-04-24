public class bai149ciaosoft {
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
    public static int hoanthiencuoi(int[] a) {
        for (int i = a.length - 1; i >= 0; i--) {
            if (isPerfect(a[i])) {
                return a[i];
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] a = {5, 6, 10, 28, 12};
        int kq = hoanthiencuoi(a);
        if (kq == -1) {
            System.out.println("Không có số hoàn thiện.");
        } else {
            System.out.println("Số hoàn thiện cuối cùng là: " + kq);
        }
    }
}
