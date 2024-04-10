package Medium._1249_MinimumRemoveToMakeValidParentheses;

/*
*   - Cho mot chuoi s gom '(',')' va cac ky tu tieng Anh viet thuong
*   - Nhiem vu cua ban la loai bo so luong dau nguoc don toi thieu ('( hoac ')', o bat ky vi tri nao)
*   de chuoi dau ngoac don thu duoc hop le va tra ve bat ky chuoi hop le nao
*   - Ve mat hinh thuc, chuoi dau ngoac don hop le khi va chi khi:
*       + Do la chuoi rong, chi chua cac ky tu thuong hoac
*       + No co the dc viet la AB (A noi voi B), trong do A va B la cac chuoi hop le hoac
*       + No co the dc viet la (A), trong do A la mot chuoi hop le
*   VD1: s = "lee(t(c)o)de)" => "lee(t(c)o)de"
*   VD2: s = "a)b(c)d" => "ab(c)d"
*   - Rang buoc:
*       + 1 <= s.length <= 105
*       + s[i] la (',') hoac chu cai tieng Anh viet thuong
*/

public class Solution {
    public static String minRemoveToMakeValid(String s) {
        StringBuilder sb = new StringBuilder();
        int open = 0;
        for (char c : s.toCharArray()) {
            if(c == '(') {
                open++;
            } else if (c == ')'){
                if(open == 0) continue;
                open--;
            }
            sb.append(c);
        }
        StringBuilder result = new StringBuilder();
        for (int i = sb.length() - 1; i >= 0 ; i--) {
            if(sb.charAt(i) == '(' && open-- > 0) continue;
            result.append(sb.charAt(i));
        }
        return result.reverse().toString();
    }
    public static void main(String[] args) {
        String s = "lee(t(c)o)de)";
        System.out.print("Chuoi s sau khi bo ngoac don la: " + minRemoveToMakeValid(s));
    }
}
