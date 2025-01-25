public class Main {

    // Переменная для цикла
    final static int value = 100;

    /* Метод вычисления кратности, на вход принимает число, если оно без остатка делится на 4
     * метод вернет - true, иначе - false */

    public static boolean function(int x) {

        if (x % 4 == 0) {
            return true;
        } else return false;
    }


    public static void main(String[] args) {

        for (int i = value; i > 0; i--) {
            if (function(i)) {
                System.out.println(i);
            }
        }
    }

}
