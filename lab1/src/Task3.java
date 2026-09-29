import java.util.ArrayList;
import java.util.Arrays;

//28. Переставить местами в натуральном числе n из заданной последовательности
//чисел, сумма цифр которых чётная, первую и последнюю цифры.

public class Task3 {
    public static void main(String[] args){

        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(123,456,78,19,2024,5,6,872,468,5247,15));
        ArrayList<Integer> result = new ArrayList<>();

        for (int num:numbers){
            int orgNum = num;
            int sumNum = 0;
            int copNum = num;

            while (copNum>0){
                sumNum += copNum%10;
                copNum /= 10;
            }

            if( sumNum % 2 == 0 ){
                String numStr = Integer.toString(num);

                if(numStr.length()>1){
                    char[] chars = numStr.toCharArray();

                    char fn=chars[0];
                    char ln=chars[chars.length-1];

                    chars[0]=ln;
                    chars[chars.length-1]=fn;

                    String swapStr=new String(chars);
                    int resultNum = Integer.parseInt(swapStr);

                    result.add(resultNum);
                } else {
                    result.add(orgNum);
                }
            }else{
                result.add(orgNum);
            }
        }
        System.out.println("Исходный : " + numbers);
        System.out.println("Полученный : " + result);
    }
}
