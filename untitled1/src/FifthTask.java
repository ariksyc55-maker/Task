public class FifthTask {
    static void main(String[] args) {
        final int Length = 25; //
        final int Quantity = 10;
        final int General_Quantity = 1 + Quantity + 1;
        final int Row_width = 2 + Length + 2;
        for (int i = 0; i < General_Quantity; i++) {
            for (int s = 0; s < Row_width; s++) {
                if (s == 0 || s == 1 || s == Row_width - 2 || s == Row_width - 1) {
                    System.out.print('*');}
                else if (i == 0 || i == General_Quantity - 1) {
                    System.out.print('-');}
                else {
                    System.out.print(' ');
                }
            }
            System.out.println();
        }
    }
}