package Medium._1004_MaxConsecutiveOnesIII;

/*
*   - Cho mot mang nhi phan nums va mot so nguyen k, tra ve so luong toi da cac so 1 lien tiep trong mang
*   neu ban co the lat nhieu nhat k = 0
*/

public class Solution {
    public static int longestOnes(int[] nums, int k) {
        int i = 0;
        int j = 0;
        while (i < nums.length) {
            if (nums[i] == 0) {
                k--;
            }
            if (k < 0 && nums[j++] == 0) {
                k++;
            }
            i++;
        }
        return i-j;
    }

    public static void main(String[] args) {
        int[] nums = {1,1,1,0,0,0,1,1,1,1,0};
        int k = 2;
        System.out.println("Longest Ones: " + longestOnes(nums, k));
    }
}
