package Day2;

import java.util.Random;
import java.util.Scanner;

public class Bai135 {
    public static void main(String[] args) {

//        Tìm “giá trị dương đầu tiên” trong mảng một chiều các số thực
//                (duongdau). Nếu mảng không có giá trị dương thì trả về giá trị -1.
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap n: ");
        int n=sc.nextInt();
        if(n<1){
            System.out.println("n khong hop le");
            System.exit(0);
        }

        float[] arr1 = new float[n];
        for(int i=0;i<n;i++){
            arr1[i]=sc.nextInt();
        }
        System.out.println("\nMang vua nhap: ");
        for(int i=0;i<n;i++){
            System.out.printf(arr1[i]+"\t");
        }

        System.out.println("\nPhan tu duong dau tien");
        float duong=0;
        for (int i=0; i<n; i++)
        {
            if(arr1[i]>0)
            {
                duong = arr1[i];
                break;
            }
        }
        if(duong!=0){
            System.out.println(duong);
        }
        else{
            System.out.println(-1);
        }
    }
}
