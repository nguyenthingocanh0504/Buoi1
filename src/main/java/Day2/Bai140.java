package Day2;

import java.util.Scanner;

public class Bai140 {
    public static void main(String[] args) {
//        Hãy tìm “giá trị dương nhỏ nhất” trong mảng các số thực
//        (duongnhonhat). Nếu mảng không có giá trị dương thì trả về giá trị
//        không dương là – 1.

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

        float min = arr1[0];
        for (int i = 0; i < n; i++) {
            if (min > arr1[i] && arr1[i] > 0){
                min = arr1[i];
            }
        }
        System.out.printf("\nPhan tu duong nho nhat = %f", min);
    }
}
