import java.util.Scanner;

public class FourthTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = new int[5];

        System.out.println(" Введите 5 чисел");
        for (int i = 0; i < numbers.length; i++){
            numbers[i] = scanner.nextInt();
        }
        boolean isSorted = true;
        for (int i = 0; i < numbers.length - 1; i++) {
            if (numbers[i] > numbers[i + 1]) {
                isSorted = false;
                break;
            }
        }
        if (isSorted) {
            System.out.println("Массив отсортирован по возрастанию.");
        } else {
            System.out.println("Массив НЕ отсортирован по возрастанию.");
        }
    }
}
