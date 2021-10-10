/**
 * ДЗ 1
 * Написать программу, которая выводит на экран числа от 1 до 100.
 * При этом вместо чисел, кратных трем, программа должна выводить слово «Fizz»,
 * а вместо чисел, кратных пяти — слово «Buzz».
 * Если число кратно и 3, и 5, то программа должна выводить слово «FizzBuzz»
 *
 * @author kolod
 */
public class Main {
    public static void main(String[] args) {
        int[] resultArray = countFromTo(1, 100); // создаем массив с числами от 1 до 100
        String fizzBuzzStr = arrayToFizzBuzzString(resultArray); // преобразуем числа кратные 3 и 5 из массива

        System.out.println(fizzBuzzStr);
    }

    /**
     * Создание массива, элементы которого идут по порядку от startOfCount до endOfCount
     * @param startOfCount - число, от которого начинается отсчет
     * @param endOfCount - последний элемент
     * @return массив от startOfCount до endOfCount
     */
    public static int[] countFromTo (int startOfCount, int endOfCount) {
        int sizeOfArray = (endOfCount - startOfCount) + 1;
        int[] resultArray = new int[sizeOfArray];

        resultArray[0] = startOfCount; // задаем стартовый элемент = началу отсчета

        // здесь вписываем в массив числа по порядку
        for (int i = 1; i < sizeOfArray; i++){
            resultArray[i] = resultArray[i - 1] + 1;
        }

        return resultArray;
    }

    /**
     * вместо чисел, кратных трем выводится слово «Fizz»,
     * вместо чисел, кратных пяти — слово «Buzz».
     * Если число кратно и 3, и 5, то выодится слово «FizzBuzz»
     * @param array - массив, который нужно превратить в FizzBuzz
     * @return
     */
    public static String arrayToFizzBuzzString(int[] array){
        String resStr = "";
        int len = array.length; // создаем отдельную переменную для размера, чтобы в цикле каждый раз не пересчитывать

        // в цикле смотрим каждый элемент и проверяем на кратность
        for (int i = 0; i < len; i++){
            int currentEl = array[i];

            if ( (currentEl % 3 == 0) && (currentEl % 5 == 0) ) { // кратен и 3, и 5
                resStr += "FizzBuzz";
            } else if (currentEl % 5 == 0) { // кратен 5
                resStr += "Buzz";
            } else if (currentEl % 3 == 0) { // кратен 3
                resStr += "Fizz";
            } else {
                resStr += currentEl;
            }

            resStr += "\n";
        }

        return resStr;
    }
}
