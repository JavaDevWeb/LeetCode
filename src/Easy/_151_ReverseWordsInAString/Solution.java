package Easy._151_ReverseWordsInAString;

/*
*   - Cho mot chuoi dau vao s, dao nguoc thu tu cua cac tu
*   - Mot tu dc dinh nghia la mot chuoi cac ky tu khong phai khoang trang. Cac tu trong s se cach nhau
*   it nhat mot dau cach
*   - Tra ve mot chuoi cac tu theo thu tu nguoc dc noi boi mot khoang trang
*   - Luu y rang s co the chua dau cach o dau hoac cuoi hoac nhieu dau cach giua hai tu. Chuoi tra ve
*   chi dc co mot khoang trang ngan cach cac tu. Ko bao gom bat ky khoang trang thua.
*   VD1:  s = "the sky is blue" => "blue is sky the"
*   VD2: s = "  hello world  " => "world hello"
*   - Rang buoc:
*       + 1 <= s.length <= 104
*       + s chua cac chu cai TA (chu hoa va chu thuong), chu so va dau cach
*       + Co it nhat 1 tu trong s
*/

public class Solution {
    public static String reverseWords(String s) {
        String[] words = s.split(" +");
        StringBuffer sb = new StringBuffer();
        for (int i = words.length - 1; i >= 0; i--) {
            sb.append(words[i]);
            sb.append(" ");
        }
        return sb.toString().trim();
    }

    public static void main(String[] args) {
        String s = "the sky is blue";
        System.out.print("Chuoi sau khi dao nguoc la: " + reverseWords(s));
    }
}
