package Easy._643_MaximunAverageSubarryI;

/*
*   - Ban dc cho mot mang so nguyen gom n phan tu va mot so nguyen k
*   - Tim mot mang con lien ke co do dai bang k co gia tri trung binh lon nhat va tra ve gia tri nay.
*   Moi cau tra loi co sai so tinh toan nho hon 10 ^- 5 se dc chap nhan
*   VD1: nums = [1,12,-5,-6,50,3], k = 4 => 12.75000
*   VD2: nums = [5], k = 1 => 5.00000
*/

public class Solution {
    public static double findMaxAverage(int[] nums, int k) {
        double sum = 0;
        for (int i = 0; i < k; ++i)
            sum += nums[i];
        double ans = sum;

        for (int i = k; i < nums.length; ++i) {
            sum += nums[i] - nums[i - k];
            ans = Math.max(ans, sum);
        }

        return ans / k;
    }

    public static void main(String[] args) {
        int[] nums = {1,12,-5,-6,50,3};
        int k = 4;
        System.out.println("max average is " + findMaxAverage(nums, k));
    }
}
