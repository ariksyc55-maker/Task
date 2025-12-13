import java.util.Scanner;

public class FirstTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[10];
        System.out.println("Введите 10 целых чисел");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println("Вывод не четных индексов, кроме 3 и 5");
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 != 0 && i != 3 && i != 5) {
                System.out.println("Индекс" + i + ";" + arr[i]);
            }
        }
    }
}
