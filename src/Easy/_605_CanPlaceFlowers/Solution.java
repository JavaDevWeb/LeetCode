package Easy._605_CanPlaceFlowers;

/*
*   - Ban co mot luong hoa dai, trong do mot so manh da dc trong, con mot so thi khong. Tuy nhien, hoa
*   khong the trong o cac o lien ke
*   - Cho mot tham hoa mang so nguyen chua 0 va 1, trong do 0 nghia la trong va 1 nghia la khong trong,
*   dong thoi mot so nguyen n tra ve gia tri true neu n bong hoa moi co the duoc trong trong tham hoa
*   ma khong vi pham quy tac khong co hoa lien ke va sai neu khong
*   VD1: flowerbed = [1,0,0,0,1], n = 1 => true
*   VD2: flowerbed = [1,0,0,0,1], n = 2 => false
*   - Rang buoc:
*       + 1 <= flowerbed.length <= 2 * 104
*       + flowerbed[i] is 0 or 1.
*       + khong co hai bong hoa lien ke trong luong hoa
*       + 0 <= n <= flowerbed.length
*/

public class Solution {
    public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        if(n == 0) return true;
        int count = 0;
        for (int i = 0; i < flowerbed.length; i++) {
            if(flowerbed[i] == 0) {
                if((i == 0 || flowerbed[i - 1] == 0) && (i == flowerbed.length - 1 || flowerbed[i + 1] == 0)) {
                    count++;
                    if(count == n) return true;
                    i++;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] flowerbed = {1,0,0,0,1};
        int n = 1;
        System.out.print("Co the them so bong hoa vao luong: " + canPlaceFlowers(flowerbed, n));
    }
}
