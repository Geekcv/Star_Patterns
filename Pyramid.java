public class Pyramid {
    public static void main(String[] args) {

        for (int row = 1; row <= 40; row++) {
            for (int col = row; col <= 40; col++) {
                System.out.print(" ");
            }
            // System.out.println(" ");
            for (int col = 1; col <= row; col++) {
                System.out.print("*");
            }
            for (int col = 1; col < row; col++) {
                System.out.print("*");
            }
            System.out.println(" ");

        }

    }
}