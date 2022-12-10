//Пусть дан произвольный список целых чисел, удалить из него четные числа
package dz3;
import java.util.ArrayList;

public class hw1 {
    
        public static void main(String[] args) {
            ArrayList<Integer>list1=new ArrayList<>();
            list1.add(1);
            list1.add(4);
            list1.add(5);
            list1.add(7);
            list1.add(11);
            list1.add(9);
            System.out.println(list1);
            int i = 0;
            while (i<list1.size()){
                if (list1.get(i) %2 ==0){
                    list1.remove(i);
                }
                else{
                    i++;
                }
            }
            System.out.println(list1);
        }
}