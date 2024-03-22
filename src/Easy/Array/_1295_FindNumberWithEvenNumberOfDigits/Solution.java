package Easy.Array._1295_FindNumberWithEvenNumberOfDigits;

/*
*   Cho mot mang so nguyen nums, tra ve co bao nhieu trong so chung chua so chu so chan
*   VD1: nums = [555, 901, 482, 1771] => Chi co 1771 la so chu so chan
*   VD2: nums = [12,345,2,6,7896] => So 12 va 7896 la so chu so chan
*/
public class Solution {
    public static int findNumber(int[] nums){
        int bienDem = 0;
        for (int a : nums) {
            // Kiem tra so chu so cua a
            // Neu so chu so la chan => Tang bien dem len 1
            int soLuongChuSo = tinhSoChuSo(a);
            if(soLuongChuSo % 2 == 0) {
                bienDem++;
            }
        }
        return bienDem;
    }

    private static int tinhSoChuSo(int a) {
        int bienDem = 0;
        int ketQua = a;
        while (ketQua != 0) {
            ketQua = a / 10;
            a = ketQua;
            bienDem++;
        }
        return bienDem;
    }

    public static void main(String[] args) {
        int[] nums = {555, 91, 482, 1771};
        System.out.println("So chu so chan la: " + findNumber(nums));
    }
}
