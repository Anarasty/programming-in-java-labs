import java.util.InputMismatchException;
import java.util.Scanner;
public class lab2Test{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
//        System.out.println("Enter The Number Of Matrix Rows");
//        int matrixRow = scan.nextInt();
//        System.out.println("Enter The Number Of Matrix Columns");
//        int matrixCol = scan.nextInt();
        int matrixRow = 0;
        int matrixCol = 0;

        boolean doubleInputCheck = true;
        do { //ex1
            try {
                System.out.println("Ведіть кількість рядків ");
                matrixRow = scan.nextInt();

                System.out.println("Ведіть кількість стовбців");
                matrixCol = scan.nextInt();
                doubleInputCheck = false;
            } catch (InputMismatchException e) {
                System.err.println("Вы ввели не целое число");
                scan.next();
            }
        } while(doubleInputCheck);

        int[][] matrix = new int[matrixRow][matrixCol];
        enterMatrixData(scan, matrix, matrixRow, matrixCol);
        printMatrix(matrix, matrixRow, matrixCol);

        int n = matrix.length;
        if (n == 0)
            return;

        int diagonalMax = matrix[0][0];

        for (int i = 1; i < n; i++) {
            for (int j = 1; j < n; j++) {
                if (i == j ) {
                    if (matrix[i][j] > diagonalMax && matrix[i][j]%2==0) {
                        diagonalMax = matrix[i][j];
                    }
                }
            }
        }
        if (diagonalMax == matrix[0][0] && diagonalMax%2!=0) { //ex2
            try {
                throw new Exception("немає парних чисел");
            } catch (Exception e) {
                System.err.println(e.getMessage());
            }
        } else { //ex3
            if (diagonalMax == 404) {
                try {
                    throw new FourZeroFourException("404 exception");
                } catch (FourZeroFourException e) {
                   System.err.println(e.getMessage());
                }
            }
            System.out.println("Найбільший елемент головної діагоналі : "
                    + diagonalMax);
        }
    }
    public static void enterMatrixData(Scanner scan, int[][] matrix, int matrixRow, int matrixCol){
        System.out.println("Введіть елементи матриці");

        for (int i = 0; i < matrixRow; i++)
        {
            for (int j = 0; j < matrixCol; j++)
            {
                matrix[i][j] = scan.nextInt();
            }
        }
    }

    public static void printMatrix(int[][] matrix, int matrixRow, int matrixCol){
        System.out.println("Вихідна матриця : ");

        for (int i = 0; i < matrixRow; i++)
        {
            for (int j = 0; j < matrixCol; j++)
            {
                System.out.print(matrix[i][j]+"\t");
            }

            System.out.println();
        }

    }
}