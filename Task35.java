package Task3;

public class Task35 {
    public static void main(String[] args) {
        int[] myArray = {-800, -100, -2, 57, 8, 23, 21, 54, 5, 23, 56, 72, 115, 125, 456, 477, 35, 36, 846, 689, -46, -56, 76, 24, 14, 12, 98, 11, -11, -200};
        int min = 0;
        int minI = 0;
        for  (int i = 0; i < myArray.length; i++) {
                if (i % 2 == 0 && min > myArray[i] && myArray[i] < -99) {
                    min = myArray[i];
                    minI = i;
                }
                        if (i == myArray.length - 1) {
                            System.out.println("место с четным номером " + minI + " - " + min);

                        }
                    }
                }
            }





