package Easy.String._58_LengthOfLastWord;

/*
*   - Cho mot chuoi s bao gom cac tu va dau cach, tra ve do dai cua tu cuoi cung trong chuoi.
*   - Mot tu la muc toi da chuoi con chi bao gom cac ky tu khong phai khoang trang.
*   VD1: s = "Hello World" => length = 5
*   VD2: s = "   fly me   to   the moon  " => length = 4
*   - Rang buoc:
*       + 1 <= s.length <= 104
*       + s chi thuoc chu cai Tieng Anh va dau cach
*       + Co it nhat 1 tu trong s
*/

public class Solution {
    public static int lengthOfLastWord(String s) {
        String[] words = s.split(" ");
        String lastWord = words[words.length - 1];
        int length = lastWord.length();
        return length;
    }
    public static void main(String[] args) {
        String s = "  Hello2 World  ";
        System.out.println("Do dai cua chuoi cuoi cung la: " + lengthOfLastWord(s));
    }
}
