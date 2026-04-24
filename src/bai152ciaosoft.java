public class bai152ciaosoft {
        public static boolean isPerfect(int n) {
            if (n <= 0) return false;
            int sum = 0;
            for (int i = 1; i < n; i++) {
                if (n % i == 0) {
                    sum += i;
                }
            }
            return sum == n;
        }
        public static int hoanthiennhonhat(int[] a) {
            int min = 0;
            boolean found = false;
            for (int i = 0; i < a.length; i++) {
                if (isPerfect(a[i])) {
                    if (!found || a[i] < min) {
                        min = a[i];
                        found = true;
                    }
                }
            }
            if (!found) return 0;
            return min;
        }
        public static void main(String[] args) {
            int[] a = {28, 6, 496, 10};
            int kq = hoanthiennhonhat(a);
            System.out.println("Số hoàn thiện nhỏ nhất là: " + kq);
        }
    }
   /* public static boolean isPerfect(int n){
        if (n<=0) return false;
        int sum =0;
        for (int i=1;i<n;i++){
            if (n%i==0){
                sum+=1;
            }
        }return sum ==n;
    }
    public static int hoanthiennhonhat(int[] a){
        int min =0;
        boolean found = false;
        for (int i=0;i<a.length;i++){
            if (isPerfect(a[i])){
                if (!found || a[i]< min){
                    min= a[i];
                    found = true;
                }
            }
        }if (!found) return 0;
        return min;
    }
    public static void main(String[] args) {
        int[] a = {6,28,12};
        int kq = hoanthiennhonhat(a);
        if (kq==0){
            System.out.println("" + kq);
        }else {
            System.out.println("" + kq);
        }
    }*/

