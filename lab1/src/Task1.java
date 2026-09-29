import java.util.ArrayList;
import java.util.Arrays;

//13. Для каждого числа из заданной последовательности натуральных чисел, найти
//произведение цифр больших 7.
public class Task1 {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(182,77,123,99,5,9,89,890,78,137));

        for ( int num: numbers) {
            int orgNum = num;
            int product = 1;
            boolean greater7 = false;

            while (num>0){
                int digit = num % 10;
                if (digit>7) {
                    product *= digit;
                    greater7= true;
                }
                num /=10;
            }

            if(greater7){
                System.out.println("Для " + orgNum + ": " + product);
            } else {
                System.out.println("Нет таких в " + orgNum);
            }
        }
    }
}