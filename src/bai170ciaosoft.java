public class bai170ciaosoft {
    public static boolean laSoNguyenTo(int so) {
        if (so < 2) return false;
        for (int i = 2; i <= Math.sqrt(so); i++) {
            if (so % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static int timSoNguyenToNhoNhatLonHonMang(int[] mang) {
        int max = mang[0];
        for (int phanTu : mang) {
            if (phanTu > max) {
                max = phanTu;
            }
        }
        int so = max + 1;
        while (true) {
            if (laSoNguyenTo(so)) {
                return so;
            }
            so++;
        }
    }
    public static void main(String[] args) {
        int[] mang = {2, 5, 8, 10};
        int ketQua = timSoNguyenToNhoNhatLonHonMang(mang);
        System.out.println("Ket qua: " + ketQua);
    }
}
