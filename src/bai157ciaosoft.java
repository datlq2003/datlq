public class bai157ciaosoft {
    public static void main(String[] args) {
        double[] a = {2.5,1.3,-1.2,3.8};
        double min = a[0];
        double max = a[0];
        for (int i=1;i<a.length;i++){
            if (a[i]<min){
                min=a[i];
            }if (a[i]>max){
                max = a[i];
            }
        }
        System.out.println("[a,b]=[ " + min + ", " + max +"] ");
    }
}
