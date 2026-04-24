public class bai140ciaosoft {
    public static float duongnhonhat(float[] a, int n){
        float min = a[0];
        for (int i=0;i<n;i++){
            if (a[i]>0){
                return a[i];
            }
        }return -1;
    }

    public static void main(String[] args) {
        float[] a = {0,4,3,1,-2,-4};
        int n = a.length;
        float kq = duongnhonhat(a,n);
        if (kq==-1){
            System.out.println(""+ kq);
        }else {
            System.out.println(""+ kq);
        }
    }
}
