package Day2;

import java.util.Scanner;

public class Bai141 {
    public static void main(String[] args) {
//        Hãy tìm “vị trí giá trị dương nhỏ nhất” trong mảng một chiều các số
//        thực (vtduongnhonhat). Nếu mảng không có giá trị dương thì trả về
//        một giá trị ngoài đoạn [0,n-1] là -1 nhằm mô tả không có vị trí nào thỏa
//        điều kiện.

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
        int ViTriDuong=0;
        float min = arr1[0];
        for (int i = 1; i < n; i++) {
            if (min > arr1[i] && arr1[i] > 0){
                ViTriDuong = i;
            }
        }
        System.out.printf("\nVi tri duong nho nhat = %d", (ViTriDuong+1));
    }
}
