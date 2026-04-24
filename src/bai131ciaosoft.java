public class bai131ciaosoft {
    public static void xuatMang(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        System.out.print("Mảng là: ");
        xuatMang(a);
    }
}
