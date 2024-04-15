package Easy._345_ReverseVowelsOfAString;

/*
*   - Cho mot chuoi s, chi dao nguoc tat ca cac nguyen am trong chuoi va tra ve no
*   - Cac nguyen am la 'a', 'e', 'i', 'o' va 'u' va chung co the xuat hien o ca chu thuong va chu in hoa
*   nhieu hon mot lan
*   VD1: s = "hello" => "holle
*   VD2: s = "leetcode" => "leotcede"
*   - Rang buoc:
*           + 1 <= s.length <= 3 * 105
*           + s bao gom cac ky tu ASCII co the in duoc
*/

public class Solution {
    public static String reverseVowels(String s) {
        char[] chars = s.toCharArray();
        String vowels = "aeiouAEIOU";
        int start = 0, end = chars.length - 1;
        while (start < end) {
            while (start < end && vowels.indexOf(chars[start]) == -1) {
                start++;
            }
            while (start < end && vowels.indexOf(chars[end]) == -1) {
                end--;
            }
            char ch = chars[start];
            chars[start] = chars[end];
            chars[end] = ch;
            start++;
            end--;
        }
        return new String(chars);
    }

    public static void main(String[] args) {
        String s = "hello";
        System.out.print("Chuoi sau khi dao nguoc la: " + reverseVowels(s));
    }
}
