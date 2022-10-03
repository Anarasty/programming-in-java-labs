import java.util.*;
public class Task2
{
    public static void main(String[] args)
    {
        System.out.print("Введіть дійсне число X: ");
        double x = Double.parseDouble(new Scanner(System.in).nextLine());
        System.out.print("Введіть кількість елементів масиву N: ");
        int n = Integer.parseInt(new Scanner(System.in).nextLine());

        int[] a = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = ((int)(Math.random() * 20) - 0);
            System.out.println(a[i]);
        }

        double e1 = a[0], e2 = a[1], diff = Math.abs(x - (e1 + e2) / 2);

        for (int i = 0; i < a.length; i++)
        {
            for (int j = i + 1; j < a.length; j++)
            {
                var newDiff = Math.abs(x - (a[i] + a[j]) / 2.0);
                if (newDiff < diff)
                {
                    e1 = a[i];
                    e2 = a[j];
                    diff = newDiff;
                }
            }
        }
        System.out.println("Найближче число до " + x + " буде середне арифметичене чисел: " + e1 + " і " + e2);
    }
}

