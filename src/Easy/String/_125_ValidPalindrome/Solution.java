package Easy.String._125_ValidPalindrome;

/*
*   - Mot cum tu dc goi la palindrome neu, sau khi chuyen tat ca cac chu hoa thanh chu thuong va loai
*   bo tat ca cac ky tu khong phai la chu cai va so, no doc dc cung mot cach tu trai sang phai va tu
*   phai sang trai. Cac ky tu chu cai va so dc goi la ky tu chu so.
*   - Cho mot chuoi s, tra ve true neu no la mot palindrome, nguoc lai tra ve false.
*   VD1: s = "A man, a plan, a canal: Panama" => true
*   VD2: s = "race a car" => false
*   - Rang buoc:
*       + 1 <= s.length <= 2 * 10^5
*       + s chi gom cac ky tu ASCII co the in dc
*/

public class Solution {
    public static boolean isPalindrome(String s) {
        if(s.length() <= 1) return true;
        int st = 0;
        int en = s.length() - 1;
        while (st < en) {
            while (st < en && !Character.isLetterOrDigit(s.charAt(st))) st++;
            while (st < en && !Character.isLetterOrDigit(s.charAt(en))) en--;
            if(st < en && Character.toLowerCase(s.charAt(st)) != Character.toLowerCase(s.charAt(en)))
                return false;
            st++;
            en--;
        }
        return true;
    }
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        System.out.println("Chuoi do la chuoi xuoi nguoc: " + isPalindrome(s));
    }
}
