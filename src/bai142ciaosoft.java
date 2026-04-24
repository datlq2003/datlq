public class bai142ciaosoft {
    public static double nhonhat (double[] a, int n){
        double min = a[0];
        for (int i =0;i<n;i++){
            if (a[i]<min){
                min=a[i];
            }
        }return min;
    }

    public static void main(String[] args) {
        double[] a = {2.13,2.12,3.51,3.22};
         int n = a.length;
        double kq = nhonhat(a,n);
        System.out.println("" + kq);
        }
    }

