public class Main {

    final static int value = 100;

    public static boolean isMultipleOfFour(int x) {

        return x % 4 == 0;

    }

    public static void main(String[] args) {

        for (int i = value; i > 0; i--) {
            if (isMultipleOfFour(i)) {
                System.out.println(i);
            }
        }
    }

}
