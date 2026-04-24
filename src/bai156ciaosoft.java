public class bai156ciaosoft {
    public static double gannhat (double[] a, int x){
        double minkhoangcach = Math.abs(a[0] - x);
        double kq = 0;
        for (int i=0; i<a.length;i++){
            double khoangcach = Math.abs(a[i]-x);
            if (khoangcach<minkhoangcach){
                minkhoangcach=khoangcach;
                kq = a[i];
            }
        }return kq;
    }

    public static void main(String[] args) {
        double[] a = {24,45,23,13,43,-12};
        int x = 15;
        double kq = gannhat(a,x);
        System.out.println("" + gannhat(a,x));
    }
}
