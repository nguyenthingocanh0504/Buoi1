package Day2;

import java.util.Random;
import java.util.Scanner;

public class Bai134 {
    public static void main(String[] args) {
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

        float max = arr1[0];
        for (float num: arr1) {
            if(max < num)
                max = num;
        }
        System.out.printf("\nSố lớn nhất trong mảng là: %.1f",max);
    }
}
