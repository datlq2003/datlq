public class bai134ciaosoft {
    public static float lonnhat(float[] a,int n ) {
        float max = a[0];
        for (int i = 1; i < n; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        float[] a = {1,20,15,25,11};
        int n = a.length;
        float max = lonnhat(a,n);
        System.out.println("giá trị lơn nhất  "+ max );
    }
}

