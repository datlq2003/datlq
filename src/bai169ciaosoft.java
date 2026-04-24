public class bai169ciaosoft {
    public static int timsochanlonnhatnhohonsole(int[] a){
        int lenhonhat = Integer.MAX_VALUE;
        for (int phantu : a){
            if (phantu%2!=0 && phantu<lenhonhat){
                lenhonhat=phantu;
            }
        }if (lenhonhat==Integer.MAX_VALUE){
            return 0;
        }int kq = Integer.MIN_VALUE;
        for (int phantu : a){
            if (phantu%2==0 && phantu<lenhonhat){
                if (phantu>kq){
                    kq=phantu;
                }
            }
        }if (kq==Integer.MIN_VALUE){
            return 0;
        }return kq;
    }

    public static void main(String[] args) {
        int[] a = {2,4,6,7,9,10};
        int kq = timsochanlonnhatnhohonsole(a);
        System.out.println(" " + kq);
    }
}
