package Day2;

import java.util.Random;
import java.util.Scanner;

public class Bai137 {
    public static void main(String[] args) {
//        Tìm “một vị trí mà giá trị tại vị trí đó là giá trị nhỏ nhất” trong mảng
//        một chiều các số thực (vitrinhonhat).

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
        int ViTriMin=0;
        float min = arr1[0];
        for (int i=1;i<n;i++) {
            if(min > arr1[i])
                ViTriMin = i;
                break;
        }
        System.out.printf("\nVi tri gia tri nho nhat là: %d",(ViTriMin+1));
    }
}
