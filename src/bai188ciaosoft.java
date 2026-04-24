public class bai188ciaosoft {
    public static void lietke(int[] a){
        int maxChan = Integer.MIN_VALUE;
        boolean found = false;
        for (int i=1;i<a.length;i++){
            if (a[i]%2==0 && a[i]>maxChan){
                maxChan=a[i];
                found=true;
            }
        }if (found){
            System.out.println("khong co so chan");
            return;
        }
        System.out.println("cac vi tri: ");
        for (int i=0;i<a.length;i++){
            if (a[i]==maxChan){
                System.out.println(i + " ");
            }
        }
    }
    public static void main(String[] args) {
        int[] a = {8,3,9,5,7,4};
        lietke(a);
    }
}
