package Day2;

import java.util.Scanner;

public class Bai136 {
    public static void main(String[] args) {
//        Tìm “số chẵn cuối cùng” trong mảng một chiều các số nguyên
//                (chancuoi). Nếu mảng không có giá trị chẵn thì trả về giá trị -1.

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

        System.out.println("\nPhần tử chẵn cuối cùng ");
        float chan=0;
        for (int i=n-1; i<n; i--)
        {
            if(arr1[i]%2==0)
            {
                System.out.println(arr1[i]);
                break;
            }
        }

    }
}
