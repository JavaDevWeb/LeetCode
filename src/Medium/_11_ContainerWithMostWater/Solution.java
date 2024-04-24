package Medium._11_ContainerWithMostWater;

/*
*   - Ban dc cap mot chieu cao mang so nguyen co do dai n. Co n duong thang dung dc ve sao cho hai diem dau cua
*   duong thang thu i la (i, 0) va (i, height[i])
*   - Tim hai duong thang cung voi truc x tao thanh mot thung chua sao cho thung chua nhieu nuoc nhat
*   - Tra lai luong nuoc toi da ma thung chua co the chua dc
*   VD1: height = [1,8,6,2,5,4,8,3,7] => 49
*   VD2: height = [1,1] => 1
*   - Rang buoc:
*       + n == height.length
*       + 2 <= n <= 10^5
*       + 0 <= height[i] <= 10^4
*/

public class Solution {
    public static int maxArea(int[] height) {
        int max_area = 0;
        int a_pointer = 0;
        int b_pointer = height.length - 1;
        while (a_pointer < b_pointer) {
            if(height[a_pointer] < height[b_pointer]) {
                max_area = Math.max(max_area, height[a_pointer] * (b_pointer - a_pointer));
                a_pointer++;
            } else {
                max_area = Math.max(max_area, height[b_pointer] * (b_pointer - a_pointer));
                b_pointer--;
            }
        }
        return max_area;
    }

    public static void main(String[] args) {
        int[] height = {1,8,6,2,5,4,8,3,7};
        System.out.println("Max: " + maxArea(height));
    }
}
