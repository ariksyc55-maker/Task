import java.util.ArrayList;

public class SecondTask {
    public static void main(String[] args) {
        int[] numbers = {1, 3, 5, 7, 2, 4, 8, 6, 0, 9};

        ArrayList<Integer> lessThanFive = new ArrayList<>();
        ArrayList<Integer> fiveAndMore = new ArrayList<>();

        for (int number : numbers) {
            if (number < 5) {
                lessThanFive.add(number);
            } else {
                fiveAndMore.add(number);
            }
        }

        int[] arrayLessThanFive = lessThanFive.stream().mapToInt(i -> i).toArray();
        int[] arrayFiveAndMore = fiveAndMore.stream().mapToInt(i -> i).toArray();

        System.out.print("Числа меньше 5: ");
        for (int num : arrayLessThanFive) {
            System.out.print(num + " ");
        }
        System.out.println();

        System.out.print("Числа 5 и больше: ");
        for (int num : arrayFiveAndMore) {
            System.out.print(num + " ");
        }
    }
}