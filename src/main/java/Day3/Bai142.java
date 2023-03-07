package Day3;

public class Bai142 {
//    Tìm “giá trị nhỏ nhất” trong mảng một chiều số thực (nhonhat).
    public static double minArr(double[] arr){
        double min=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<min){
                return arr[i];
            }
        }
        return min;
    }

    public static void main(String[] args) {
        double[] arr={3.4,1.4,2.5,3.3,4.4,5.5};
        System.out.println("Phan tu nho nhat: "+minArr(arr));
    }
}
