package utility;

public class Matrix {
  public static void printMatrix(int[][] m){
    for (int i = 0; i < m.length; i++){
      for (int j = 0; j < m[i].length; j++){
        System.out.print(m[i][j] + ",");
      }
      System.out.println();
    }
    System.out.println();
  }
}
