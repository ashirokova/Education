// Массив {-800, -100, -2, 57, 8, 23, 21, 54, 5, 23, 56, 72, 115, 125, 456, 477, 35, 36, 846, 689, -46, -56, 76, 24, 14, 12, 98, 11, -11, -200}
// однозначные числа: 5,8
package Task3;

public class Factorial {
    public static int Factorial(int n){
        int result = 1;
        for (int i = 1; i <=n; i ++){
            result = result*i;
        }

        return result;
    }

    public static void main(String[] args){
        System.out.println("Факториал 5 равен: " + Factorial(5));
        System.out.println("Факториал 8 равен: " + Factorial(8));
    }
}