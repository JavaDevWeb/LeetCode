package Easy._118_PascalsTriangle;

import java.util.ArrayList;
import java.util.List;

/*
*   - Cho mot so nguyen numRows, tra ve numRows dau tien cua tam giac Pascal
*   - Trong tam giac pascal, moi so la tong cua hai so ngay phia tren no
*   VD1: numRows = 5 => [[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]
*   VD2: numRows = 1 => [[1]]
*   - Rang buoc:
*       + 1 <= numRows <= 30
*/

public class Solution {
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        if(numRows == 0) return result;
        List<Integer> row = new ArrayList<>();
        row.add(1);
        result.add(row);
        List<Integer> prevRow = row;

        for (int i = 1; i < numRows; i++) {
            List<Integer> currentRow = new ArrayList<>();
            currentRow.add(1);
            for (int j = 1; j < i; j++) {
                currentRow.add(prevRow.get(j) + prevRow.get(j - 1));
            }
            currentRow.add(1);
            result.add(new ArrayList<>(currentRow));
            prevRow = currentRow;
        }
        return result;
    }
    public static void main(String[] args) {
        int numRows = 5;
        System.out.println(generate(numRows));
    }
}
