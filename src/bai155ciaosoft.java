public class bai155ciaosoft {
    public static double xanhat (double[] a,double x){
        double maxkhoangcach = -1;
        double kq = 0;
        for (int i=0;i<a.length;i++){
            double khoangcach = Math.abs(a[i]-x);
            if (khoangcach> maxkhoangcach){
                maxkhoangcach=khoangcach;
                kq=a[i];
            }
        }return kq;
    }

    public static void main(String[] args) {
        double[] a ={24,45,23,13,43,-12};
        double x = 15;
        double kq = xanhat(a,x);
        System.out.println(" " + xanhat(a,x));
    }
}
