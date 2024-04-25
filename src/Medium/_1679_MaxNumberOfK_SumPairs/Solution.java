package Medium._1679_MaxNumberOfK_SumPairs;

/*
*   - Ban dc cho mot mang so nguyen va mot so nguyen k
*   - Trong mot thao tac, ban co the chon hai so tu mang co tong bang k xoa chung khoi mang
*   - Tra ve so luong thao tac toi da ban co the thuc hien tren mang
*   VD1: nums = [1,2,3,4], k = 5 => 2
*   VD2: nums = [3,1,3,4,3], k = 6 => 1
*   - Rang buoc:
*       + 1 <= nums.length <= 105
*       + 1 <= nums[i] <= 10^9
*       + 1 <= k <= 10^9
*/

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static int maxOperations(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap();
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            int target = k - nums[i];
            if (map.containsKey(target)) {
                count++;
                if(map.get(target) == 1) {
                    map.remove(target);
                }
                else {
                    map.put(target, map.get(target) - 1);
                }
            } else {
                map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        int k = 5;
        System.out.println("Count: " + maxOperations(nums, k));
    }
}
