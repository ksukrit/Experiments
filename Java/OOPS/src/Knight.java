import java.util.Arrays;

class Knight
{
    // `N × N` chessboard
    public static final int N = 5;

    // Below arrays detail all eight possible movements for a knight.
    // Don't change the sequence of the below arrays
    public static final int[] row = { 2, 1, -1, -2, -2, -1, 1, 2, 2 };
    public static final int[] col = { 1, 2, 2, 1, -1, -2, -2, -1, 1 };

    // Check if `(x, y)` is valid chessboard coordinates.
    // Note that a knight cannot go out of the chessboard
    private static boolean isValid(int x, int y)
    {
        if (x < 0 || y < 0 || x >= N || y >= N) {
            return false;
        }

        return true;
    }

    private static void print(int[][] visited)
    {
//        for (int[] r: visited) {
//            System.out.println(Arrays.toString(r));
//        }
        System.out.println(convertGridToString(visited,visited.length));
        System.out.println();
    }

    public static String convertGridToString(int[][] grid, int n){
        String[] seq = new String[n*n+1];
        String finalAns = "";
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                seq[grid[i][j]-1] = i + "," + j;
            }
        }

        for(String t : seq){
            finalAns += t + "|";
        }
        return finalAns;
    }

    // Recursive function to perform the knight's tour using backtracking
    public static void knightTour(int[][] visited, int x, int y, int pos)
    {
        // mark the current square as visited
        visited[x][y] = pos;

        // if all squares are visited, print the solution
        if (pos >= N*N)
        {
            print(visited);
            // backtrack before returning
            visited[x][y] = 0;
            return;
        }

        // check for all eight possible movements for a knight
        // and recur for each valid movement
        for (int k = 0; k < 8; k++)
        {
            // get the new position of the knight from the current
            // position on the chessboard
            int newX = x + row[k];
            int newY = y + col[k];

            // if the new position is valid and not visited yet
            if (isValid(newX, newY) && visited[newX][newY] == 0) {
                knightTour(visited, newX, newY, pos + 1);
            }
        }

        // backtrack from the current square and remove it from the current path
        visited[x][y] = 0;
    }

    public static void main(String[] args)
    {
        // `visited[][]` serves two purposes:
        // 1. It keeps track of squares involved in the knight's tour.
        // 2. It stores the order in which the squares are visited.
        int[][] visited = new int[N][N];
        int pos = 1;

        // start knight tour from corner square `(0, 0)`
        knightTour(visited, 1, 1, pos);
        int[][] grid = {{25, 14, 9, 4, 23},{8, 1, 24, 15, 10},
                {13, 18, 3, 22, 5},
                {2, 7, 20, 11, 16},
                {19, 12, 17, 6, 21}};
        System.out.println(convertGridToString(grid,5));
    }
}