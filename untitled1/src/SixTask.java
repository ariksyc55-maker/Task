import java.util.Scanner;

public class SixTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        System.out.println("Програма будет удваивать введенное число");
        System.out.println("Для завершения программы введите число 5.");
        do {
            System.out.println("Введите число: ");
            if (scanner.hasNextInt()) {
                n = scanner.nextInt();
                if (n != 5) {
                    int result = n * 2;
                    System.out.println("Ваше число, умноженое на 2: " + result);
                }
                } else {
                System.out.println("Некорректный ввод. Пожалуйста, введите целое число");
                    scanner.next();
                    n = 0;
                }
            } while (n != 5) ;
            System.out.println("Введено число 5. Программа завершенна");
            scanner.close();
        }
    }

