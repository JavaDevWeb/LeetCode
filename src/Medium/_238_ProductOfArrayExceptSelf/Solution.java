package Medium._238_ProductOfArrayExceptSelf;

/*
*   - Cho mot mang so nguyen nums, tra ve mot ket qua mang sao cho answer[i] bang tich cua tat ca cac phan
*   tu cua nums ngoai tru nums[i]
*   - Tich cua bat ky tien to hoac hau to nao cua so deu duoc dam bao vua voi so nguyen 32 bit
*   - Ban phai viet mot thuat toan chay trong thoi gian O(n) va ko dc su dung phep chia
*   VD1: nums = [1,2,3,4] => [24,12,8,6]
*   VD2: nums = [-1,1,0,-3,3] => [0,0,9,0,0]
*   - Rang buoc:
*       + 2 <= nums.length <= 105
*       + -30 <= nums[i] <= 30
*       + Tich cua bat ky tien to hoac hau to nao cua so deu dc dam bao vua voi so nguyen 32 bit
*/

import java.util.Arrays;

public class Solution {
    public static int[] productExceptSelf(int[] nums) {
        int N = nums.length;
        int[] output_arr = new int[N];
        output_arr[0] = 1;

        for (int i = 1; i < N; i++) {
            output_arr[i] = output_arr[i - 1] * nums[i - 1];
        }

        int R = 1;
        for (int i = N - 1; i >= 0; i--) {
            output_arr[i] = output_arr[i] * R;
            R *= nums[i];
        }
        return output_arr;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        int[] result = productExceptSelf(nums);
        System.out.print("Mang moi la: " + Arrays.toString(result));
    }
}
