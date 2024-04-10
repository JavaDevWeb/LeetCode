package Easy._169_MajorityElement;

/*
*   - Cho mot mang co kich thuoc n, tra ve phan tu da so
*   - Phan tu da so la phan tu xuat hien nhieu hon [n/2] lan. Ban co the cho rang phan tu da so luon
*   ton tai trong mang
*   VD1: nums = [3,2,3] => 3
*   VD2: nums = [2,2,1,1,1,2,2] => 2
*   - Rang buoc:
*       + n == nums.length
*       + 1 <= n <= 5 * 104
*       + -109 <= nums[i] <= 109
*/

import java.util.Arrays;

public class Solution {
    public static int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length/2];
    }
    public static void main(String[] args) {
        int[] nums = {3,2,3};
        System.out.print("majorityElement: " + majorityElement(nums));
    }
}
