package Easy.String._2490_CircularSentence;

/*
*   - Mot cau la mot danh sach cac tu dc phan tach boi dau cach duy nhat ma ko co dau cach dung dau
*   hoac ket thuc.
*   - Mot cau dc goi la vong tron neu:
*       + Ky tu cuoi cung cua 1 tu bang voi ky tu dau tien cua tu tiep theo.
*       + Ky tu cuoi cung cua tu cuoi cung bang voi tu dau tien cua tu dau tien.
*   VD1: sentence = "leetcode exercises sound delightful" => true.
*   VD2: sentence = "Leetcode is cool" => false.
*   - Rang buoc:
*       + 1 <= sentence.length <= 500.
*       + Cau chi bao gom cac ky tu TA in hoa va in thuong cung dau cach.
*       + Cac tu trong cau dc phan tach boi 1 dau cach duy nhat.
*       + Khong co dau cach du thua o dau hoac cuoi cau.
*/

public class Solution {
    public static boolean isCircularSentence(String sentence) {
        String[] words = sentence.split(" ");
        if(words.length == 1 && sentence.charAt(0) == sentence.charAt(sentence.length() - 1)) {
            return true;
        }
        if(words.length == 1 && sentence.charAt(0) != sentence.charAt(sentence.length() - 1)) {
            return false;
        }
        for (int i = 0; i < sentence.length(); i++) {
            char ch = sentence.charAt(i);
            if(!Character.isLetter(ch) && sentence.charAt(i - 1) != sentence.charAt(i + 1) ||
                    (sentence.charAt(0) != sentence.charAt(sentence.length() - 1))) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String sentence = "leetcode exercises sound delightful";
        System.out.print("Chuoi sentence la mot cau vong tron: " + isCircularSentence(sentence));
    }
}
