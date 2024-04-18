package Medium._334_IncreasingTripletSubsequence;

/*
*   - Cho mot mang so nguyen nums, tra ve true neu ton tai bo ba chi so (i, j, k) sao cho i < j < k va
*   nums[i] < nums[j] < nums[k]. Neu ko co chi so nao nhu vay ton tai, tra ve sai.
*   VD1: nums = [1,2,3,4,5] => true
*   VD2: nums = [5,4,3,2,1] => false
*   - Rang buoc:
*       + 1 <= nums.length <= 5 * 105
*       + -231 <= nums[i] <= 231 - 1
*/

public class Solution {
    public static boolean increasingTriplet(int[] nums) {
        int first = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] <= first){
                first = nums[i];
            }
            else if(nums[i] <= second){
                second = nums[i];
            }
            else {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7,8,9};
        System.out.print("Ket qua: " + increasingTriplet(nums));
    }
}
