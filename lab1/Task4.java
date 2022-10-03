import java.util.Arrays;
import java.util.Scanner;
public class Task4 {
    public static void task4() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введіть число k:");
        int k = sc.nextInt(); //5
        System.out.print("Введіть n:");
        int n = sc.nextInt(); //5
        System.out.print("Введіть m:");
        int m = sc.nextInt(); //9

        int[][] array = initRandomArray(n, m, 150);
        printArray(array);
        int[] maxIndexesIndexes = findMaxIndexes(array);
        multiplyToMaxElementIndexes(array, maxIndexesIndexes, k);
        printArray(array);
    }

    public static int[][] initRandomArray(int n, int m, int randTo) {
        int[][] array = new int[n][m];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = ((int) (Math.random() * randTo));
            }
        }
        return array;
    }

    public static void printArray(int[][] array) {
        for (int i = 0; i < array.length; i++, System.out.println()) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "\t");
            }
        }
    }

    public static int[] findMaxIndexes(int[][] array) {
        int[] maxElementIndexes = new int[]{0, 0};
        int maxI = 0;
        int maxJ = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] > array[maxI][maxJ]) {
                    maxI = i;
                    maxJ = j;
                }
            }
        }
        maxElementIndexes[0] = maxI;
        maxElementIndexes[1] = maxJ;
        System.out.print("Максимальний елемент: значення = " + array[maxI][maxJ] + "; індекс = " + Arrays.toString(maxElementIndexes) + "\n");
        return maxElementIndexes;
    }

    public static int[][] multiplyToMaxElementIndexes(int[][] array, int[] maxElementIndexes, int k) {
        int multiplicationCounter = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i < maxElementIndexes[0] && j < maxElementIndexes[1] && i % 2 == 0 && j % 2 != 0) {
                    int temp = array[i][j];
                    array[i][j] *= k;
                    System.out.println("Перемножений елемент з індексами: i = " + i + "; j = " + j + "; " + temp + " * " + k + " = " + array[i][j]);
                    multiplicationCounter++;
                }
            }
        }
        if (multiplicationCounter == 0) {
            System.out.println("Не буде перемноження. Не задовольняє умовам перемноження");
        }
        return array;
    }

    public static void main(String[] args) {
        task4();
    }

}