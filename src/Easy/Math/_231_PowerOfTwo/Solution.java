package Easy.Math._231_PowerOfTwo;

/*
*   - Cho mot so nguyen n, tra ve true neu no la luy thua cua hai. Neu ko tra ve false
*   - So nguyen n la luy thua cua 2 neu ton tai so nguyen x sao cho n = 2^x
*   VD1: n = 1 => true (2^0 = 1)
*   VD2: n = 16 => true (2^4 = 16)
*   VD3: n = 3 => false
*   - Rang buoc: -2^31 <= n <= 2^31 - 1
*/

public class Solution {
    public static boolean isPowerOfTwo(int n) {
        if(n <= 0) {
            return false;
        }
        int count = Integer.bitCount(n);
        if(count == 1) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int n = 12;
        System.out.println("So do la luy thua cua 2 la: " + isPowerOfTwo(n));
    }
}
