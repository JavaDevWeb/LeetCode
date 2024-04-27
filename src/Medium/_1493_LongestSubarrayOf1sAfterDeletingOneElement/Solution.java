package Medium._1493_LongestSubarrayOf1sAfterDeletingOneElement;

/*
*   - Cho mot mang nhi phan so, ban nen xoa mot phan tu khoi mang do.
*   - Tra ve kich thuoc cua mang con khong trong dai nhat chi chua so 1 trong mang ket qua. Tra ve 0 neu ko
*   co mang con nhu vay.
*   VD1: nums = [1,1,0,1] => 3
*   VD2: nums = [0,1,1,1,0,1,1,0,1] => 5
*   - Rang buoc:
*       + 1 <= nums.length <= 10^5
*       + nums[i] is either 0 or 1.
*/

public class Solution {
    public static int longestSubarray(int[] nums) {
        int result = 0;
        for (int i = 0, j = 0, zeroCount = 0; j < nums.length; j++) {
            zeroCount += (nums[j] == 0) ? 1 : 0;
            while (zeroCount > 1) {
                zeroCount -= (nums[i++] == 0) ? 1 : 0;
            }
            result = Math.max(result, j - i);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {1,1,0,1};
        System.out.println("Longest subarray: " + longestSubarray(nums));
    }
}
