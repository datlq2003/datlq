public class bai161ciaosoft {
    public static int timGiaTri(int[] a, int x, int y) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] > x && a[i] < y) {
                return a[i]; // giá trị đầu tiên thỏa
            }
        }
        return x; // không có thì trả về x
    }

    public static void main(String[] args) {
        int[] a = {5, 12, 8, 20, 3};
        int x = 6;
        int y = 15;
        int kq = timGiaTri(a, x, y);
        System.out.println("Ket qua: " + kq);
    }
}

