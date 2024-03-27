package Easy.Math._9_PalindromeNumber;

/*
*   - Cho so nguyen x, tra ve true neu x la a xuoi nguoc deu giong nhau, va false neu ko giong nhau
*   VD1: x = 121 => true
*   VD2: x = -121 => false
*   - Rang buoc: -2^31 <= x <= 2^31 -1
*/
public class Solution {
    public static boolean isPalindrome(int x) {
        String original = String.valueOf(x);
        String reversed = new StringBuilder(original).reverse().toString();
        return original.equals(reversed);
    }

    public static void main(String[] args) {
        int x = 121;
        System.out.println("So da cho xuoi nguoc giong nhau la: " + isPalindrome(x));
    }
}
