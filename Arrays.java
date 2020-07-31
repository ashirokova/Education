// Вывести массив в консоль - 1 вариант

package Task3;

public class Arrays {

    public static void main(String[] args) {
        int[] array;
        array = new int[30];
        for (int i = 0; i < array.length; i++) {
            array[i] = ((int) (Math.random() * 1999) - 999);
            System.out.println(array[i]);
        }

    }
}



