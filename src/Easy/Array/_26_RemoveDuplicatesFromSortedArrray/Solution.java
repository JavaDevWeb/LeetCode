package Easy.Array._26_RemoveDuplicatesFromSortedArrray;

/*
*   - Cho mot mang so nguyen nums dc sap xep theo thu tu ko giam, loai bo cac phan tu trung lap trong
*   chinh no sao cho moi phan tu duy nhat chi xuat hien mot lan. Thu tu tuong doi cua cac phan tu phai
*   dc giu nguyen. Sau do, tra ve phan tu duy nhat trong nums.
*   - Gia su so luong phan tu duy nhat trong nums la k, de dc chap nhan, ban can thuc hien cac buoc sau:
*       + Thay doi mang nums sao cho k phan tu dau tien cua nums chua cac phan tu duy nhat theo thu tu ban
*       dau cua chung trong nums. Cac phan tu con lai trong nums khong quan trong cung nhu kich thuoc
*       cua nums.
*       + Tra ve k.
*/

public class Solution {
    public static int removeDuplicates(int[] nums) {
        int k = 0;
        for (int num : nums) {
            if (k < 1 || num > nums[k - 1]) {
                nums[k++] = num;
            }
        }
        return k;
    }

    public static void main(String[] args) {
        int[] nums = {0, 0, 1, 1, 2, 3, 4, 5, 5};
        System.out.print("So luong phan tu ko bi trung la: " + removeDuplicates(nums));
    }
}
