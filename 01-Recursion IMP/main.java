//path with maximum gold

public class main {
    static int max=0;

    public static void main(String[] args) {
        max=0;
        int[][] grid = {
                { 0, 6, 0 },
                { 5, 8, 7 },
                { 0, 9, 0 }
        };
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] > 0) {
                    dfs(grid, i, j, 0);
                }
            }
        }
        System.out.println(max);
    }
    
    static void dfs(int[][] grid, int i, int j, int ans) {
        if (i < 0 || i > grid.length - 1 || j < 0 || j >= grid[0].length - 1 || grid[i][j] == 0) {
            max=Math.max(ans,max);
            return;
        }

        int gold = grid[i][j];
        grid[i][j] = 0;
        dfs(grid, i + 1, j, ans + gold);
        dfs(grid, i - 1, j, ans + gold);
        dfs(grid, i, j + 1, ans + gold);
        dfs(grid, i, j - 1, ans + gold);
        grid[i][j] = gold;
    }
}
