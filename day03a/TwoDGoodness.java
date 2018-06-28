public class TwoDGoodness {
  public static void main(String[] args) {
    int numRows = 4;
    int numCols = 7;
    int[][] grid = new int[numRows][numCols];
    
    for (int i=0; i < grid.length; i++) {
      for (int j=0; j < grid[0].length; j++) {
        grid[i][j] = (i + j + 1) % 2;
      }
    }
    
    for (int[] row : grid) {
      for (int value : row) {
        System.out.print(value + " ");
      }
      System.out.println();
    }
  }
}