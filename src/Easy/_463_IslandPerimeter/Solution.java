package Easy._463_IslandPerimeter;

/*
*   - Ban dc cho mot luoi co kich thuoc hang 'x' cot 'y' dai dien cho mot ban do trong do grid[i][j] = 1
*   dai dien cho dat va grid[i][j] = 0 dai dien cho nuoc
*   - Cac o luoi duoc ket noi theo chieu ngang/dung (ko phai theo duong cheo). Luoi hoan toan dc bao boc bao
*   nuoc, va co dung mot hon dao (nghia la mot hoac nhieu o dat dc ket noi)
*   - Hon dao ko co 'ho', nghia la nuoc ben trong ko ket noi voi nuoc xung quanh hon dao. Mot o la mot hinh
*   vuong co do dai canh la 1. Luoi la hinh chu nhat, chieu rong va chieu cao ko vuot qua 100. Xac dinh
*   chu vi cua hon dao.
*   VD1: grid = [[0,1,0,0],[1,1,1,0],[0,1,0,0],[1,1,0,0]] => P = 16
*   VD2: grid = [[1,0]] => P = 4
*   - Rang buoc:
*       + row == grid.length
*       + col == grid[i].length
*       + 1 <= row, col <= 100
*       + grid[i][j] la 0 hoac 1
*       + Co chinh xac 1 hon dao trong luoi
*/

public class Solution {
    public static int islandPerimeter(int[][] grid) {
        int landCount = 0;
        int overlapCount = 0;
        int rows = grid.length;
        int cols = grid[0].length;
        for (int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) {
                if(grid[i][j] == 1) {
                    landCount++;
                    // Phia tren
                    if(i > 0 && grid[i - 1][j] == 1) {
                        overlapCount++;
                    }
                    if(j > 0 && grid[i][j - 1] == 1) {
                        overlapCount++;
                    }
                }
            }
        }
        int perimeter = landCount * 4;
        perimeter -= overlapCount * 2;
        return perimeter;
    }
    public static void main(String[] args) {
        int[][] grid = {
                {0, 1, 0, 0},
                {1, 1, 1, 0},
                {0, 1, 1, 0},
                {1, 1, 0, 0}
        };
        System.out.println("Island perimeter: " + islandPerimeter(grid));
    }
}
