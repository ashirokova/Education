package Task3;

public class Task33 {
    public static void main(String[] args) {
        int[] myArray = {-800, -100, -2, 57, 8, 23, 21, 54, 5, 23, 56, 72, 115, 125, 456, 477, 35, 36, 846, 689, -46, -56, 76, 24, 14, 12, 98, 11, -11, -200};
        {
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
        }
    }
}



