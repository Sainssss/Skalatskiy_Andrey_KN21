import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        int[] array = new int[10];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) array[i] = (int) (Math.random() * 100);
        System.out.println("Масив: " + java.util.Arrays.toString(array));
        System.out.print("Знайти: "); int oldVal = sc.nextInt();
        System.out.print("Замінити на: "); int newVal = sc.nextInt();
        for (int i = 0; i < array.length; i++) if (array[i] == oldVal) array[i] = newVal;
        System.out.println("Результат: " + java.util.Arrays.toString(array));
    }
}
