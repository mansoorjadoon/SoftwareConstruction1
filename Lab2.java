package lab2;
import java.util.Scanner;

 class Lab2{

  public static void main(String[] args){ //main function starts execution.
      Scanner i = new Scanner(System.in); // input from the user that get number of rows and coumsn and enter the matrx to multiply
      System.out.print("Enter the Number of rows in A matrix\n");
      int rowsA = i.nextInt();
      System.out.print("Enter the number of coulumns in A\n");
      int colsA = i.nextInt();
      System.out.print("Enter the number of rows in B\nNote the number should be equal to the number of Columns in A\n");
      int rowsB = i.nextInt();
      System.out.print("Enter the number of columns in B\n " );
      int colsB = i.nextInt();
      int [][] amatrix = new int [rowsA][colsA];
      int [][] bmatrix = new int [rowsB][colsB];
      
      System.out.print("Please enter the elements in matrix A\n");
      for(int j=0; j<amatrix.length; j++){
          for(int k=0; k<amatrix[0].length; k++){
              amatrix[j][k] = i.nextInt();
          }
      }
      
      System.out.print("Please enter the elements in matrix B\n");
      for(int j=0; j<bmatrix.length; j++){
          for(int k=0; k<bmatrix[0].length; k++){
              bmatrix[j][k] = i.nextInt();
          }
      }

      // multiply function;
      
      int [][] productmatrix = multi(amatrix,bmatrix);
      System.out.print("The Product of 2 matrices you have entered is :\n");
      for (int j = 0; j < productmatrix.length; j++) {
           for (int k = 0; k < productmatrix[0].length; k++) {
               System.out.print(productmatrix[j][k] + " ");
           }
           System.out.println();
       }
  }

       public static int[][] multi(int a[][], int b[][]) {
       int rowsInA = a.length;
       int columnsInA = a[0].length; // same as rows in B
       int columnsInB = b[0].length;
       int[][] c = new int[rowsInA][columnsInB];
       for (int i = 0; i < rowsInA; i++) {
           for (int j = 0; j < columnsInB; j++) {
               for (int k = 0; k < columnsInA; k++) {
                   c[i][j] = c[i][j] + a[i][k] * b[k][j];
               }
           }
       }
       return c;
   }
 }

