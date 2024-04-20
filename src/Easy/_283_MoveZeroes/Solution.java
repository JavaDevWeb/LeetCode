package Easy._283_MoveZeroes;

/*
*   - Cho mot mang so nguyen, hay di chuyen tat ca cac so 0 den cuoi mang do trong khi van giu nguyen thu tu
*   tuong doi cua cac phan tu khac 0
*   - Luu y rang ban phai thuc hien viec nay tai cho ma khong tao ban sao cua mang
*   VD1: nums = [0,1,0,3,12] => [1,3,12,0,0]
*   VD2: nums = [0] => [0]
*/

import java.util.Arrays;

public class Solution {
    public static void moveZeroes(int[] nums) {
        int n = nums.length;
        int j = -1;
        int i = 0;

        while(i < n ){
            if(nums[i] == 0 && j == -1) j = i;
            else if(nums[i] != 0 && j != -1 ){
                nums[j] = nums[i];
                nums[i] = 0;
                j++ ;
            }
            i++;
        }
    }

    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12};
        moveZeroes(nums);
        System.out.println("Mang sau khi doi cho la: " + Arrays.toString(nums));
    }
}
