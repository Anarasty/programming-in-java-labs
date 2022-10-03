import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Введіть матрицю n:");
        int n = sc.nextInt(); //5
        System.out.print("Введіть число k:");
        int k = sc.nextInt(); //2

        int[][] array = new int[n][n];
        for (int i = 0; i < array.length; i++) { //int array
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = ((int) (Math.random() * 20));
            }
        }

        for (int i = 0; i < array.length; i++, System.out.println()) { // print array
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "\t");
            }
        }
        int diagMinuser = array[k][k];
        System.out.println("");
        for (int i = 0; i < array.length; i++) {
            array[i][k] -= diagMinuser;
        }
        for (int i = 0; i < array.length; i++, System.out.println()) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "\t");
            }
        }
    }
}