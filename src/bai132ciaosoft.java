public class bai132ciaosoft {
    public static void lietKeChan(int[] a) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                System.out.print(a[i] + " ");
            }
        }
    }
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6};
        System.out.print("Các số chẵn: ");
        lietKeChan(a);
    }
}
