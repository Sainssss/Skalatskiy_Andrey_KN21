import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Розмір: "); int size = sc.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) array[i] = (int) (Math.random() * 100);
        System.out.println("Масив: " + java.util.Arrays.toString(array));
        System.out.print("1-зростання, 2-спадання: ");
        int choice = sc.nextInt();
        boolean valid = true;
        for (int i = 1; i < size; i++) {
            if ((choice == 1 && array[i - 1] > array[i]) ||
                    (choice == 2 && array[i - 1] < array[i])) {
                valid = false;
                break;
            }
        }
        System.out.println(valid ? "Відповідає" : "Не відповідає");
    }
}
