import java.util.Arrays;
import java.util.Random;

public class FirstTask {
    public static void main(String[] args) {
        Random random = new Random();
        int size = 100;
        int[] arrayLottery = new int[size];
        System.out.println("Все числа в массиве: ");

        for (int i = 0; i < arrayLottery.length; i++) {
            arrayLottery[i] = (int) ((Math.random() * 100));
            System.out.print(arrayLottery[i] + " , ");
        }

        System.out.println("Первые 10 чисел массива: ");

        for (int i = 0; i < 10; i++){
            System.out.print(arrayLottery[i] + " , ");
        }
    }
}
