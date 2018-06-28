public class TwoDGoodness {
  public static void main(String[] args) {
    System.out.println("Hmm, what's here?");
    System.out.println("Array size is " + args.length);
    for (String arg : args) {
      System.out.println(arg);
    }
    int numRows = args[0];
    int numCols = args[1];
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