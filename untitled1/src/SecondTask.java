import java.util.Scanner;

public class SecondTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество элементов массива");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("Введите " + n + " чисел:");
        for (i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
    }

}