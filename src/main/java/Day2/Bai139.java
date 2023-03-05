package Day2;

import java.util.Random;
import java.util.Scanner;

public class Bai139 {
    public static void main(String[] args) {
//        Tìm “vị trí số hoàn thiện cuối cùng” trong mảng một chiều các số
//          nguyên (vitrihoanthiencuoi). Nếu mảng không có số hoàn thiện thì trả
//          về giá trị - 1.

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
        boolean soHoanHao=true;
        int ViTri=0;
        for (int i=n-1;i<=arr1[i]/2;i--) {
            if(arr1[i]%i==0) {
                ViTri = i;
                break;
            }
        }
            System.out.printf("\nVi tri so hoan thien cuoi cung la: %d", (ViTri + 1));
    }

}
