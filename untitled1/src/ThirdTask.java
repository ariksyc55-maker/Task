import java.util.Scanner;

public class ThirdTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите количества чисел: ");
        int n = scanner.nextInt();

        int[] numbers = new int[n];

        System.out.println("Введите " + n + " чисел:");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();

            int sum = 0;
            for (int num : numbers) {
                sum += num;
            }
            double average = (double) sum / numbers.length;
            System.out.println("Среднее значение:" + average);

            scanner.close();
        }
    }
}