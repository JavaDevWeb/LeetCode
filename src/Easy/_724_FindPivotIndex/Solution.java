package Easy._724_FindPivotIndex;

/*
*   - Cho mot mang cac so nguyen, tinh chi so truc cua mang nay
*   - Chi so truc la chi muc trong do tong cua tat ca cac so o ben trai cua chi muc bang tong cua tat
*   ca cac so o ben phai cua chi muc
*   - Neu chi muc nam o canh trai cua mang thi tong ben trai la 0 vi khong co phan tu nao o ben trai.
*   Dieu nay cung ap dung cho canh phai cua mang.
*   - Tra ve chi so truc ngoai cung ben phai. Neu ko co chi muc nao ton tai, hay tra ve -1
*   VD1: nums = [1,7,3,6,5,6] => 3
*   VD2: nums = [1,2,3] => -1
*   - Rang buoc:
*       + 1 <= nums.length <= 10^4
*       + -1000 <= nums[i] <= 1000
*/

public class Solution {
    public static int pivotIndex(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        int left_sum = 0;
        int right_sum = sum;
        for (int i = 0; i < nums.length; i++) {
            right_sum -= nums[i];
            if (right_sum == left_sum) {
                return i;
            }
            left_sum += nums[i];
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {2,1,-1};
        System.out.println("pivotIndex: " + pivotIndex(nums));
    }
}
