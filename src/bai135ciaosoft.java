public class bai135ciaosoft {
    public static float giatridautien(float[] a, int n){
        for (int i=0;i<n;i++){
            if (a[i]>0){
                return a[i];
            }
        }return -1;
    }

    public static void main(String[] args) {
        float[] a = {-3,-2,0,-5};
        int n = a.length;
        float kq = giatridautien(a,n);
        if (kq==-1){
            System.out.println("mảng không có giá trị dương" + kq);
        }else {
            System.out.println("mảng có giá trị dương " + kq);
        }
    }
}
