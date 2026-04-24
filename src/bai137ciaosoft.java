public class bai137ciaosoft {
    public static float vitrinhonhat(float[] a, int n){
        float min = a[0];
        for (int i=0;i<n;i++){
            if (a[i]>min){
                min = a[i];
            }
        }return min;
    }
    public static void main(String[] args) {
        float[] a = {7,5,8,9,3,1};
        int n = a.length;
        float giatrinhonhat = vitrinhonhat(a,n);
        System.out.println("vị trí nhỏ nhất " + giatrinhonhat);
    }
}
