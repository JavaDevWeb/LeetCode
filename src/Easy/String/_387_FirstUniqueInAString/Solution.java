package Easy.String._387_FirstUniqueInAString;

/*
*   - Cho mot chuoi s, tim kiem ky tu khong lap lai dau tien trong chuoi do va tra ve vi tri cua no.
*   Neu ko ton tai, tra ve -1.
*   VD1: s = "leetcode" => l = 0
*   VD2: s = "loveleetcode" => v = 2
*/
public class Solution {
    public static int firstUniqChar(String s) {
        char[] arr = s.toCharArray();
        int[] count = new int[123];

        for (int i = 0; i < arr.length; i++) {
            char c = arr[i];
            int index = (int)c;
            count[index]++;
        }

        for (int i = 0; i < arr.length; i++) {
            char c = arr[i];
            int index = (int)c;
            if(count[index] == 1) {
                return i;
            }
        }
        
        return -1;
    }
    public static void main(String[] args) {
        String s = "leetcode";
        System.out.println("Vi tri khong lap lai dau tien la: " + firstUniqChar(s));
    }
}
