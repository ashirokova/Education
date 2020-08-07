package Task3;

public class Arrays {

    public static void main(String[] args) {
        System.out.println("1-й пункт задачи");
        int[] myArray = {-800, -100, -2, 57, 8, 23, 21, 54, 5, 23, 56, 72, 115, 125, 456, 477, 35, 36, 8, 689, -46, -56, 76, 24, 14, 12, 98, 11, -11, -200};
        for (int i = 0; i < myArray.length; i++) {
            System.out.println(myArray[i]);
        }
        System.out.println();
        System.out.println("2-й пункт задачи");
        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] > 0 && myArray[i] < 10) {
                int result = 1;
                for (int j = 1; j <= myArray[i]; j++) {
                    result *= j;
                }
                System.out.println(result);
            }

        }
        System.out.println();
        System.out.println("3-й пунк задачи");
        for (int i = 0; i < myArray.length; i++) {
            if ((myArray[i] > 9 && myArray[i] < 100) || (myArray[i] > -9 && myArray[i] < -100)) {
                {
                    if ((myArray[i] % 2 == 0)) {

                        System.out.println("Двузначное четное число " + myArray[i] + " разделенное на 2 " + "= " + myArray[i] / 2);

                    } else {
                        System.out.println("Двузначное нечетное число " + myArray[i] + " умноженное на 3 " + "= " + myArray[i] * 3);

                    }

                }
            }
        }
        System.out.println();
        System.out.println("4-й пунк задачи");
        int max = 0;
        int maxI = 0;
        for (int i = 0; i < myArray.length; i++) {
            if (i % 2 != 0 && max < myArray[i] && myArray[i] > 99) {
                max = myArray[i];
                maxI = i;
            }
            if (i == myArray.length - 1) {
                if (myArray[maxI] == max) {
                    System.out.println("место с нечетным номером " + maxI + " - " + max);
                } else {
                    System.out.println("В массиве не найдено ни одного элемента подходящего под условие ");
                }
            }
        }
        System.out.println();
        System.out.println("5-й пунк задачи");
        int min = 0;
        int minI = 0;
        for (int i = 0; i < myArray.length; i++) {
            if (i % 2 == 0 && min > myArray[i] && myArray[i] < -99) {
                min = myArray[i];
                minI = i;
            }
            if (i == myArray.length - 1) {
                if (myArray[minI] == min) {
                    System.out.println("место с четным номером " + minI + " - " + min);
                } else {
                    System.out.println("В массиве не найдено ни одного элемента подходящего под условие ");
                }
            }
        }
    }
}
