import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

//5. Найти все p-значные числа из заданной последовательности натуральных чисел, в
//записи которых не повторяются цифры, и подсчитать их количество.


public class Task2 {
    public static void  main(String[] args){

        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(12,22,222,333,13,123,113,122,111,322,311,345,32,33,11,44,45,34,55,24,1024,4321,5555,9876,7457,7,34567));

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите р от 2 до 4 : ");
        int p = scanner.nextInt();
        if (p<2 || p>4){
            System.out.println("Нет таких");
            return;
        }

        int count = 0;

        for(int num: numbers) {
            String numStr = Integer.toString(num);

            if(numStr.length() == p) {
                HashSet<Character> unique = new HashSet<>();
                boolean duplicat = false;
                for(int i=0; i < numStr.length(); i++) {
                    char digit = numStr.charAt(i);

                    if (!unique.add(digit)){
                        duplicat=true;
                        break;
                    }
                }
                if (!duplicat) {
                    count++;
                }
            }
        }
        System.out.print("Количество : " + count);
    }
}
