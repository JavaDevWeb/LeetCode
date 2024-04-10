package Easy._383_RansomNote;

/*
*   - Cho 2 chuoi ransomwareNote va magazine, tra ve true neu co the tao ra sansomwareNote bang
*   cach su dung cac chu cai tu magazine va nguoc lai la false
*   - Moi chu cai trong magazine chi dc su dung mot lan trong ransomwareNote
*   VD1: ransomNote = "a", magazine = "b" => false
*   VD2: ransomNote = "aa", magazine = "aab" => true
*   - Rang buoc:
*       + 1 <= ransomNote.length, magazine.length <= 105
*       + ransomwareNote va magazine bao gom cac chu cai Tieng Anh viet thuong
*/

public class Solution {
    public static boolean canConstruct(String ransomNote, String magazine) {
        int[] arr = new int[26];
        for (int i = 0; i < magazine.length(); i++) {
            int index = magazine.charAt(i) - 'a';
            arr[index]++;
        }
        for (int i = 0; i < ransomNote.length(); i++) {
            int index = ransomNote.charAt(i) - 'a';
            if(arr[index] == 0) {
                return false;
            }
            arr[index]--;
        }
        return true;
    }
    public static void main(String[] args) {
        String ransomNote = "aa";
        String magazine = "aab";
        System.out.println("Co the tao ra chuoi ransomNote bang magazine: " + canConstruct(ransomNote, magazine));
    }
}
