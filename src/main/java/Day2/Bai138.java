package Day2;

import java.util.Random;
import java.util.Scanner;

public class Bai138 {
    public static void main(String[] args) {
//        Tìm “vị trí của giá trị chẵn đầu tiên” trong mảng một chiều các số
//        nguyên (vitrichandau). Nếu mảng không có giá trị chẵn thì hàm sẽ trả
//        về giá trị là – 1.
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap n: ");
        int n=sc.nextInt();
        if(n<1){
            System.out.println("n khong hop le");
            System.exit(0);
        }
        Random random = new Random();
        float[] arr1 = new float[n];
        for(int i=0;i<n;i++){
            arr1[i]=random.nextInt(1000);
        }

        for(int i=0;i<n;i++){
            System.out.printf(arr1[i]+"\t");
        }
        int ViTriChan=0;
        for (int i=1;i<n;i++) {
            if(arr1[i]%2==0)
                ViTriChan = i;
            break;
        }
        System.out.printf("\nVi tri gia tri nho nhat là: %d",(ViTriChan+1));
    }
}
