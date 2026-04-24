public class bai138ciaosoft {
    public static int vitrichandau(int[] a, int n){
        for (int i=0 ; i<n;i++){
            if (a[0]%2==0){
                return a[i];
            }
        }return -1;
    }

    public static void main(String[] args) {
        int[] a = {2,3,5,7,1,2};
        int n = a.length;
        int kq = vitrichandau(a,n);
        if (a[0] ==-1){
            System.out.println("mảng không có giá trị chẵn" +kq);
        }else {
            System.out.println("mảng có giá trị chẵn" + kq);
        }
    }
}
