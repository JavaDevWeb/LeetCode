package Easy._27_RemoveElement;

/*
*   - Cho mot mang so nguyen nums va mot so nguyen val, loai bo tat cac su xuat hien cua val trong nums
*   truc tiep trong chinh mang nums do. Thu tu cua cac phan tu co the thay doi. Sau do, tra ve so luong
*   phan tu trong nums khong bang val.
*   - Gia su so luong phan tu trong nums khong bang val la k, de duoc chap nhan, ban can thuc hien cac buoc sau:
*       + Thay doi mang nums sao cho k phan tu dau tien cua nums chua cac phan tu khong bang val. Cac phan tu
*       con lai cua nums khong quan trong nhu kich thuoc cua nums
*       + Tra ve k
*   VD1: nums = [3, 2, 1, 2, 5], val = 2 => nums = [3, 1, 5, _, _] => k = 3
*   VD2: nums = [1, 2, 1, 3], val = 1 => nums =[2, 3, _, _] => k = 2
*   - Rang buoc:
*       + 0 <= nums.length <= 100
*       + 0 <= nums[i] <= 50
*       + 0 <= val <= 100
*/

public class Solution {
    public static int removeElement(int[] nums, int val){
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] != val) {
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }

    public static void main(String[] args) {
        int[] nums = {0, 1, 2, 2, 3, 0, 4, 2};
        System.out.println("So luong phan tu trong nums ko bang val la: " + removeElement(nums, 2));
    }
}
