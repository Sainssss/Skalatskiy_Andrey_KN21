import java.util.Random;

class Task1 {
    public static void main(String[] args) {
        int[] array = new int[10];
        int even = 0, odd = 0;
        Random rnd = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = rnd.nextInt(100);
            if (array[i] % 2 == 0) even++; else odd++;
        }
        System.out.println("Масив: " + java.util.Arrays.toString(array));
        System.out.println("Парні: " + even + ", Непарні: " + odd);
    }
}
