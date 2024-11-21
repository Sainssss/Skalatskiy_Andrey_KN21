public class Task2 {
    public static void main(String[] args) {
        int[] angles = {90, 90, 90, 90};
        int sum = 0;
        for (int angle : angles) sum += angle;
        System.out.println(sum == 180 * (angles.length - 2) ? "Існує" : "Не існує");
    }
}
