public class ThreeDim{
 public static void main(String[] args){
  int[][] grid = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
  print2D(grid);
  System.out.println();
  int[][] spreadSheet = new int[5][7];
  print2D(spreadSheet);
  System.out.println();
  String[][] myWords = new String[4][3];
  print2D(myWords);
  System.out.println();
  int[][] gridFour = print2DArr();
  print2D(gridFour);
  System.out.println();
  int[][] gridFive = print2DArr(5);
  print2D(gridFive);
  System.out.println();
  printNicely(11);
 }
 public static void print2D(int[][] a){
  for (int row = 0; row < a.length; row++){
   for (int col = 0; col < a[row].length; col++){
    System.out.print(a[row][col] + " ");
   }
   System.out.println();
  }
 }
 public static void print2D(String[][] a){
  for (int row = 0; row < a.length; row++){
   for (int col = 0; col < a[row].length; col++){
    System.out.print(a[row][col] + " ");
   }
   System.out.println();
  }
 } 
  public static int[][] print2DArr(){
  int[][] answer = print2DArr(4);
  return answer;
  }
  //Overload 
  public static int[][] print2DArr(int n){
   int[][] answer = new int[n][n];
   int counter = 1; 
   for (int row = 0; row <= n - 1; row++){
   for (int column = 0; column <= n - 1; column++){
    answer[row][column] = counter;
    counter++;
   }
  }
  return answer;
  }
  public static void printNicely(int n){
   int[][] grid = print2DArr(n);
   int counter = 1; 
   int spaces;
   if (n >= 10)
    spaces = 2; 
   else
    spaces = 1; 
   for (int dashes = 0; dashes < (spaces + 2) * n + 1; dashes++){
    System.out.print("-");
   }
   System.out.println();
   for (int rows = 1; rows <= n; rows++){
    for (int o = 1; o <= n; o++){
     if (counter < Math.pow(10, spaces)){
       if (counter < 10 && spaces >= 2)
        System.out.print("|" + counter + "  ");
       else
        System.out.print("|" + counter + " ");
      //for (int a = 0; a < spaces; a++)
      // System.out.print(" ");
     }
     else
      System.out.print("|" + counter + "");
     counter++;
   }
   System.out.print("|");
   System.out.println();
   for (int dashes = 0; dashes < (spaces + 2) * n + 1; dashes++){
    System.out.print("-");
   }
   System.out.println();
  }
 }
}