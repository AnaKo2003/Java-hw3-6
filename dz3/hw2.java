// 2. Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее из этого списка.
package dz3;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.IntStream;
import static java.lang.Math.round;
import static java.util.Collections.max;
import static java.util.Collections.min;

public class hw2 {

    public static void main(String[] args) {
        ArrayList<Integer>list1=new ArrayList<>();
        list1.add(1);
        list1.add(4);
        list1.add(5);
        list1.add(7);
        list1.add(11);
        list1.add(9);
        System.out.println(list1);
        int maxim = max(list1);
        System.out.println("max number = " + maxim);
        int minim = min(list1);
        System.out.println("min number = " + minim);

        int summa = 0;
        for (int element : list1) {
            summa += element;
            
        }
        float average = summa/list1.size();
        System.out.println("среднее арифмитическое = " + average);
    }
}