public class bai163ciaosoft {
    public static boolean lasochinhphuong(int n){
        if (n<0) return false;
        int can = (int)Math.sqrt(n);
        return can*can == n;
        }
        public static Integer timsochinhphuongdautien(int[] a){
        for (int x:a){
            if (lasochinhphuong(x)){
                return x;
            }
        }return null;
    }
    public static void main(String[] args) {
        int[] a = {8,10,20,9,8};
        Integer kq = timsochinhphuongdautien(a);
        if (kq!= null){
            System.out.println(" " + kq);
        }else {
            System.out.println("không có số chính phương");
        }
    }
}
