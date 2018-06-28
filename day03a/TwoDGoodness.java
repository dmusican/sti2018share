public class TwoDGoodness {
  public static void main(String[] args) {
    int[][] grid = new int[3][4];
    
    for (int i=0; i < grid.length; i++) {
      for (int j=0; j < grid[0].length; j++) {
        grid[i][j] = (i + j + 1) % 2;
      }
    }
    
    
  }
}