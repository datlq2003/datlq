import java.util.Scanner;

public class bai136ciaosoft {
    public static float sochancuoicung (int[] a,int n ){
        for (int i=n-1;i>=0;i--){
            if (a[i]%2==0){
                return a[i];
            }
        }return -1;
    }
    public static void main(String[] args) {
        int[] a = {2,1,4,7,-3};
        int n = a.length;
        float chancuoi = sochancuoicung (a,n);
        if (chancuoi==-1){
            System.out.println("mảng không có giá trị chẵn" + chancuoi);
        }else {
            System.out.println("số chẵn cuối là" + chancuoi);
        }
    }
}